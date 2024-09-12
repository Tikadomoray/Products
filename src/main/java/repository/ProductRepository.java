package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	Product findByCode(String code);
	Product findById(int id);

}
