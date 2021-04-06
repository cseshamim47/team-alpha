
package ticketer;

import java.util.Scanner;

public class Payment 
{
    String accountNumber;
    
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
                
                System.out.println("-----------------------------------");
                System.out.println("|        PAYMENT SUCCESSFUL !!!    | ");
                System.out.println("-----------------------------------");
    
            }
            
            case 2:
            {
                /// Rocket
                System.out.print("Enter Rocket Number : ");
                accountNumber = input.nextLine();
                
                System.out.println("-----------------------------------");
                System.out.println("|        PAYMENT SUCCESSFUL !!!    | ");
                System.out.println("-----------------------------------");
    
            }
            
            case 3:
            {
                /// Credit Card
                System.out.print("Enter Credit Card Number : ");
                accountNumber = input.nextLine();
                
                System.out.println("-----------------------------------");
                System.out.println("|        PAYMENT SUCCESSFUL !!!    | ");
                System.out.println("-----------------------------------");
    
            }
            default:{System.out.println("Choose A Valid Option (1-3)");}
            
            
        }
        
        
        
    }
    
    
    
}
