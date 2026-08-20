import java.util.Scanner;

public class TransactionLog {
	static Scanner input = new Scanner(System.in);
	
	public static void main() {
	
	double account_balance = 50000;
	String transactions = "+N";
	
	
	//App Entry point
	System.out.println("Press enter to open the app ");
	input.nextLine();
	
	
	boolean in_App = true;
	  while(in_App)
	    {
	    String main_menu = """
	       PLEASE SELECT AN OPTION
        
        1. Deposit
        2. Withdrawal
        3. Show Transactions
        4. Exit
	    """;
	    System.out.println(main_menu);
	    int main_menu_choice = input.nextInt();
	    
	    switch(main_menu_choice)
	      {
	        case 1->
	          {
	            System.out.println("Your current balance is: " + account_balance);
	            System.out.println("Enter your deposit amount below: ");
	            double depositAmount = input.nextDouble();	
	            double depositCaller = deposit(depositAmount, account_balance, transactions);
	            
	          }
	        case 2->
	          {
	            System.out.println("Your current balance is: " + account_balance);
	            System.out.println("How much do you want to withdraw? ");
	            double withdrawalAmount = input.nextDouble();
	            double withdrwalCaller = withdrawal(withdrawalAmount, account_balance, transactions);
	          }
	        case 3->
	          {
	            boolean in_Show_Transactions = true;
	            while(in_Show_Transactions)
	              {
	                String showTransactionsCaller = showTransactions(transactions);
	              }
	          }
	        case 4-> 
	          {
              //in_App = false;
              while(in_App)
                {
                  System.out.println("Your new account balance is: " + account_balance);
	                System.out.println("Thank you for using Transaction Log App!");
	                
	                break;
                }         
	          }
	      }
	    }
	
	}
	
	//Deposit
	public static double deposit(double depositAmount, double account_balance, String transactions) 
	{
	  if(depositAmount > 0)
	    {
	      account_balance += depositAmount;
	    }
	return account_balance;
	}
	
	//Withdrawal
	public static double withdrawal(double withdrawalAmount, double account_balance, String transactions) 
	{
	  if(withdrawalAmount <= account_balance) 
	    {
	      account_balance -= withdrawalAmount;
	    }
	return account_balance;
	}
	
	//Show Transactions
	public static String showTransactions(String transactions) 
	{
	  if(transactions == " ")
	    {
	      
	      
	    }  else { System.out.println(transactions); }
	
	return transactions;
	}
}
