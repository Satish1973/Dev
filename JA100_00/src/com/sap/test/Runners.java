package com.sap.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.TreeSet;

public class Runners {
public static void main(String[] args) throws TooMany{

//CallObjs o1 = new CallObjs();
//CallObjs o2 = new CallObjs();
//CallObjs o3 = new CallObjs();
//CallObjs o4 = new CallObjs();
TreeSet tset = new TreeSet();
Cust c = new Cust(1,"Hello");
//tset.add(new Cust(3,"satish"));
//tset.add(new Cust(6,"satish2"));
//tset.add(new Cust(2,"satish3"));
//tset.add(new Cust(6,"satish4"));
//tset.add(new Cust(1,"satish5"));
//
//tset.add(new Cust(7,"satish6"));


Class classObj = c.getClass();
String name = classObj.getName();
System.out.println(name);
int mod = classObj.getModifiers();
System.out.println(mod);
Constructor[] constructors = classObj.getConstructors();
for(Constructor cons:constructors) {
	Class[] parameterTypes = cons.getParameterTypes();
//	parameterTypes[0].
	}
Method[] methods = classObj.getMethods();
for(Method method:methods) {
	System.out.println(method.getName());
}
//Iterator iter = tset.iterator();
//while(iter.hasNext()) {
//	Cust c = (Cust)iter.next();
//	System.out.println(c.getId() + ":"+c.getName());
//}
//}
}
}