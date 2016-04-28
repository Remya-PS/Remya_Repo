package cap.cap.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Generated;

@Entity
public class Category {
	

	@Id
	@GeneratedValue
	private int category_id;
	private String category_name;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,
			targetEntity=Brand.class,mappedBy="category")
	private List<Brand> brands;
	
	
	
	//no argument constructors
	public Category(){}
	
	public Category(String category_name) {
		super();
		this.category_name = category_name;
	
	}


	public Category(String category_name, List<Brand> brands) {
		super();
		this.category_name = category_name;
		this.brands = brands;
	}


	
	
	//parameterized constructor
	


	public Category(int category_id, String category_name, List<Brand> brands) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.brands = brands;
	}

	//getters and setters
	

	




	public int getCategory_id() {
		return category_id;
	}








	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}





	public String getCategory_name() {
		return category_name;
	}





	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}





	public List<Brand> getBrands() {
		return brands;
	}





	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}
	
	
	//toString() method
	
	
	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", category_name=" + category_name + ", brands=" + brands + "]";
	}



	
}
