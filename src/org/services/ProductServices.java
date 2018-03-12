package org.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

/**
 * 
 * @author Sandhya
 * Product Service of Book List
 *
 */

@WebService
public class ProductServices {
	
	List<String> booklist=new ArrayList<>();
	List<String> paperslist=new ArrayList<>();
	
	public ProductServices()
	
	{
		booklist.add("science");
		booklist.add("maths");
		
		paperslist.add("telangana");
		paperslist.add("enadu");
	}
	
	public List<String> getProductCatagories()
	{
		
		List<String> catagories=new ArrayList<>();
		catagories.add("Books");
		catagories.add("papers");
		catagories.add("pencils");
		return catagories;
	}
	public List<String> getProducts(String catagory)
	{
		switch(catagory.toLowerCase())
		{
		case "books":
			return booklist;
		case "papers":
			return paperslist;
		
		}
		return null;
	}
	
	public boolean addProduct(String catagory, String product)
	{
		switch(catagory.toLowerCase())
		{
		case "books":
			booklist.add(product);
			break;
		case "papers":
		    paperslist.add(product);
		    break;
		    default:
		    	return false;
		
		}
		return true;
	}


}
