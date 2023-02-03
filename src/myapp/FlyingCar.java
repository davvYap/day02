package myapp;

public class FlyingCar extends Car {
    
    //member
    private float altitude = 0f; // f stands for float, alternative we can use 0.0

    //constructor
    public FlyingCar(){}

    public FlyingCar(String registration){
        this.setRegistration(registration);
    }

    // getter and setter
    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    // method
    public void climb(float feet){
        if (this.altitude < 100){
            this.altitude = Math.max((this.altitude+feet), 100);
        }
    }

    // method overloading
    public void climb(){
        this.altitude += 5;
    }

    @Override   //anotation to override, this will prevent spelling error and create a new method instead of overriding
    public String getRegistration(){
        return "F" + super.getRegistration(); //super means base/parent class 
    }

    @Override
    public void start(){
        super.start();
        this.altitude = 5f;
    }

}
