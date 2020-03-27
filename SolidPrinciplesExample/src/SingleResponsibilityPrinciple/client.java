package SingleResponsibilityPrinciple;

import java.util.Scanner;

public class client {
public static void main(String[] args) {
	double radius;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radius of circle to calculate area");
	radius=sc.nextDouble();
	circle c=new circle();
	System.out.print("Radius="+c.calcArea(radius));
	sc.close();
	
	
	
}
}
