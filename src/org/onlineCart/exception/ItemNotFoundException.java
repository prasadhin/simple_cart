package org.onlineCart.exception;

public class ItemNotFoundException extends Exception{
	public ItemNotFoundException(){}
	public ItemNotFoundException(String msg){
		super(msg);
	}
}
