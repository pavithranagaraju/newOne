package OpenClosedPrinciple;

import java.util.Scanner;

public class Rectangle implements Shape
{
double length;
double width;
public double calculateArea()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length and width");
length=sc.nextDouble();
width=sc.nextDouble();
return length * width;
}
}