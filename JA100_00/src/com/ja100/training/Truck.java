package com.ja100.training;

public class Truck extends Vechicle {
private String truck;

public void Meth() {
	System.out.println("Overridden in Truck");
}
public void TruckMethod() {
	System.out.println("My Own Truck method");
}
public String getTruck() {
	return truck;
}
public void setTruck(String truck) {
	this.truck = truck;
}
	
}
