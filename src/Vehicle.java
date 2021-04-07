public class Vehicle
{
    ////// Implementing Encapsulation
    
    private String vehicleName,vehicleType,member,vehicleNo;
    
    public Vehicle(){} ///// Empty Constructor
    public Vehicle(String vehicleName,String vehicleType,String member,String vehicleNo) /// Perametrized Constructor
    {
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.member = member;
        this.vehicleNo = vehicleNo;
    }
            
    ///// Setter Methods 
    
    public void setVehicleName(String vehicleName)
    {
        this.vehicleName = vehicleName;
    }
    
     public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }
     
      public void setMember(String member)
    {
        this.member = member;
    }
      
       public void setVehicleNo(String vehicleNo)
    {
        this.vehicleNo = vehicleNo;
    }
    
    
    /////// Getter Methods
    
    
    public String getVehicleName()
    {
        return vehicleName;
    }
    
    public String getVehicleType()
    {
        return vehicleType;
    }
    
    public String getMember()
    {
        return member;
    }
    
    public String geVehicleNo()
    {
        return vehicleNo;
    }
    
    
    
    
    
    
}
