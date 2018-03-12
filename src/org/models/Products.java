package org.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * @author Sandhya
 * Details about Product
 *
 */

@XmlRootElement(name="Product")
@XmlType(propOrder={"price","sku","name"})
public class Products {
	
	private String name;
	private String sku;
	private double price;
	
	public Products(String name,String sku,double price)
	{
		this.name=name;
		this.sku=sku;
		this.price=price;
	}

    @XmlElement(name="ProductName")
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getSku()
	{
		return sku;
	}
	public double price()
	{
	    return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
}
