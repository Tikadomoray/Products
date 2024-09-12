package web;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import repository.ProductRepository;
import service.ProductService;

@RestController
@CrossOrigin("*")
public class ProductRestController {

	
	private ProductRepository productRepository;
	private ProductService productService;
	
	
	
	public ProductRestController(ProductRepository productRepository,ProductService productService ) {
		
		this.productRepository = productRepository;
		this.productService = productService;
		
	}
	
	@GetMapping(path = "/products")
	public List<Product> allPayment() {
		
		return productRepository.findAll();
	}
	
	@GetMapping(path = "/product/{id}")
	public Product getProductById(@PathVariable int id) {
		
		return productRepository.findById(id);
	}
	
	@PatchMapping("/product/{id}")
	public Product updateProductByCode(@PathVariable int id,@RequestParam String code) {
		
		return this.productService.updateProductByCode(id, code);
			
	}
	
	@PostMapping(path = "/product")
	public Product savePayment(@RequestParam String code, @RequestParam String name
			, @RequestParam String description,@RequestParam int price,
			@RequestParam int quantite, @RequestParam String inventoryStatus,
			@RequestParam String category,@RequestParam int rating)  {
		
		return this.productService.saveProduct(code, name, description, price,
				quantite,inventoryStatus,category,rating);

	}
}
