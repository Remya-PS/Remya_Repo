package cap.cap.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Stock {
	@Id
	@GeneratedValue
	private int stock_id;
	private int no_of_items;
	
	
}
