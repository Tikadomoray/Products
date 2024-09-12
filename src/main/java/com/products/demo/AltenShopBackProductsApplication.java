package com.products.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import repository.ProductRepository;
import entity.Product;
import java.util.UUID;

@SpringBootApplication
public class AltenShopBackProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AltenShopBackProductsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		
		return args -> {
			
			//Stoker quelques produits ou bien les ajoutés au niveau de la base de données
			productRepository.save(Product.builder()
					.id(UUID.randomUUID())
					.code("1234").name("souaad").description("description")
					.price(23).quantite(2)
					.inventoryStatus("status")
					.category("category")
					.rating(6)
					.build());
		};
	}
			
}
