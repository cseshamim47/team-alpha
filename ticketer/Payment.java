
package ticketer;

import java.util.Scanner;

public class Payment 
{
    String accountNumber;
    Payment()
    {
        /*
        System.out.println("Choose Payment Method -->");
        System.out.println("1. Bkash");
        System.out.println("2. Rocket");
        System.out.println("3. Credit/Visa");
        System.out.print("Enter Your Choice : ");
        */
    }
    
    Payment(int choice)
    {
        Scanner input = new Scanner(System.in);
        
        switch(choice)
        {
            case 1:
            {
                /// BKash
                System.out.print("Enter BKash Number : ");
                accountNumber = input.nextLine();
                
                 
                System.out.println("Confirm? (Y/N)");
                String confirm = input.nextLine();
                confirm = confirm.toLowerCase();
                if(confirm.equals("y"))
                {
                System.out.println("-----------------------------------");
                System.out.println("|        PAYMENT SUCCESSFUL !!!    | ");
                System.out.println("-----------------------------------");
                }
    
            }
            
            case 2:
            {
                /// Rocket
                System.out.print("Enter Rocket Number : ");
                accountNumber = input.nextLine();
                
                 
                System.out.println("Confirm? (Y/N)");
                String confirm = input.nextLine();
                confirm = confirm.toLowerCase();
                if(confirm.equals("y"))
                {
                System.out.println("-----------------------------------");
                System.out.println("|        PAYMENT SUCCESSFUL !!!    | ");
                System.out.println("-----------------------------------");
                }
    
            }
            
            case 3:
            {
                /// Credit Card
                System.out.print("Enter Credit Card Number : ");
                accountNumber = input.nextLine();
                
                System.out.println("Confirm? (Y/N)");
                String confirm = input.nextLine();
                confirm = confirm.toLowerCase();
                if(confirm.equals("y"))
                {
                
                System.out.println("-----------------------------------");
                System.out.println("|        PAYMENT SUCCESSFUL !!!    | ");
                System.out.println("-----------------------------------");
                }
    
            }
            default:{System.out.println("Choose A Valid Option (1-3)");}
            
            
        }
        
        
        
    }
    
    
    
}
