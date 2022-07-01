package com.booking.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.booking.DAO.PassengerDAO;

@WebServlet("/PassengerServlet")
public class PassengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		PassengerDAO passenger = new PassengerDAO();
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String busName = request.getParameter("busName");
		String dateOfTravel = request.getParameter("dateOfTravel");
		String departure = request.getParameter("departurePlace");
		String arrival = request.getParameter("arrivalPlace");

		int bookingResult = passenger.Booking(name, age, busName, dateOfTravel, departure, arrival);
		PrintWriter out;
		if(bookingResult==0) {
			response.setContentType("text/html");
			out = response.getWriter();
			out.print("<p>Sorry! Unable to process request at this moment</p>");
			out.print("<br/><a href='/Bus_Booking/index.html'>Click here to try again</a>'");
		}else if(bookingResult==-1) {
			response.setContentType("text/html");
			out = response.getWriter();
			out.print("<p>Sorry! All Seats Booked</p>");
			out.print("<br/><a href='/Bus_Booking/index.html'>Click here to try another Bus</a>'");
		}else {
			response.setContentType("text/html");
			out = response.getWriter();
			out.print("<p>Ticket Bookeed</p>");
			out.print("<br/><a href='/Bus_Booking/index.html'>Click here to Book another Ticket</a>'");
			
		}
	}
	

}
