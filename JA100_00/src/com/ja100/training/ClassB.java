package com.ja100.training;

public class ClassB extends ClassA {
	private int intb;
	private String strb;
	public int getIntb() {
		return intb;
	}
	public void setIntb(int intb) {
		this.intb = intb;
		setInta(intb);
	}
	public String getStrb() {
//		strC  = "test";

		return strb;
	}
	public void setStrb(String strb) {
		this.strb = strb;
	}
	
	public void setInta(int a) {
//		super.setInta(10);
		System.out.println("Overriden in Class B");
	}
	
	
   public ClassB(int a) {
	   super(a);
	   System.out.println("Class B constructor");
	   
   }
	
}
