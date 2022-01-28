package com.apple;


import java.util.Scanner;

class BankingApplication {
public static void main(String[]args)
        {
                BankAccount obj=new BankAccount("Java MicroProject","Ankit-910");
                obj.ShowMenu();
        }
}
class BankAccount{
         int Balance;
         int previousTransaction;
         String CustomerName;
         String CustomerID;

       BankAccount(String cname,String cid){
               CustomerName=cname;
               CustomerID=cid;

      }



         void Deposit(int amount){
                 if (amount !=0){
                         Balance=Balance+amount;
                         previousTransaction=amount;
                 }
         }
         void withdraw(int amount){
                 if (amount !=0){
                         Balance=Balance-amount;
                         previousTransaction=-amount;
                 }

         }
         void getPreviousTransaction(){
                 if (previousTransaction>0){
                         System.out.println("Deposited :"+previousTransaction);
                 }
                 else if (previousTransaction<0){
                         System.out.println("Withdraw :"+Math.abs(previousTransaction));
                 }
                 else{
                         System.out.println("No Transaction Occured.");
                 }

         }
         void ShowMenu(){

               char option= '\0';
               Scanner scanner=new Scanner(System.in);

                 System.out.println("****---- WELCOME to My "+CustomerName+"-[Banking System]-----******");
                 System.out.println("Your Id:"+CustomerID);
                 System.out.println("\n");

                 System.out.println("1. : Check Your Balance");
                 System.out.println("2. : Deposit");
                 System.out.println("3. : Withdraw");
                 System.out.println("4. : Previous Transaction");
                 System.out.println("5. : Exit The System");
                 do {

                         System.out.println("---------------------------------------------------------------------");
                         System.out.println("Enter Your Option");
                         System.out.println("---------------------------------------------------------------------");
                         option=scanner.next().charAt(0);
                         System.out.println("\n");
                         switch (option){
                                 case '1':
                                         System.out.println("-------Check Your Balance-------");
                                         System.out.println("Balance ="+Balance);
                                         System.out.println("**********************************");
                                         System.out.println("\n");
                                         break;
                                 case '2':
                                         System.out.println("-------------------------");
                                         System.out.println("Enter Amount to Deposit");
                                         System.out.println("**********************************");
                                         int amount=scanner.nextInt();
                                         Deposit(amount);
                                         System.out.println("\n");
                                         break;
                                 case '3':
                                         System.out.println("-------------------------");
                                         System.out.println("Enter Amount to withdraw ");
                                         System.out.println("**********************************");
                                         int amount2=scanner.nextInt();
                                         withdraw(amount2);
                                         System.out.println("\n");
                                         break;
                                 case '4':
                                         System.out.println("-------------------------");
                                         getPreviousTransaction();
                                         System.out.println("-------------------------");
                                         System.out.println("\n");
                                         break;
                                 case '5':
                                         System.out.println("--------------------------");
                                         break;

                                 default:
                                         System.out.println("You Have Entered Invalid Option! Please Enter Correct option");
                                         break;
                         }
                 }while (option !='5');
                 System.out.println("Thank You For Using Our Services.");
         }


}

