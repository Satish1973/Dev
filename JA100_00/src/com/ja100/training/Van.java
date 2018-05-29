package com.ja100.training;

public class Van extends Vechicle {
private String vanStr;

public void Meth() {
	System.out.println("Overridden in Van Class");
	
}
public void VanMethod() {
	System.out.println("Vans own method");
}
public String getVanStr() {
	return vanStr;
}
public void setVanStr(String vanStr) {
	this.vanStr = vanStr;
}
}
