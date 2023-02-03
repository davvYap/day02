package myapp;

public class Car{

    // members
    private String registration;
    private String make;
    private boolean started = false;
    private int counter = 0;
    public String comment;

    // constructor 
    public Car(){
        System.out.println(">>>>>");
        System.out.println("Car is manufacturing.");
        System.out.println(">>>>>");
     };

    // getters & setters
    public void setRegistration(String r){
        this.registration = r;
    }

    public String getRegistration(){
        return this.registration;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        if(this.started){
            this.start();
        }else{
            this.stop();
        }
    }

    // methods
    public void start(){
        if(this.started){
            System.out.println("The car is running.");
        }else{
            this.started = true;
            counter++;
            System.out.println("Vroom! Vroom!");
        }
    }

    public void stop(){
        if(this.started){
            this.started = false;
            System.out.println("The car has stopped.");
        }else{
            System.out.println("The car is stop.");
        }
    }

    public boolean needToServcie(){
        return this.counter >10;
    }

    public void resetCounter(){
        this.counter = 0;
    }


}