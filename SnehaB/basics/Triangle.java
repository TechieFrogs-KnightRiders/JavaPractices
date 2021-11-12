package com.ts;

public class Triangle {

	int height;
	int base;
	int side;

	public static void main(String[] args) {

		Triangle tObj = new Triangle();
		tObj.clacAreaandMethod();

	}

	Triangle() {

		this.height = 3;
		this.base = 4;
		this.side= 5;
	}

	
	void clacAreaandMethod () {
	
		int area = (this.height * this.base)/ 2;
		System.out.println("area : " + area);
		
		int parameter = this.height * this.base * this.side;
		System.out.println("parameter : "+ parameter);
}
}
