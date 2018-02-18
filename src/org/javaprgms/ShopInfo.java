package org.javaprgms;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;



@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {

	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput")String property)throws InvalidInputException
	{
		String responce="Invalid property";
		if("shopName".equals(property))
		{
			responce="Test Mart";
			
		}else if("since".equals(property))
		{
			responce="since 2013";
		}
		else
		{
			throw new InvalidInputException("Invalid Input",property+"is not valid input");
		}
		return responce;
	}
}
