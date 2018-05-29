package com.ja100.training;

public class Car {
	
	private int cost;
	private String brand;
	private String color;
	private static String coname;
	private static int cnt;
	public static  void setConame() {
		Car.coname = "SAP";
//		color = "Blue";
	}
	public String getColor() {
//		a = new ClassA(23);
//		a.strC = "Hello";
		return color;
	

	}
	public static int getOjCnt() {
		return cnt++;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Car(String color, String brand, int cost) throws TooManyCars {
		this.color = color;
		setBrand(brand);
		setCost(cost);
		System.out.println("Deafult COnstructot");
		cnt++;
		if (cnt > 3 ) {
//			try {
				throw new TooManyCars(cnt);
//			} catch (TooManyCars e) {
//				// TODO Auto-generated catch block
//				System.out.println(e.getMessage());
//			}
		}
	}
	protected void finalize() throws Throwable
	{
		cnt--;
	}
	}
	


