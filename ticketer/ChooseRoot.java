
package ticketer;

import java.util.Scanner;

public class ChooseRoot extends TravelLocation
{
    Scanner input = new Scanner(System.in);
    String vehicleName,vehicleType,member,vehicleNo,seatNo,food,ac;
    double foodCost,acCost;
        
    ChooseRoot(){}
    ChooseRoot(int root)
    {
        
        
        switch(root)
        {
            case 1:
            {
                // Bus
                System.out.print("Enter Vehicle Type : Bus");
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
                
                Bus b1 = new Bus(vehicleName,vehicleType,member,vehicleNo,seatNo,ac);
                break;
            }
            
            case 2:
            {
                // Train
                
                System.out.print("Enter Vehicle Type : Train");
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
                
                Train t1 = new Train(vehicleName,vehicleType,member,vehicleNo,seatNo,food,ac);
                break;    
                
            }
            case 3:
            {
                //plane
                
                System.out.print("Enter Vehicle Type : Plane");
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
              
                Plane p1 = new Plane(vehicleName,vehicleType,member,vehicleNo,seatNo,food);
                break;    
     
            }
            case 4:
            {
                // Ship
                
                
                System.out.print("Enter Vehicle Type : Ship");
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
                
                Ship s1 = new Ship(vehicleName,vehicleType,member,vehicleNo,seatNo,food,ac);
                break;    
                
                
                
                
            }
            default:{System.out.println("Choose A Valid Option (1-4)");}
            
      
        }
    }
    
    
}
