class Device{
   private  int deviceid;
   private  String status ;
   public Device(int deviceid , String status ){
    this.deviceid = deviceid;
    this.status = status;
   }
   public void displayStatus(){
     System.out.println(" the Device id is "+ deviceid +" \n the Ststus of the device is "+ status);
   }
}
class Thermostat extends Device{
    private String TemperatureSetting ;
    public Thermostat(int deviceid , String status , String TemperatureSetting){
        super(deviceid, status);
        this.TemperatureSetting = TemperatureSetting;
    }
    public void displayStatus(){
        super.displayStatus();
        System.out.println(" the temperature Setting of the device is "+ TemperatureSetting );
    }
}
public class DeviceDetails{
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(0123,"On", "Moderate");
        thermostat.displayStatus();
    }
}