package ticketer;

public class CostCalculation  extends Reservation
{
    double totalCost;
    CostCalculation(){}
    
   
   
    public double totalCost()
    {
        Reservation r = new Reservation();
        /// Variations With Root Type
        if(r.vehicleType.equals("Bus"))
        {
            return totalCost = ((r.travelCost()+r.foodCost+r.acCost)+r.returnCost);
        }
        
        else if(r.vehicleType.equals("Train"))
        {
            return totalCost = ((r.travelCost()+r.foodCost+r.acCost)+r.returnCost)*0.7;
        }
        
        else if(r.vehicleType.equals("Plane"))
        {
            return totalCost = ((r.travelCost()+r.foodCost+r.acCost)+r.returnCost)*5;
        }
        else
        {
            return totalCost = ((r.travelCost()+r.foodCost+r.acCost)+r.returnCost)*0.5;
        }
       
    }
    
}
