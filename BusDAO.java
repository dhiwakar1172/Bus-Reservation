package com.booking.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.booking.util.ConnectionUtil;

public class BusDAO {
	public ResultSet checkBus(String travelDate, String departure, String arrival) {
		ResultSet result = null;
		Connection connection = null;
		try {
			connection = ConnectionUtil.getConnection();
		} catch (NamingException | SQLException e1) {
			e1.printStackTrace();
		}
		try {
			PreparedStatement statement = connection.prepareStatement(
					"select * from Buses where TravelDate = str_to_date(?,'%d-%m-%Y') and DeparturePlace = ? and ArrivalPlace = ?");

			statement.setString(1, travelDate);
			statement.setString(2, departure);
			statement.setString(3, arrival);

			result = statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;

	}
}
