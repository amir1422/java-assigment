package com.smarteinc.assignment.booking.service.impl;

import com.smarteinc.assignment.booking.Ticket;
import com.smarteinc.assignment.booking.service.BookingService;

public class BookingServiceImpl implements BookingService {

	@Override
	public void bookTicket(Ticket ticket) {
		
		switch (ticket.getTicketType()) {
		case BUS:
			bookBusTicket(ticket);
			break;
		case CAR:
			bookCarTicket(ticket);
		}

	}

	private void bookCarTicket(Ticket x) {
		// assume Car is booked by making some entries in db
	}

	private void bookBusTicket(Ticket x) {
		// assume Bus is booked by making some entries in db
	}

}
