package activities;

public class Bicycle implements BicycleParts, BicycleOperations{
	
    public int gears;
    public int currentSpeed;
	
	Bicycle(int gears, int currentSpeed){
		
		this.gears = gears;
		this.currentSpeed = currentSpeed;
		
	}

	public void applyBrake(int decrement) {
		
		currentSpeed = currentSpeed - decrement;
        System.out.println("Current speed of the BiCycle is : " + currentSpeed);
				
	}

	public void speedUp(int increment) {
		
		currentSpeed = currentSpeed + increment;
        System.out.println("Current speed of the BiCycle is : " + currentSpeed);		
		
	}
	
	public String bicycleDesc() {
	    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
	}
	
	

}
