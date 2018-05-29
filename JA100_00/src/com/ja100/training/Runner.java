package com.ja100.training;

import java.util.concurrent.TimeUnit;

public class Runner {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//		
////		Car.coname = "SAP";
//		Car.setConame();
//		
//		Car carObj ;
//		carObj = new Car("RED","BMW",34500);
//		
//		carObj.setColor("red");
//	     carObj.setBrand("BMW");
//	    carObj.setCost(4500);			
//      ClassB bObj = new ClassB(20);
//      bObj.setInta(300);
	      //System.out.println(carObj.getBrand()+" "+carObj.getColor()+" "+carObj.getCost()); 
//		Vechicle vechObj[] = new Vechicle[5];
//		
//		vechObj[0] = new Truck();
//		vechObj[1] = new Van();
//		vechObj[2] = new Truck();
//		vechObj[3] = new Truck();
//		vechObj[4] = new Van();
//	for(int i = 0;i<vechObj.length; i++) {
//		vechObj[i].Meth();
////		vechObj[i].TruckMethod();
//		if (vechObj[i] instanceof Truck) {
//			Truck trk = (Truck)vechObj[i];
////			trk.TruckMethod();
////		}
//		
//		Car obj1 = new Car("red","brmw",4500);
//		Car obj2 = new Car("blue","mer",6700);
//		int cnt = obj1.getOjCnt();
//		System.out.println("Count "+ cnt);
//		obj1 = null;
//		System.gc();
//		try {
//		  Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		cnt = obj1.getOjCnt();
//		System.out.println("Count "+ cnt);

//		TestAbs[] a  = new TestAbs[3];
//	     a[0] = new Class1();
//	     a[1] = new Class2();
//	     a[2] = new Class1();
//	     
//	     for(int i = 0;i <a.length; i++) {
//	    	 a[i].m2();
//	     }
		try {
		Car obj1 = new Car("red","blue",4500);
		Car obj2 = new Car("e2","blue",4500);
		Car obj3 = new Car("e3","blue",4500);
		Car obj4 = new Car("e4","blue",4500);
		Car obj5 = new Car("e5","blue",4500);
		}catch(TooManyCars e) {
		    System.out.println(e.getMessage());
              System.out.println("cause:"+ e.getCause());
		}
		}
	}
		



