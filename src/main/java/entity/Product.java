package entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Product {
	
	@Id
	private int id;
	private String code;
	private String name;
	private String description;
	private int price;
	private int quantite;
	private String inventoryStatus;
	private String category;
	private String image;
	private int rating;

}
