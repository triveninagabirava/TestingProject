package com;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver[] drivers;
		 Driver[] drivers=new Driver[3];
			
			drivers[0]=new Driver(9904154,"suresh","auto",3500);
			drivers[1]=new Driver(9904158,"ravi","lorry",35000);
			drivers[2]=new Driver(9904159,"srinu","car",3599);
			
		Travel obj1=new Travel(drivers);
	    System.out.println(obj1.isCarDriver(drivers));
	    System.out.println(obj1.retrivebyDriverId(drivers, 9904158));
	    System.out.println(obj1.retriveCountOfDriver(drivers, "car"));
	    System.out.println(obj1.retriveDriver(drivers, "car"));
	    System.out.println(obj1.retriveMaximumDistanceTravelledDriver(drivers));
	   
	    //System.out.println(obj1);
		

	}

}
