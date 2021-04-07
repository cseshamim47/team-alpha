
import java.util.Scanner;
import java.io.File;

public class TravelLocation 
{
    Scanner input = new Scanner(System.in);
    double travelCost;
    int start,end;
    
    TravelLocation(){}

    
    public void startLocation()
    {
       
        // 64 zilla
        try
        {
            File file = new File("DataBase/TravelLocation.txt");
            Scanner scanner = new Scanner(file);
            int flag = 1;
            while(scanner.hasNext())
            {
                String zilla1 = scanner.next();
                String zilla2 = scanner.next();
                String zilla3 = scanner.next();
                String zilla4 = scanner.next();
                String zilla5 = scanner.next();
                
                
                System.out.println(zilla1+" "+zilla2+" "+zilla3+" "+zilla4+" "+zilla5);
                 
            }
            scanner.close();
        }
        catch(Exception e)
        {
            //System.out.println(e);
        }
        
            
        System.out.print("Enter Starting Point(number) : ");
        start = input.nextInt();
        //return start;
    }
    
    public void endLocation()
    {
       
        // 64 zilla
        
        try
        {
            File file = new File("DataBase/TravelLocation.txt");
            Scanner scanner = new Scanner(file);
            int flag = 1;
            while(scanner.hasNext())
            {
                String zilla1 = scanner.next();
                String zilla2 = scanner.next();
                String zilla3 = scanner.next();
                String zilla4 = scanner.next();
                String zilla5 = scanner.next();
                
                
                System.out.println(zilla1+" "+zilla2+" "+zilla3+" "+zilla4+" "+zilla5);
                 
            }
            scanner.close();
        }
        catch(Exception e)
        {
            //System.out.println(e);
        }
        
        System.out.print("Enter Destination Point(number) : ");
        end = input.nextInt();
        //return end;
    }
    public double travelCost()
    {
        if(start==end)
        {
            return travelCost = 200;
        }
        else
        {
            switch(end)
            {
                case 1:{return travelCost = 600;}
                case 2:{return travelCost = 600;}
                case 3:{return travelCost = 600;}
                case 4:{return travelCost = 600;}
                case 5:{return travelCost = 600;}
                case 6:{return travelCost = 600;}
                case 7:{return travelCost = 600;}
                case 8:{return travelCost = 600;}
                case 9:{return travelCost = 600;}
                case 10:{return travelCost = 600;}
                case 11:{return travelCost = 700;}
                case 12:{return travelCost = 700;}
                case 13:{return travelCost = 700;}
                case 14:{return travelCost = 700;}
                case 15:{return travelCost = 700;}
                case 16:{return travelCost = 700;}
                case 17:{return travelCost = 700;}
                case 18:{return travelCost = 700;}
                case 19:{return travelCost = 700;}
                case 20:{return travelCost = 700;}
                case 21:{return travelCost = 800;}
                case 23:{return travelCost = 800;}
                case 24:{return travelCost = 800;}
                case 25:{return travelCost = 800;}
                case 26:{return travelCost = 800;}
                case 27:{return travelCost = 800;}
                case 28:{return travelCost = 800;}
                case 29:{return travelCost = 800;}
                case 30:{return travelCost = 800;}
                case 31:{return travelCost = 900;}
                case 32:{return travelCost = 900;}
                case 33:{return travelCost = 900;}
                case 34:{return travelCost = 900;}
                case 35:{return travelCost = 900;}
                case 36:{return travelCost = 900;}
                case 37:{return travelCost = 900;}
                case 38:{return travelCost = 900;}
                case 39:{return travelCost = 900;}
                case 40:{return travelCost = 900;}
                case 41:{return travelCost = 1000;}
                case 42:{return travelCost = 1000;}
                case 43:{return travelCost = 1000;}
                case 44:{return travelCost = 1000;}
                case 45:{return travelCost = 1000;}
                case 46:{return travelCost = 1000;}
                case 47:{return travelCost = 1000;}
                case 48:{return travelCost = 1000;}
                case 49:{return travelCost = 1000;}
                case 50:{return travelCost = 1000;}
                case 51:{return travelCost = 1100;}
                case 52:{return travelCost = 1100;}
                case 53:{return travelCost = 1100;}
                case 54:{return travelCost = 1100;}
                case 55:{return travelCost = 1100;}
                case 56:{return travelCost = 1100;}
                case 57:{return travelCost = 1100;}
                case 58:{return travelCost = 1100;}
                case 59:{return travelCost = 1100;}
                case 60:{return travelCost = 1100;}
                case 61:{return travelCost = 1100;}
                case 62:{return travelCost = 1100;}
                case 63:{return travelCost = 1100;}
                default:{return 1;}
                
            }
        }
        
        
        
        
    }
    
    
}
