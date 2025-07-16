package assign;

class Vehicle {
    void speed(){
        System.out.println("Speed =100km/hr");
    }

    void Brake(){
        System.out.println("Stop the vehicle");
    }
}

class Bike extends Vehicle{
    void speed(){
        System.out.println("The bike is riding at 70km speed");
    }
}


class Car extends Vehicle {
    void Speed(){
        System.out.println(" The car is drivingat 80km speed");
         }
}


public class Main {
    public static void main(String[] args) {

        Bike bike =new Bike();
        bike.speed();
        bike.Brake();

        Car car=new Car();
       car.Speed();
       car.Brake();
        
    }
}
