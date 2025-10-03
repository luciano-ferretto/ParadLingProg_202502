package br.edu.atitus.product_service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.product_service.entities.ProductEntity;
import br.edu.atitus.product_service.repositories.ProductRepository;

@RestController
@RequestMapping("products")
public class OpenProductController {
	
	private final ProductRepository repository;

	public OpenProductController(ProductRepository repository) {
		super();
		this.repository = repository;
	}
	
	@Value("${server.port}")
	private int serverPort;
	
	@GetMapping("/{idProduct}/{targetCurrency}")
	public ResponseEntity<ProductEntity> getProduct(
			@PathVariable Long idProduct,
			@PathVariable String targetCurrency
 			) throws Exception {
		
		ProductEntity product = repository.findById(idProduct)
				.orElseThrow(() -> new Exception("Product not found"));
		
		product.setEnviroment("Product-service running on Port: " + serverPort);
		product.setConvertedPrice(product.getPrice()); //MOCK => testes
		
		return ResponseEntity.ok(product);
	}

}
