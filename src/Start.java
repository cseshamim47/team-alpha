import java.util.Scanner;

/*
BUG IN RESERVATION LINE 30
BUG IN MAIN METHOD LINE 60
BUG IN RESERVATION LINE 43
*/



public class Start {

    public static void cls() {
        /// For Clear Screen
        try {/// indicates from /c for cmd inheriting the function "cls";
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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
        5. Cost Calculation
        6. Confirmation Payment
        7. Print Ticket
         */
        Reservation r = new Reservation();
        cls();
        System.out.println("Choose Your Root --> ");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Plane");
        System.out.println("4. Ship");
        System.out.print("Enter Your Choice : ");
        int root = input.nextInt();
        cls(); 
        ChooseRoot cr = new ChooseRoot(root);
        cls();
        CostCalculation cc = new CostCalculation();

        System.out.println("Choose Payment Method -->");
        System.out.println("1. Bkash");
        System.out.println("2. Rocket");
        System.out.println("3. Credit/Visa");
        System.out.print("Enter Your Choice : ");
        int choice = input.nextInt();
        //cls();
        Payment p = new Payment(choice);
        cls();
        PrintTicket pt = new PrintTicket();

    }

}
