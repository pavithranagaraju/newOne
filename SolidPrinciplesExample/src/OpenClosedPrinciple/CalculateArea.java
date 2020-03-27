package OpenClosedPrinciple;

import java.util.Scanner;

public class CalculateArea {
	
	
	public static void main(String[] args) {
		
		Shape shape;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculate Area of \n1.Circle\n2.Rectangle");
		System.out.println("Enter ur choice");
		String s=sc.next();
		if(s.equalsIgnoreCase("circle")){
			 shape=new Circle();
		System.out.print("Area="+shape.calculateArea());
		}
		
		
		else if(s.equalsIgnoreCase("Rectangle"))
		{
			shape=new Rectangle();
			System.out.print("Area="+shape.calculateArea());
		}

			
		else 
			System.out.println("Invalid input");
		
		
	}
}
