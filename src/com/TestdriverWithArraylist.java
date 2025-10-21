package com;

import java.util.ArrayList;

public class TestdriverWithArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver1=new Driver(9904154,"Ravi","car",5550);
		Driver driver2=new Driver(9904154,"Ravi","Auto",8550);
		Driver driver3=new Driver(9904154,"Ravi","Lorrey",9850);
		
		ArrayList<Driver> drivers=new ArrayList<Driver>();
		drivers.add(driver1);
		drivers.add(driver2);
		drivers.add(driver2);
		
		//System.out.println(drivers);
		
		TravelForArraylist obj1=new TravelForArraylist(drivers);
	    System.out.println(obj1.isCarDriver(drivers));
	    System.out.println(obj1.retrivebyDriverId(drivers, 9904158));
	    System.out.println(obj1.retriveCountOfDriver(drivers, "car"));
	    System.out.println(obj1.retriveDriver(drivers, "car"));
	    System.out.println(obj1.retriveMaximumDistanceTravelledDriver(drivers));
	   
		

	}

}
