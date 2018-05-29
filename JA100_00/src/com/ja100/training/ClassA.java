package com.ja100.training;

public class ClassA {
	
	private int inta;
	private String stra;

	public int getInta() {
		return inta;
	}
	private void setInta(int inta) {
		this.inta = inta;
		System.out.println("Method of Class A");
	}
	public String getStra() {
		return stra;
	}
	public void setStra(String stra) {
		this.stra = stra;
	}
	
	
	public ClassA(int a) {
		System.out.println("Cosntructor of A");
	}
	

}
