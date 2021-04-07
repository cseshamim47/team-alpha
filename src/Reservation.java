
import java.util.Scanner;

public class Reservation extends ChooseRoot
{
    ChooseRoot cr = new ChooseRoot();
    
    TravelLocation tl = new TravelLocation();
    
    Scanner input = new Scanner(System.in);
    String passengerName, passengerPhone, departureDate;
    String startingFrom,destination,returnTicket,returnDate;
    int passengerAge;
    double returnCost;
    
    public Reservation(){}
    public Reservation(int i)
    {
        Scanner input = new Scanner(System.in);
        Scanner inputs = new Scanner(System.in);
        Scanner inputx = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        passengerName = input.nextLine();
        
        System.out.print("Enter Your Age : ");
        passengerAge = input.nextInt();
        /*if(passengerAge <= 16 && passengerAge>=60)
        {
            ////// implement of an decrease in money 200/-
        }*/
        
        System.out.print("Enter Departure Date : ");              /// BUG HERE
        departureDate = inputs.nextLine();
        
        System.out.println("Enter Departure From : ");
        //startingFrom = input.nextLine();
        tl.startLocation();
        
        System.out.println("Enter Your Destination : ");
        //destination = input.nextLine();
        tl.endLocation();
        
        System.out.print("Apply for Return Ticket? (Y/N) : ");
        returnTicket = inputs.nextLine();
        returnTicket.toLowerCase();                       //// BUG HERE
        if(returnTicket.equals('y'))
        {
            // 2 * total Cost
            returnCost = ((cr.travelCost+cr.foodCost+cr.acCost));
            System.out.print("Enter Return Date : ");
            returnDate = inputx.nextLine();
        }
        
        
        
        System.out.println("-----------------------------------");
        System.out.println("|     THANKS FOR RESERVATION       |  ");
        System.out.println("-----------------------------------");
    
    
    
    
    
    
    }
}
