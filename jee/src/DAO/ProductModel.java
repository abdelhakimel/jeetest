package DAO;

import java.util.ArrayList;
import java.util.List;

import Model.Product;

public class ProductModel {
	public List<Product> getAll()
	{ 
		List<Product> prod=new ArrayList<Product>();
		prod.add(new Product("prod1", "", 10, 100));
		prod.add(new Product("prod2", "", 10, 57));
		prod.add(new Product("prod3", "", 10, 989));
		prod.add(new Product("prod4", "", 10, 500));


	
		return prod;
		
	}
	

}
