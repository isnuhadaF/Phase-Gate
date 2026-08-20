
account_balance = 50000
transactions = []
deposits = []
withdrawals = []
deposit_amount = 0
withdrawal_amount = 0

def deposit(deposit_amount, account_balance, transactions):
    if deposit_amount > 0:
        account_balance += deposit_amount
    
    return account_balance
    
  
def withdraw(amount, account_balance, transactions):
    if withdrawal_amount <= account_balance:
        account_balance -= withdrawal_amount
        
    return account_balance

#def show_transactions(transactions):

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
                deposits.append(deposit_amount)
            else:
                print("Invalid Amount entered")
            
            
            print("You deposited", deposit_amount, "\nYour new balance is:", account_balance + deposit_amount)            
        case 2:
            withdrawal_amount = input("How much do you want to withdraw?\nNOTE: MINIMUM WITHDRAWAL IS N5,000 ")
            withdrawal_amount = int(withdrawal_amount)
            if withdrawal_amount > 1000 and withdrawal_amount > account_balance :
                withdraw()
            else:
                print("Transaction failed: Insufficient funds")
        #case 3:
        case 4: 
            print("Your closing balance is", account_balance)
            print("Here are your transactions", "\nDeposits: ", deposits, "\nWithdrawals: ", withdrawals)
            #app_open = app_closed
                
main()




