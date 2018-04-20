package com.basics.oop;

public class VariableOverload {

	public static void main(String[] args) {
		
		B b = new B();
		C c = new C();
		//b = c;
		//C c = (C) b;
		System.out.println(b.name);
		//c.print();

	}

}
