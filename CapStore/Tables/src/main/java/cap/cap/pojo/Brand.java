package cap.cap.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Brand {
	
	
	@Id
	@GeneratedValue
	private int brand_id;
	private String brand_name;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="category_id_FK")
	private Category category;
	
	public Brand(){}
	

	public Brand(String brand_name) {
		super();
		this.brand_name = brand_name;
		
	}
	
	public Brand(String brand_name,  Category category) {
		super();
		this.brand_name = brand_name;
		this.category = category;
	}
	
	public Brand(int brand_id, String brand_name, Category category) {
		super();
		this.brand_id = brand_id;
		this.brand_name = brand_name;
		this.category = category;
	}

	

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	



	public int getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	@Override
	public String toString() {
		return "Brand [brand_id=" + brand_id + ", brand_name=" + brand_name + ", category=" + category + "]";
	}
	
	
	

}
