import java.util.Scanner;

public class ChooseRoot extends TravelLocation
{
    
    String vehicleName,vehicleType,member,vehicleNo,seatNo,food,ac;
    double foodCost,acCost;
        
    ChooseRoot()
    {
        /*
        System.out.println("Choose Your Root --> ");
        System.out.println("1. Bus");
        System.out.println("2. Train");
        System.out.println("3. Plane");
        System.out.println("4. Ship");
        System.out.print("Enter Your Choice : ");
        */
    }
    ChooseRoot(int root)
    {
        Scanner input = new Scanner(System.in);
        
        switch(root)
        {
            case 1:
            {
                // Bus
                System.out.println("Enter Vehicle Type : Bus");
                vehicleType = "Bus";
               
                System.out.print("Enter Respective Company Name : ");
                vehicleName = input.nextLine();
                
                System.out.print("Enter member amount : ");
                member = input.nextLine();
                
                System.out.print("Enter Vehicle Number : ");
                vehicleNo = input.nextLine();
                
                System.out.print("Enter Seat Number : ");
                seatNo = input.nextLine();
                
                System.out.print("AC/Non-AC (Y/N) : ");
                ac = input.nextLine();
                ac = ac.toLowerCase();
                
                if(ac.equals('y'))
                {
                    ///// implement of an increase in money 800/-
                    acCost = 800;
                }
                System.out.print("Confirm?? (Y/N) : ");
                String confirm = input.nextLine();
                confirm = confirm.toLowerCase();
                if(confirm.equals("y"))
                {
                Bus b1 = new Bus(vehicleName,vehicleType,member,vehicleNo,seatNo,ac);
                System.out.println("----------------------------------------------");
                System.out.println("               TICKET CONFIRMED !!            |");
                System.out.println("----------------------------------------------");
                }
                break;
            }
            
            case 2:
            {
                // Train
                
                System.out.println("Enter Vehicle Type : Train");
                vehicleType = "Train";
               
                System.out.print("Enter Respective Company Name : ");
                vehicleName = input.nextLine();
                
                System.out.print("Enter member amount : ");
                member = input.nextLine();
                
                System.out.print("Enter Vehicle Number : ");
                vehicleNo = input.nextLine();
                
                System.out.print("Enter Seat Number : ");
                seatNo = input.nextLine();
                
                System.out.print("Food/Without-Food (Y/N) : ");
                food = input.nextLine();
                food = food.toLowerCase();
                
                if(food.equals('y'))
                {
                    ///// implement of an increase in money 500/-
                    foodCost = 500;
                }
                
                System.out.print("AC/Non-AC (Y/N) : ");
                ac = input.nextLine();
                ac = ac.toLowerCase();
                
                if(ac.equals('y'))
                {
                    ///// implement of an increase in money 800/-
                    acCost = 800;
                }
                
                System.out.print("Confirm?? (Y/N) : ");
                String confirm = input.nextLine();
                confirm = confirm.toLowerCase();
                if(confirm.equals("y"))
                {
                Train t1 = new Train(vehicleName,vehicleType,member,vehicleNo,seatNo,food,ac);
                System.out.println("----------------------------------------------");
                System.out.println("               TICKET CONFIRMED !!            |");
                System.out.println("----------------------------------------------");
                }
                
                
                break;    
                
            }
            case 3:
            {
                //plane
                
                System.out.println("Enter Vehicle Type : Plane");
                vehicleType = "Plane";
               
                System.out.print("Enter Respective Company Name : ");
                vehicleName = input.nextLine();
                
                System.out.print("Enter member amount : ");
                member = input.nextLine();
                
                System.out.print("Enter Vehicle Number : ");
                vehicleNo = input.nextLine();
                
                System.out.print("Enter Seat Number : ");
                seatNo = input.nextLine();
                
                System.out.print("Food/Without-Food (Y/N) : ");
                food = input.nextLine();
                food = food.toLowerCase();
                
                if(food.equals('y'))
                {
                    ///// implement of an increase in money 500/-
                    foodCost = 500;
                }
              
                System.out.print("Confirm?? (Y/N) : ");
                String confirm = input.nextLine();
                confirm = confirm.toLowerCase();
                if(confirm.equals("y"))
                {
                Plane p1 = new Plane(vehicleName,vehicleType,member,vehicleNo,seatNo,food);
                System.out.println("----------------------------------------------");
                System.out.println("               TICKET CONFIRMED !!            |");
                System.out.println("----------------------------------------------");
                }
                
                
                
                break;    
     
            }
            case 4:
            {
                // Ship
                
                
                System.out.println("Enter Vehicle Type : Ship");
                vehicleType = "Ship";
               
                System.out.print("Enter Respective Company Name : ");
                vehicleName = input.nextLine();
                
                System.out.print("Enter member amount : ");
                member = input.nextLine();
                
                System.out.print("Enter Vehicle Number : ");
                vehicleNo = input.nextLine();
                
                System.out.print("Enter Seat Number : ");
                seatNo = input.nextLine();
                
                System.out.print("Food/Without-Food (Y/N) : ");
                food = input.nextLine();
                food = food.toLowerCase();
                
                if(food.equals('y'))
                {
                    ///// implement of an increase in money 500/-
                    foodCost = 500;
                }
                
                System.out.print("AC/Non-AC (Y/N) : ");
                ac = input.nextLine();
                ac = ac.toLowerCase();
                
                if(ac.equals('y'))
                {
                    ///// implement of an increase in money 800/-
                    acCost = 800;
                }
                
                
                System.out.print("Confirm?? (Y/N) : ");
                String confirm = input.nextLine();
                confirm = confirm.toLowerCase();
                if(confirm.equals("y"))
                {
                Ship s1 = new Ship(vehicleName,vehicleType,member,vehicleNo,seatNo,food,ac);
                System.out.println("----------------------------------------------");
                System.out.println("               TICKET CONFIRMED !!            |");
                System.out.println("----------------------------------------------");
                }
                
                
                break;    
                
                
                
                
            }
            default:{System.out.println("Choose A Valid Option (1-4)");}
            
      
        }
    }
    
    
}
