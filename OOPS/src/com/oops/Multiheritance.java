package com.oops;

class Audi extends Car{
	void color() {
		System.out.println("Audi Color is Black.");
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
class BMW extends Car{
	void color() {
		System.out.println("BMW Color is Pink.");
	}
	
}
class Tesla extends Car{
	void color() {
		System.out.println("Tesla Color is White.");
	}
}

public class Multiheritance {

	public static void main(String[] args) {
		Audi a = new Audi();
		BMW b = new BMW();
		Tesla t = new Tesla();
		
		a.color();
		b.color();
		t.color();

	}

}