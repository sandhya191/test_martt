package org.javaprgms;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.javaprgms.models.Products;

/**
 * 
 * @author Sandhya
 * Product Catalog Interface Of Test Mart project
 *
 */


@WebService
public interface ProductCatalogInterface {
	
	@WebMethod
	public abstract List<String>getProductCatagories();
	
	@WebMethod
	public abstract List<String> getProducts(String catagory);
	
	@WebMethod
	public abstract boolean addProduct(String catagory, String product);
	
	@WebMethod
	public abstract List<Products> getProducts2(String catagory);

}