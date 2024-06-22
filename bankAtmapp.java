package shruu;

import java.lang.*;

import java.util.Scanner;
import java.io.*;
// Bank ATM Application
class ATM
{
    private int accno;
    private int amount;

    ATM(int accno)
    {
        this.accno=accno;
        this.amount=0;
    }
    void deposit(int amount)
    {
        if(amount<0)
            System.out.println("Invalid amount");
        else
            this.amount+=amount;
        System.out.println("Amount deposited in : " +this.accno);
    }
    void withdrwal(int amount)
    {
        if(amount<0 || amount>this.amount)
            System.out.println("Invalid amount or Insufficient balance");
        else
        {
            this.amount-=amount;
            System.out.println("Amount withdrwal from : " +this.accno);
        }
    }
    void checkBalance()
    {
        System.out.println("Account No : " + this.accno);
        System.out.println("Current balance : " +this.amount);
    }
}
public class nhfhj
{
    public static void main(String args[])
    {
        int i;
        Scanner scan=new Scanner(System.in);

      //  String ch=
        System.out.println("Enter password: ");
       // Console C=System.console();
       // password=new String(ch);
        String password=scan.nextLine();
        if(password.equals("1111"))
        {
            int choice,amt,account;
            System.out.println("Enter account no: ");
            account=scan.nextInt();

            ATM A=new ATM(account);
            do
            {
                System.out.println("-----------BANK ATM-----------------------------------------");
                System.out.println("1.Depoist");
                System.out.println("2.Withdrwal");
                System.out.println("3.Check Balance");
                System.out.println("4.Exit");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("\nEnter your choice");

                choice= scan.nextInt();
                switch(choice)
                {
                    case 1:

                        System.out.println("Enter amount for deposit");
                        amt= scan.nextInt();
                        A.deposit(amt);
                        break;

                    case 2:

                        System.out.println("Enter amount for Withdrwal");
                        amt= scan.nextInt();
                        A.withdrwal(amt);
                        break;
                    case 3: A.checkBalance();break;
                    case 4:System.exit(0);
                }
            }while(choice!=4);
        }
        else
            System.out.println("Invalid password");
    }
}