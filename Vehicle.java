public class Vehicle {
     String bike;
     String varient;
     int mfdYear;
     int wheel;

    public Vehicle() {
        System.out.println("Default constructor");
    }
    public Vehicle(String bike, int mfdYear, String varient, int wheel) {
        System.out.println("Constructor called");
    
        this.bike = bike;
        this.varient = varient;
        this.mfdYear = mfdYear;
        this.wheel = wheel;
     }

     public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Royal Enfield", 1980, "Classic 350", 2);
      
          System.out.println("Bike: " + vehicle.getBike());
        System.out.println("Varient: " + vehicle.getVarient());
        System.out.println("Mfd Year: " + vehicle.getMfdYear());
     }

         String getBike() {
        return bike;
    }

      String getVarient() {
        return varient;
    }

      int getMfdYear() {
        return mfdYear;
    }
}
