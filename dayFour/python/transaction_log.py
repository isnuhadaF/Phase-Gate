
account_balance = 50000
account_balance = int(account_balance)
transactions = []
deposits = []
withdrawals = []
deposit_amount = 0
withdrawal_amount = 0

def deposit(deposit_amount, account_balance, transactions):
    account_balance = account_balance + deposit_amount
    deposits.append(deposit_amount)
    
    return account_balance
    
  
def withdraw(withdrawal_amount, account_balance, transactions):
    account_balance = account_balance - withdrawal_amount
    withdrawals.append(withdrawal_amount)
        
    return account_balance

def show_transactions(transactions):
    print('DEPOSITS: ', deposits)
    print('WITHDRAWALS: ', withdrawals)


def main():

  input("Press ENTER to open the app: ")
  app_open = True
  app_closed = False
  while app_open:
    main_menu = """
        PLEASE SELECT AN OPTION
        
        1. Deposit
        2. Withdrawal
        3. Show Transactions
        4. Exit   
    """
    print(main_menu)
    main_menu_options = int(input())
    match(main_menu_options):
        case 1:
            deposit_amount = input("Enter your deposit amount: ")
            deposit_amount = int(deposit_amount)
            if deposit_amount > 0:
                deposit(deposit_amount, account_balance, transactions)
            else:
                print("Invalid deposit amount entered")
            
            
            print("You deposited", deposit_amount, "\nYour new balance is:", account_balance + deposit_amount)            
        
        case 2:
            withdrawal_amount = input("How much do you want to withdraw?\nNOTE: MINIMUM WITHDRAWAL IS N1,000 ")
            withdrawal_amount = int(withdrawal_amount)
            if  withdrawal_amount <= account_balance:
                if withdrawal_amount > 1000:
                    withdraw(withdrawal_amount, account_balance, transactions)
                else:
                    print("Withdrawal Amount is below the minimum.\nPlease enter a valid amount")
            else:
                print("Transaction failed: Insufficient funds")
            print("You withdrew", withdrawal_amount, "\nYour new balance is:", account_balance - withdrawal_amount)  
            
        case 3:
            show_transactions(transactions)
        case 4: 
            print("Your closing balance is", account_balance)
            print("Here are your transactions", "\nDeposits: ", deposits, "\nWithdrawals: ", withdrawals)
            app_open = app_closed
                
main()




