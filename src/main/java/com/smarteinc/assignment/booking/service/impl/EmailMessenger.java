package com.smarteinc.assignment.booking.service.impl;

import com.smarteinc.assignment.booking.Ticket;
import com.smarteinc.assignment.booking.service.Messenger;

public class EmailMessenger implements Messenger {

	@Override
	public void sendTicketBookedMail(Ticket x) {
		// Assume email is sent to passenger that his/her ticket is booked
	}
}
