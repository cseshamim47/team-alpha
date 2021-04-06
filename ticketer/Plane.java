
package ticketer;

public class Plane extends Vehicle
{
    private String seatNo,food;
    
    public Plane(){}//// Empty Constructor
    /// Parametrized Constructor Below
    public Plane(String vehicleName,String vehicleType,String member,String vehicleNo,String seatNo,String food)
    {
        super(vehicleName,vehicleType,member,vehicleNo);
        this.seatNo =seatNo;
        this.food =food; // (Y/N)
        
    }
    
    /// Setter Methods
    
    public void setSeatNo(String seatNo)
    {
       this.seatNo =seatNo; 
    }
    
    public void setFood(String food)
    {
       this.food =food; 
    }
    
    ///// Getter Methods
    
    public String getSeatNo()
    {
       return seatNo;
    }
    
    public String getFood()
    {
       return food; 
    }

    
    
    
}
