package com;

import java.util.ArrayList;
import java.util.Arrays;

public class TravelForArraylist extends Driver {
	
	ArrayList<Driver> drivers;
	    
	   
		public TravelForArraylist() {
			
		}
		
		public TravelForArraylist(ArrayList<Driver> drivers) {
			super();
			this.drivers = drivers;
		}
		
		
		
		
		public boolean isCarDriver(ArrayList<Driver> drivers) {
			
			for (Driver driver : drivers) {
				//System.out.println(driver);
				if(driver.getDriverCatogory().equalsIgnoreCase("car")) {
					return true;
				}
		
		}
			
			return false;
		}
		
		public String retrivebyDriverId(ArrayList<Driver> drivers, int driverId) {
			/*for(Driver driver:drivers) {
				if(driver.getDriverId()==driverId) {
					return "Driver name is "+ driver.getDriverId()+" belonging to the category " +driver.getDriverCatogory()+" traveled "+driver.getDistance()+" KM so far" ;
				}
			}
			
			//return "driver not found: " + driverId;*/
			
		return	drivers
			      .stream()
			      .filter(d-> d.getDriverId()==driverId)
			      .findFirst()
			      .map(d-> "Driver name is "+ d.getDriverId()
			                +" belonging to the category " +d.getDriverCatogory()
			                +" traveled "+d.getDistance()+" KM so far" )
			      .orElse("No driver matched");
			
			
		}
		
		int count=0;
		public String retriveCountOfDriver(ArrayList<Driver> drivers, String driverCatogory) {
		    for(Driver driver:drivers) {
				if(driver.getDriverCatogory()==driverCatogory) {
					count++;
					
				}
			}
			return "The count of drivers "+count;
			
			/*return drivers
					     .stream()
					     .filter(d->d.getDriverCatogory()==driverCatogory)
					     .count()*/
		}
		
		
		public String retriveDriver(ArrayList<Driver> drivers, String driverCatogory) {
			for(Driver driver:drivers) {
				if(driver.getDriverCatogory()==driverCatogory) {
					return "The driver details belong to that category " + driver;
					
				}
			}
			return "No driver under that category "+ driverCatogory;
		}
		
		public String retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
			/*double max=0.0;
			for(Driver driver:drivers) {
				if(driver.getDistance()>max) {
					max=driver.getDistance();
					
				}
			}
			return  "Travelled the max km is "+ max;*/
			return drivers.stream()
				    .sorted((d1, d2) -> Double.compare(d2.getDistance(), d1.getDistance())) // Descending
				    .findFirst()
				    .map(d -> "Driver name is " + d.getDriverId()
				            + " belonging to the category " + d.getDriverCatogory()
				            + " traveled the max distance of " + d.getDistance() + " KM")
				    .orElse("No drivers available");
			
		}

		@Override
		public String toString() {
			return "TravelForArraylist [drivers=" + drivers + ", count=" + count + "]";
		}
		
			
}
