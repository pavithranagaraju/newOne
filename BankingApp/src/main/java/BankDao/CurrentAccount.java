package BankDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import dbConnect.DBConnection;

public class CurrentAccount implements Bank {

	public void withdraw() {
		// TODO Auto-generated method stub
		double amount;
		double balance;
		
		Scanner sc = new Scanner(System.in);
		 DBConnection pool = DBConnection.getInstance();
		 Connection conn=pool.getConnection();
		System.out.println("Enter the amount to Deposite");
		amount=sc.nextDouble();
		if(amount>10000000)
		System.out.println("Current Bank Account max withdraw is less than 10000000");
		System.out.println("Enter customer Id");
		int id=sc.nextInt();
		ResultSet rs;
		
		try {
			
			String sql = "select * from bank WHERE cid=?";
			 
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setInt(1, id);
			rs = statement.executeQuery();
			while(rs.next())  

			{
				id=rs.getInt(1);
				balance=rs.getDouble(5);
				if(balance<amount)
					System.out.println("Insufficient funds");
				else
				{
					String sqlu = "UPDATE bank SET balance=? WHERE cid=?";
					 Double d=balance-amount;
					PreparedStatement st = conn.prepareStatement(sqlu);
					st.setDouble(1, d);
					st.setInt(2,id);
					int rowsUpdated = statement.executeUpdate();
					if (rowsUpdated > 0) {
					    System.out.println("Amount withdrawn database updated successfully!");
					}
					else 
						System.out.println("Unable to withdraw");
					
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}

}
