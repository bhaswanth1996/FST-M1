	package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {
	
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

	Plane(int maxPassengers){
		
		this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
		
	void onboard(String passenger){ 
		this.passengers.add(passenger);
		}
	
	Date takeOff() {
		this.lastTimeTookOf = new Date();
		return lastTimeTookOf;
		
	}
	
	void land () {
		this.lastTimeLanded = new Date();
        this.passengers.clear();
	}
	
	Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	
	List<String> getPassengers() {
        return passengers;
    }
	
	
}
