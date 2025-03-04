package activities;

public class MountainBike extends Bicycle{
	
	public int seatHeight;
	
	public MountainBike(int gears, int currentSpeed, int height) {
		super(gears, currentSpeed);
        seatHeight = height;
	}
        
	public void setHeight(int newValue) {
	    seatHeight = newValue;
	}
	
	public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}
