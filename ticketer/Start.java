
package ticketer;
import java.util.Scanner;
import java.io.*;
public class Start 
{
    public static void cls() 
    {
        /// For Clear Screen
        try 
        {/// indicates from /c for cmd inheriting the function "cls";
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) 
    {
        
        /*
        1. Login
        2. Registration
        3. TravelLocation
           i) Starting From
           ii) Destination
        4. Choose Root
            i) Bus
           ii) Train
          iii) Plane
           iv) Ship
        5. Confirmation
        6. Payment
        7. Print Ticket
        */
        
       
        
        
    }
 
    
    
    
}
