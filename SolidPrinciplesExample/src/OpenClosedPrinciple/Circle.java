package OpenClosedPrinciple;

import java.util.Scanner;

public class Circle implements Shape
{
public double radius;
public double calculateArea()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius");
	radius=sc.nextDouble();
return (22/7)*radius*radius;
}
}