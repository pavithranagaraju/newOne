package com.nttdata;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 5  car names");
		    ArrayList<String> cars = new ArrayList<String>();
		    for(int i=0;i<5;i++)
		    cars.add(sc.next());
		    System.out.println("The 5 Cars are");
		    System.out.println(cars);
		  }

}
