package com.HAH.ioc.bean;

public class StaticFactory {
	
	public static MyClient createStatic(){
		return new MyClient();
	}

}
