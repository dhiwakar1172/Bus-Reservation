package com.booking.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.booking.DAO.BusDAO;

@WebServlet("/BusController")
public class BusController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String dateOfTravel = request.getParameter("dateOfTravel");
		String departure = request.getParameter("departurePlace");
		String arrival = request.getParameter("arrivalPlace");
		
		BusDAO dao = new BusDAO();
		ResultSet res = dao.checkBus(dateOfTravel, departure, arrival);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		try {
			out.print("<table border=\"3\" cellpadding=\"5\">");
			out.print("<tr>");
			out.print("<th>");
			out.print("Bus Namw");
			out.print("</th>");
			out.print("<th>");
			out.print("Travel Date");
			out.print("</th>");
			out.print("<th>");			
			out.print("Departure");
			out.print("</th>");
			out.print("<th>");
			out.print("Arrival");
			out.print("</th>");	
			out.print("<th>");
			out.print("Capacity");
			out.print("</th>");	
			out.print("</tr>");
			while(res.next()) 
			{
				out.print("<tr>");
				out.print("<td>");
				out.print(res.getString(1));
				out.print("</td>");
				out.print("<td>");
				out.print(res.getString(2));				
				out.print("</td>");
				out.print("<td>");				
				out.print(res.getString(3));
				out.print("</td>");
				out.print("<td>");
				out.print(res.getString(4));
				out.print("</td>");
				out.print("<td>");
				out.print(res.getInt(5));
				out.print("</td>");
				out.print("</tr>");

			}
			out.print("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		out.print("<br/><a href='/Bus_Booking/index.html'>Click here to go Back</a>'");


	}

}
