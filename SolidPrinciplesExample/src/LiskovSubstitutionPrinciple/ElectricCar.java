package LiskovSubstitutionPrinciple;

public class ElectricCar  implements Car {
 
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }
 
    public void accelerate() {
        //this acceleration is crazy!
    	System.out.println("this acceleration is crazy!\n Move Forward");
    }
}