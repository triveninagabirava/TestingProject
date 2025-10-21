package com;

public class Driver {
	
	private int driverId;
	
	private String driverName;
	
	private String driverCatogory;
	
	private double distance;
	
	public Driver() {
		
	}

	public Driver(int driverId, String driverName, String driverCatogory, double distance) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverCatogory = driverCatogory;
		this.distance = distance;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverCatogory() {
		return driverCatogory;
	}

	public void setDriverCatogory(String driverCatogory) {
		this.driverCatogory = driverCatogory;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverCatogory=" + driverCatogory
				+ ", distance=" + distance + "]";
	}
	
	

}
