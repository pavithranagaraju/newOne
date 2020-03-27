package BankDao;

public class BankAccount {
	 public  static Bank getAccount(String accType){
	      if(accType == null){
	         return null;
	      }		
	      if(accType.equalsIgnoreCase("Savings")){
	         return new SBAccount();
	         
	      } else if(accType.equalsIgnoreCase("Current")){
	         return new CurrentAccount();
	         
	      } 
	      
	      return null;
	   }
}
