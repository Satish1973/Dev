package com.sap.test;

public abstract class ImplClass {

	public ImplClass() {
		System.out.println("Constructor of ImplClass");
	}
	
	public abstract void m1();
    public void m2() {
    	System.out.println("Normal Method");
    }
}
