package br.edu.atitus.currency_service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CurrencyBC",
			url="https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata",
			fallback = CurrencyBCFallback.class)
public interface CurrencyBCClient {
	
	@GetMapping("/CotacaoMoedaDia(moeda=@moeda,dataCotacao=@dataCotacao)?@moeda='{moeda}'&@dataCotacao='10-10-2025'&$format=json")
	CurrencyBCResponse getCurrencyBC(@PathVariable String moeda);
}
