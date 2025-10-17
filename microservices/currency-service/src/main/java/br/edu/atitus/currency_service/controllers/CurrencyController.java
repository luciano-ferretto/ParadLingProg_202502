package br.edu.atitus.currency_service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.currency_service.clients.CurrencyBCClient;
import br.edu.atitus.currency_service.clients.CurrencyBCResponse;
import br.edu.atitus.currency_service.entities.CurrencyEntity;
import br.edu.atitus.currency_service.repositories.CurrencyRepository;

@RestController
@RequestMapping("currency")
public class CurrencyController {
	
	private final CurrencyRepository repository;
	private final CurrencyBCClient currencyBCClient;
	private final CacheManager cacheManager;
	
	@Value("${server.port}")
	private int serverPort;

	public CurrencyController(CurrencyRepository repository, CurrencyBCClient currencyBCClient, CacheManager cacheManager) {
		super();
		this.repository = repository;
		this.currencyBCClient = currencyBCClient;
		this.cacheManager = cacheManager;
	}
	
	@GetMapping("/{value}/{source}/{target}")
	public ResponseEntity<CurrencyEntity> getConversion(
			@PathVariable double value,
			@PathVariable String source,
			@PathVariable String target) throws Exception{
		
//		CurrencyEntity currency = repository.
//				findBySourceAndTarget(source, target)
//				.orElseThrow(() -> new Exception("Currency not found"));
		
		source = source.toUpperCase();
		target = target.toUpperCase();
		String dataSource = "None";
		String keyCache = source + target;
		String nameCache = "CurrencyCache";
		
		CurrencyEntity currency = cacheManager.getCache(nameCache).get(keyCache, CurrencyEntity.class);
		
		if (currency != null) {
			dataSource = "Cache";
		} else {
			currency = new CurrencyEntity();
			currency.setSource(source);
			currency.setTarget(target);
			
			if (source.equals(target)) {
				currency.setConversionRate(1);
			} else {
				try {
					double sourceRate = 1;
					double targetRate = 1;
					if (!source.equals("BRL")) {
						CurrencyBCResponse resp = currencyBCClient.getCurrencyBC(source);
						if (resp.getValue().isEmpty()) throw new Exception();
						sourceRate = resp.getValue().
								get(resp.getValue().size() - 1).getCotacaoVenda();
					}
					if (!target.equals("BRL")) {
						CurrencyBCResponse resp = currencyBCClient.getCurrencyBC(target);
						if (resp.getValue().isEmpty()) throw new Exception();
						targetRate = resp.getValue().
								get(resp.getValue().size() - 1).getCotacaoVenda();
					}
					currency.setConversionRate(sourceRate/targetRate);
					dataSource = "API BCB";
				} catch (Exception e) {
					currency = repository.
							findBySourceAndTarget(source, target)
							.orElseThrow(() -> new Exception("Currency not found"));
					dataSource = "Local Database";
				}
			}
			
			cacheManager.getCache(nameCache).put(keyCache, currency);
		}
		
		
		
		currency.setConvertedValue(value * currency.getConversionRate());
		currency.setEnviroment("Currency running in port: " + serverPort
								+ " - Source: " + dataSource);
		
		
		return ResponseEntity.ok(currency);
		
	}
	
	
	

}
