package myapp;

public class Main {
    public static void main(String[] args){

        Car myCar = new Car();

        myCar.setMake("Toyota");
        myCar.setRegistration("S12345");
        myCar.comment = "Toyota Altis";

        System.out.printf("Made by: %s\nRegistration: %s\n",myCar.getMake(),myCar.getRegistration());
        System.out.printf("My car model is: %s\n",myCar.comment);
        myCar.start();

        Car otherCar = new Car();

        otherCar.setMake("BMW");
        otherCar.setRegistration("ABC123");

        System.out.printf("Made by: %s\nRegistration: %s\n",otherCar.getMake(),otherCar.getRegistration());
        System.out.printf("The car need registration: %b\n",otherCar.needToServcie());
        otherCar.stop();

        FlyingCar myFlyingCar = new FlyingCar();
        myFlyingCar.setRegistration("s12345");
        myFlyingCar.setMake("JapanHonda");
        System.out.printf("Made by: %s\nRegistration: %s\n",myFlyingCar.getMake(),myFlyingCar.getRegistration());


        // flying car is a car
        Car c = new FlyingCar();
        // however, c cannot access to flyingCar specific method 

        // but car is not a flying car
        // FlyingCar d = new Car(); which will get an error

        // electric car is a car
        Car e = new ElectricCar();

        // to check c & e belongs to which child class then cast it back to its own derived class
        // base class can be casted into derived class
        // but derived class cannot be casted into the other derived class or base class
        if (c instanceof FlyingCar){
            // casting
            myFlyingCar = (FlyingCar)c;
            System.out.print("C is a flying car.");
            myFlyingCar.climb(10f);

        } else if (c instanceof ElectricCar){
            ElectricCar ec = (ElectricCar)c;
            System.out.print("C is a electrical car.");

        } else {
            System.out.println("C is just a normal car.");
        }


    }
}
