package cap.cap.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class CategoryTestClass {

public static void main(String[] args) {
		
		//Configuration
		AnnotationConfiguration config=new AnnotationConfiguration();
		config.addAnnotatedClass(Category.class);
		config.addAnnotatedClass(Brand.class);
		config.addAnnotatedClass(Product.class);
		config.addAnnotatedClass(Merchant.class);
		
		config.configure();
		
		//Re-create the schema EveryTime
		new SchemaExport(config).create(true, true);
		
		//Session Factory
		SessionFactory factory= config.buildSessionFactory();
		
		//Session and Transaction
		Session session=factory.openSession();
		session.beginTransaction();
		
		Category category=new Category("Electronics");
		Category category1=new Category("Furniture");
		Category category2=new Category("KitchenWare");

		Merchant merchant=new Merchant("ABC");
		
		Merchant merchant1=new Merchant("XYZ");
		Merchant merchant2=new Merchant("pqr");
		
		Brand brand1=new Brand("Philips",category);
		
		Brand brand2=new Brand("Bajaj",category);
		Brand brand3=new Brand("German",category2);
		Brand brand4=new Brand("Nirmal",category1);
		Brand brand5=new Brand("Sansui",category1);
		Brand brand6=new Brand("Creative",category1);
		Brand brand7=new Brand("Samsung",category);
		Brand brand8=new Brand("LG",category);
		Brand brand9=new Brand("Morphan Richrds",category1);
		Brand brand10=new Brand("Onida",category);
		Brand brand11=new Brand("Orpat",category2);
		Brand brand12=new Brand("Tupperware",category2);
		Date date=new Date("12-mar-2016");
		
		Product product=new Product("Mobile", "ahdgadsaer", 4536213.0, date, 453, brand1, category2, merchant);
		System.out.println(product);
		session.save(brand1);
		session.save(brand2);
		session.save(brand3);
		session.save(brand4);
		session.save(brand5);
		session.save(brand6);
		session.save(brand7);
		session.save(brand8);
		session.save(brand9);
		session.save(brand10);
		session.save(brand11);
		session.save(brand12);
		session.save(product);
		session.getTransaction().commit();
		session.close();
		
	}
	
	
	
}
