package LiskovSubstitutionPrinciple;

public class MotorCar implements Car {
 
   
 
    //Constructors, getters + setters
 
    public void turnOnEngine() {
        //turn on the engine!
       System.out.println("turn on engine!!");
    }
 
    public void accelerate() {
        //move forward!
        System.out.println("Move forward");
    }
}