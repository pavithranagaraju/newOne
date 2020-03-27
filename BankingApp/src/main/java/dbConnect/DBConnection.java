package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;



	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBConnection {

	    private final static int MAX_CONNECTIONS = 8;
	    private static DBConnection instance = null;  // lazy loading
	    private static Connection[] connections = new Connection[MAX_CONNECTIONS];
	   // private static String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe","NTTDATA","NTTDATA";
	    private static int counter;

	    private DBConnection() { }

	    public static DBConnection getInstance() {
	        if(instance == null) {
	            synchronized(DBConnection.class) {
	                if(instance == null) {
	                    instance = new DBConnection();
	                    initializeConnections();
	                    counter = 0;
	                }
	            }
	        }

	        return instance;
	    }

	    private static void initializeConnections() {
	        for(int i = 0; i < MAX_CONNECTIONS; i++) {
	            try {
	            	Class.forName("oracle.jdbc.driver.OracleDriver");  
	                connections[i] = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NTTDATA","NTTDATA");
	            } catch (SQLException e) {
	                e.printStackTrace();
	            } catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    }

	    public static Connection getConnection() {
	        counter++;
	        if(counter == Integer.MAX_VALUE)
	            counter = 0;

	        return connections[counter%MAX_CONNECTIONS];
	    }
	   

	}