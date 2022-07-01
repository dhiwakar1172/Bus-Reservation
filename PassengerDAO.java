package com.booking.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.NamingException;

import com.booking.util.ConnectionUtil;

public class PassengerDAO {
	Connection connection;

	public int Booking(String name, int age,String busName,String travelDate, String DeparturePlace, String ArrivalPlace) {
		int result =0;
		if(getBalanceSeats(busName, travelDate, DeparturePlace, ArrivalPlace)<getCapacity(busName, travelDate, DeparturePlace, ArrivalPlace)) 
		{
			try {
				connection = ConnectionUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement("insert into Passenger values (?,?,?,str_to_date(?,'%d-%m-%Y'),?,?)");
				
				statement.setString(1, name);
				statement.setInt(2, age);
				statement.setString(3, busName);				
				statement.setString(4, travelDate);
				statement.setString(5, DeparturePlace);
				statement.setString(6, ArrivalPlace);

				result = statement.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NamingException e) {
				e.printStackTrace();
			}
		}
		else {
			result=-1;
		}
		return result;
	}
	
	
	private int getBalanceSeats(String busName,String travelDate, String DeparturePlace, String ArrivalPlace) 
	{
		int filledSeats=0;
		try {
			connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"select count(*) from Passenger where BusName = ? and DateOfTravel = str_to_date(?,'%d-%m-%Y') and DeparturePlace = ? and ArrivalPlace=?");
			
			statement.setString(1, busName);
			statement.setString(2, travelDate);
			statement.setString(3, DeparturePlace);
			statement.setString(4, ArrivalPlace);

			ResultSet result = statement.executeQuery();
			while(result.next()) 
			{
				filledSeats = result.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}
	
		return filledSeats;
		
	}

	private int getCapacity(String busName, String travelDate, String DeparturePlace, String ArrivalPlace) {
		int capacity = 0;
		try {
			connection = ConnectionUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement(
					"select Capacity from Buses where BusName = ? and TravelDate = str_to_date(?,'%d-%m-%Y') and DeparturePlace = ? and ArrivalPlace=?");
			
			statement.setString(1, busName);
			statement.setString(2, travelDate);
			statement.setString(3, DeparturePlace);
			statement.setString(4, ArrivalPlace);

			ResultSet result = statement.executeQuery();
			while(result.next()) 
			{
				capacity = result.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NamingException e) {
			e.printStackTrace();
		}

		
		return capacity;
	}
}
