package org.javaprgms;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import org.java.models.Products;
import org.java.prgms.ProductCatalogInterface;
import org.java.prgms.services.ProductServices;

@WebService
public class ProductCatalog implements ProductCatalogInterface {
   
	ProductServices ps=new ProductServices();
	
	@Override
	public List<String>getProductCatagories()
	{
		return ps.getProductCatagories();
		
	}
	@Override
	public List<String> getProducts(String catagory){
	return ps.getProducts(catagory);
	}
	
	@Override
	public boolean addProduct(String catagory, String product)
	{
		return ps.addProduct(catagory, product);
	}

	@Override
	public List<Products> getProducts2(String catagory) {
		// TODO Auto-generated method stub
		return null;
	}
}