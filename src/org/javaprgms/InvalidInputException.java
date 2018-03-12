package org.javaprgms;

/**
 * 
 * @author Sandhya
 * Invalid Input Exception in Soap services
 *
 */

public class InvalidInputException extends Exception {
	
private String errorDetails;
	
	public InvalidInputException(String reason,String errorDetails)
	{
		super(reason);
		this.errorDetails=errorDetails;
		
	}
     public String getFaultInfo()
     {
    	 return errorDetails;
     }

}
