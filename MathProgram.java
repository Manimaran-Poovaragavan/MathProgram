package com.java.project;
import java.util.Scanner;
public class MathProgram {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the x value");
		int x;
		x = sc.nextInt();
		System.out.println("enter the y value");
		int y;
		y = sc.nextInt();
		
		
		System.out.println("addition value ="+Math.addExact(x,y));
		System.err.println("subtraction value ="+Math.subtractExact(x, y));
		System.out.println("multiplication value ="+ Math.multiplyExact(x, y));
		System.out.println("devition value ="+Math.divideExact(x, y));
		System.out.println("modulo value ="+(x%=y));
		System.out.println("precedence value="+ x*x/y+x*y/x);

		
		System.out.println("enter the float value" );
		float a;
		a=sc.nextFloat();
		float b;
		b=sc.nextFloat();
		
		
		System.out.println("math.abs value ="+Math.abs(b));
		 System.out.println("Math.ceil value ="+Math.ceil(b));
		 System.out.println("math.floor value ="+Math.floor(b));
		 System.out.println("math.floor value ="+Math.floorDiv(x, y));
		 System.out.println("math.min value ="+Math.min(a, b));
		 System.out.println("math.max value ="+Math.max(a, b));
		 System.out.println("math.round value ="+Math.round(b));
		 System.out.println("math.random ="+Math.random());
		System.out.println("math.exp value ="+Math.exp(b));
		System.out.println("math.log value ="+Math.log(a));
		System.out.println("math.log10 value ="+Math.log10(a));
		System.out.println("math.pow value ="+Math.pow(a, b));
		System.out.println("math.sqrt value ="+Math.sqrt(a));
		
		
		
		
	System.out.println("enter the double value");
	double m;
	m=sc.nextDouble();
	double n;
	n=sc.nextDouble();
	
	System.out.println("math.PI value = "+Math.PI);
	System.out.println("math.sin value ="+Math.sin(n));
	System.out.println("math.cos value ="+Math.cos(m));
	System.out.println("math.tan value ="+Math.tan(m));
	System.out.println("math.asin value ="+Math.asin(n));
	System.out.println("math.acos value ="+Math.acos(m));
	System.out.println("math.atan value ="+Math.atan(n));
	System.out.println("math.atan2 valu ="+Math.atan2(m, n));
	System.out.println("math.sinh value ="+Math.sinh(m));
	System.out.println("math.cosh value ="+Math.cosh(n));
	System.out.println("math.tanh value ="+Math.tanh(n));
	System.out.println("math.todegrees value ="+Math.toDegrees(m));
	System.out.println("math.toradians value ="+Math.toRadians(n));
	
	
	
	
	}
	
}