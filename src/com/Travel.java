package com;

import java.util.Arrays;

public class Travel extends Driver {
	
   Driver[] drivers;
    
   
	public Travel() {
		
	}
	
	public Travel(Driver[] drivers) {
		super();
		this.drivers = drivers;
	}
	
	
	
	
	public boolean isCarDriver(Driver[] drivers) {
		
		for (Driver driver : drivers) {
			//System.out.println(driver);
			if(driver.getDriverCatogory().equalsIgnoreCase("car")) {
				return true;
			}
			
			
	}
		
		return false;
	}
	
	public String retrivebyDriverId(Driver[] drivers, int driverId) {
		for(Driver driver:drivers) {
			if(driver.getDriverId()==driverId) {
				return "Driver name is "+ driver.getDriverId()+" belonging to the category " +driver.getDriverCatogory()+" traveled "+driver.getDistance()+" KM so far" ;
			}
		}
		
		return "driver not found" + driverId;
		
		
	}
	
	int count=0;
	public String retriveCountOfDriver(Driver[] drivers, String driverCatogory) {
		for(Driver driver:drivers) {
			if(driver.getDriverCatogory()==driverCatogory) {
				count++;
				
			}
		}
		return "The count of drivers "+count;
	}
	
	
	public String retriveDriver(Driver[] drivers, String driverCatogory) {
		for(Driver driver:drivers) {
			if(driver.getDriverCatogory()==driverCatogory) {
				return "The driver details belong to that category " + driver;
				
			}
		}
		return "No driver under that category "+ driverCatogory;
	}
	
	public String retriveMaximumDistanceTravelledDriver(Driver[] drivers) {
		double max=0.0;
		for(Driver driver:drivers) {
			if(driver.getDistance()>max) {
				max=driver.getDistance();
				
			}
		}
		return "the one travelled the max km is "+ max;
	}
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Travel [drivers=" + Arrays.toString(drivers) + "]";
	}

	
	
}
	
	