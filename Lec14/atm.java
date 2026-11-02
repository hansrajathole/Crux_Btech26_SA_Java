package Lec14;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int balance = 5000;
        Scanner sc = new Scanner(System.in);
        int n ;

        do{

            System.out.println("enter 1 for deposit");
            System.out.println("enter 2 for withdraw");
            System.out.println("enter 3 for check balance");

            n = sc.nextInt(); 
            int amount;
            switch (n) {
                case 1:
                    System.out.println("enter deposit amount :");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("now your balance : "+balance);
                    
                    break;
                case 2 :
                    System.out.println("enter withdraw amount :");
                    amount = sc.nextInt();
                    if(amount<= balance){
                        balance -= amount;
                        System.out.println("current balance : "+balance);
                        System.out.println("withdraw successfully...");
                    }else{
                        System.out.println("you enter invalid amound");
                    }
                    break;
                case 3 :
                    System.out.println("current balance : "+balance);
                    break;
                default:
                    System.out.println("you entered invalid choice");
                    break;
            }


            System.out.println("if you want to continue, press any key");
            System.out.println("if you want to exit, press 0");
            n = sc.nextInt(); 
        }while(n!= 0);
    }
}
