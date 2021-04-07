
package ticketer;

public class Ship extends Vehicle
{
    private String seatNo,food, ac;
    
    public Ship(){}//// Empty Constructor
    /// Parametrized Constructor Below
    public Ship(String vehicleName,String vehicleType,String member,String vehicleNo,String seatNo,String food,String ac)
    {
        super(vehicleName,vehicleType,member,vehicleNo);
        this.seatNo =seatNo;
        this.food =food; // (Y/N)
        this.ac =ac; // (Y/N)
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
    
    public void setAc(String seatNo)
    {
       this.ac =ac; 
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
    
    public String getAc()
    {
       return ac;
    }
    
    
}
