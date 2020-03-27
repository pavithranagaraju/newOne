package BankDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import dbConnect.DBConnection;

public class Deposite {

	public void depo(){
		int r=0;
		Scanner sc = new Scanner(System.in);
		DBConnection pool = DBConnection.getInstance();
		 Connection conn=pool.getConnection();
		 String sqlu = "UPDATE bank SET balance=balance+? WHERE cid=?";
		 System.out.println("Enter the customer ID");
		 int id=sc.nextInt();
		 System.out.println("Enter amount");
		 
		 double amount=sc.nextDouble();
		 try
		 {
		PreparedStatement st = conn.prepareStatement(sqlu);
		st.setDouble(1, amount);
		st.setInt(2,id);
		 r = st.executeUpdate();
		if (r > 0) {
		    System.out.println("Amount deposited  successfully!");
		}
		else 
			System.out.println("Unable to deposite");
		 }
		 
		 catch(Exception e)
		 {
			 System.out.println("Unable to deposite amount");
		 }
		
		
	}
}
