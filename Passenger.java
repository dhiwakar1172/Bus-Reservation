package com.booking.model;

public class Passenger {
	private String name;
	private int age;
	private String busName;
	private String DateOfTravel;
	private String DeparturePlace;
	private String ArrivalPlace;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public String getDateOfTravel() {
		return DateOfTravel;
	}

	public void setDateOfTravel(String dateOfTravel) {
		DateOfTravel = dateOfTravel;
	}

	public String getDeparturePlace() {
		return DeparturePlace;
	}

	public void setDeparturePlace(String departurePlace) {
		DeparturePlace = departurePlace;
	}

	public String getArrivalPlace() {
		return ArrivalPlace;
	}

	public void setArrivalPlace(String arrivalPlace) {
		ArrivalPlace = arrivalPlace;
	}

	@Override
	public String toString() {
		return "Passenger [name=" + name + ", age=" + age + ", busName=" + busName + ", DateOfTravel=" + DateOfTravel
				+ ", DeparturePlace=" + DeparturePlace + ", ArrivalPlace=" + ArrivalPlace + "]";
	}

	

}
