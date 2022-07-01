package com.booking.model;

public class Bus {
	private String BusName;
	private String TravelDate;
	private String DeparturePlace;
	private String ArrivalPlace;

	public String getBusName() {
		return BusName;
	}

	public void setBusName(String busName) {
		BusName = busName;
	}

	public String getTravelDate() {
		return TravelDate;
	}

	public void setTravelDate(String travelDate) {
		TravelDate = travelDate;
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
		return "Bus [BusName=" + BusName + ", TravelDate=" + TravelDate + ", DeparturePlace=" + DeparturePlace
				+ ", ArrivalPlace=" + ArrivalPlace + "]";
	}

}
