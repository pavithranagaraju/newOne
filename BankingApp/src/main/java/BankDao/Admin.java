package BankDao;

import java.util.Scanner;

public class Admin {
public static void main(String[] args) {
	int id;
	String type;
	double amount;
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Hello admin");
	System.out.println("1.Deposite\n 2.withdraw");
	System.out.println("Enter your choice");
	c=sc.nextInt();
	switch(c){
	case 1:
		Deposite d=new Deposite();
		d.depo();
		break;
	case 2:
		System.out.println("Enter account type \n Enter only Savings or Current");
		type=sc.next();
		Bank b=BankAccount.getAccount(type);
		b.withdraw();
	}
}
}
