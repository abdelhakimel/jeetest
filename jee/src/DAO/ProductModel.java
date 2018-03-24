package DAO;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Model.Product;

public class ProductModel {
	public List<Product> getAll()
	{ 
		List<Product> prod=new ArrayList<Product>();
		prod.add(new Product("prod1", "", 10, 100,new Date(2015, 1, 2)));
		prod.add(new Product("prod2", "", 10, 57,new Date(2015, 3, 2)));
		prod.add(new Product("prod3", "", 10, 989,new Date(2015, 7, 2)));
		prod.add(new Product("prod4", "", 10, 500,new Date(2015, 12, 2)));

	
		return prod;
		
	}
	

}
