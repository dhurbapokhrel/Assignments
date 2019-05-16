package assignments;

import java.util.Scanner;

public class MethodOverLoding {

	public static void main(String[] args) {
		try {
			MethodOverLoding mo = new MethodOverLoding();  
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter 6 values.");
			int a = sc.nextInt();
			int b=sc.nextInt();
			float x =sc.nextFloat();
			float e = sc.nextFloat();
			float f = sc.nextFloat();
			float d = sc.nextFloat();
			mo.calculateArea(x);
			mo.calculateArea(a, b);
			mo.calculateArea(e, f, d);
		} catch (Exception e) {
			System.out.println("This is not a valid input.");
			e.printStackTrace();
		}

	}

	public void calculateArea(float x) {

		float area =  (float) (Math.PI*x);            
		System.out.println("The are of circle is "+area);
	}	
	public void calculateArea( float e, float f, float d) {

		float qube = e*f*d;
		System.out.println("The Qube of an Qubic is "+qube);      

	}
	public void calculateArea(int a, int b) {

		int area =a*b;
		System.out.println("The Area of  a rectangle is "+area);      

	}
}