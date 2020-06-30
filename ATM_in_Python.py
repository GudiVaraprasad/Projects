print("Welcome to GVP's ATM")
restart=('Y')
chances=3
balance=9999.12
while chances>=0:
    pin=int(input("Please enter your 4 digit pin: "))
    if pin==1234:
        print("You entered your pin correctly.")
        print("Please proceed for further Transactions...")
        print("----------------------------------------------------------------------")
        print("Please press 1 to check balance.")
        print("Please press 2 to make a withdrawl.")
        print("Please press 3 to Pay-in.")
        print("Please press 4 to return card.\n")
        print("----------------------------------------------------------------------")
        while restart not in ('n','NO','No','N','no','nO'):
            print("You entered your pin correctly.")
            print("Please press 1 to check balance.")
            print("Please press 2 to make a withdrawl.")
            print("Please press 3 to Pay-in.")
            print("Please press 4 to return card.\n")
            print("----------------------------------------------------------------------")
            
            option=int(input("Please choose an option as above: "))
            
            if option==1:
                print("You have choosen to view your Balance.")
                print("Your Account Balance is: $",balance)
                restart=int(input("Would you like to go back ?: "))
                if restart in ('n','NO','No','N','no','nO'):
                    print("Thank You for visiting. Have a good day !")
                    print("----------------------------------------------------------------------")
                    break
                
            elif option==2:
                option2=('y')
                print("You have choosen WITHDRAWL option.")
                withdrawl=float(input("How much would you like to withdraw ?: 10 20 40 50 60 80 100 200 500 1000 for other enter 1: "))
                if withdrawl in [10, 20, 40, 50, 60, 80, 100, 200, 500, 1000]:
                    balance=balance-withdrawl
                    print("\nYour current Account Balance is: $",balance)
                    restart=int(input("Would you like to go back ?: "))
                    if restart in ('n','NO','No','N','no','nO'):
                        print("Thank You for visiting. Have a good day !")
                        print("----------------------------------------------------------------------")
                        break
                        
            elif option==3:
                option3=('y')
                print("You have choosen PAY-in option.")
                payin=float(input("Please enter an amount to add to your account: "))
                if withdrawl in [10, 20, 40, 50, 60, 80, 100, 200, 500, 1000]:
                    balance=balance+payin
                    print("\nYour current Account Balance is: $",balance)
                    restart=int(input("Would you like to go back ?: "))
                    if restart in ('n','NO','No','N','no','nO'):
                        print("Thank You for visiting. Have a good day !")
                        print("----------------------------------------------------------------------")
                        break
            
            elif option==4:
                print("You have choosen to remove your card.")
                print("Please wait the whilist your card is returned....\n")
                print("You can now remove your card.")
                print("Thank You for visiting. Have a good day !")
                print("----------------------------------------------------------------------")
                break
            
            else:
                print("INVALID option entered!!!! Please choose an option again: \n")
                print("----------------------------------------------------------------------")
                restart=('Y')
    
    elif pin != 1234:
        print("INVALID pin entered. Please check the pin and try again.")
        chances=chances-1
        print("You are left with ",chances,"attempts now")
        print("----------------------------------------------------------------------")
        if chances==0:
            print("You have entered your pin wrong thrice.")
            print("\nNo more tries now.")
            print("Your card will be blocked temporarily for 48 hours. Please contact the GVP Bank administration for help !!")
            print("Thank You for visiting. Have a good day !")
            print("----------------------------------------------------------------------")
            break
                
            
