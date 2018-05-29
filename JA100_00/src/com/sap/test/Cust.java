package com.sap.test;

import java.util.Comparator;

public class Cust {
private int id;
private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Cust(int id, String name) {
	this.id = id;
	this.name = name;
}

//public int compareTo(Object o) {
//	// TODO Auto-generated method stub
//	return this.id - ((Cust)o).getId();
//}
//@Override
//public int compare(Object o1, Object o2) {
//	// TODO Auto-generated method stub
//	String c1 = ((Cust)o1).getName();
//	String c2 = ((Cust)o2).getName();
//	
//	return c1.compareTo(c2);
//}
}
