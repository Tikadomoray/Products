package service;

import org.springframework.stereotype.Service;

import entity.Product;
import repository.ProductRepository;

@Service
public class ProductService {

	
	private ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		
		this.productRepository = productRepository;
		
	}
public Product updateProductByCode( int id, String code) {
		
	
	Product product = productRepository.findById(id);
	product.setCode(code);
		
		return productRepository.save(product);
			
	}

public Product saveProduct(
		String code,  String name,
		String description, int price,int quantite,String inventoryStatus,
		String category,int rating
		) {
	
	Product product = Product.builder()
			.code(code)
			.name(name)
			.description(description)
			.price(price)
			.quantite(quantite)
			.inventoryStatus(inventoryStatus)
			.category(category)
			.rating(rating)
			.build();
	return productRepository.save(product);
}
}
