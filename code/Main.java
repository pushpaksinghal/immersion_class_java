package immersion_classes;

import java.util.*;

public class Main {
	public static void main(String[] args) {
//		System.out.print("Welcome to Bridgelabz!");
		Scanner sc =new Scanner(System.in);
		//Add two numbers
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		System.out.println(n+m);
		
		//Celsius to Fahrenheit Conversion
//		double cel = sc.nextDouble();
//		System.out.println(fah(cel));
		
		//Area of a circle
//		double rad = sc.nextDouble();
//		System.out.println(area(rad));
		
		// Volume of a Cylinder
//		double rad = sc.nextDouble();
//		double height = sc.nextDouble();
//		System.out.println(vol(rad,height));
		
		//Calculate Simple Interest
//		double prin = sc.nextDouble();
//		double rate = sc.nextDouble();
//		double time = sc.nextDouble();
//		System.out.println(simpleint(prin,rate,time));
		
		//Perimeter of a Rectangle
		
//		double height = sc.nextDouble();
//		double width = sc.nextDouble();
//		System.out.println(para(height,width));
		
		//power
//		double base = sc.nextDouble();
//		double expo = sc.nextDouble();
//		System.out.println(power(base,expo));
		
		//avg of 3 no.
//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double c = sc.nextDouble();
//		System.out.println(avg(a,b,c));
		
		//Convert Kilometers to Miles
		double c = sc.nextDouble();
		System.out.println(convertktom(c));
		
	}
	
	public static double fah(double cel) {
		double feh = (cel*1.8)+32;
		return feh;
	}
	public static double area(double rad) {
		double areacir = 3.14*(Math.pow(rad, 2));
		return areacir;
	}
	public static double vol(double rad,double height) {
		double vol = 3.14*height*(Math.pow(rad, 2));
		return vol;
	}
	public static double simpleint(double prin, double rate,double time) {
		return (prin*time*rate)/100;
	}
	public static double para(double height,double widht) {
		return 2*(height+widht);
	}
	public static double power(double base,double expo) {
		return Math.pow(base, expo);
	}
	public static double avg(double a,double b,double c) {
		return (a+b+c)/3;
	}
	public static double convertktom(double c) {
		return c*0.621371;
	}
}
