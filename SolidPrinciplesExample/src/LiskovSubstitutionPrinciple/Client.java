package LiskovSubstitutionPrinciple;

public class Client {
public static void main(String[] args) {
	MotorCar m=new MotorCar();
	System.out.println("Motor Car");
	m.turnOnEngine();
	m.accelerate();
	
	
	System.out.println("Electric car");
	ElectricCar e=new ElectricCar();
	
		//e.turnOnEngine();
	
	
	e.accelerate();
}
}
