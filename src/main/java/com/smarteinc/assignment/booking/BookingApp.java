package com.smarteinc.assignment.booking;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BookingApp {
	private static Set<Integer> validTicketTypes;

	public int bookingProcess(Ticket x) {
		validateAllFieldsPresent(x);
		if (isTicketTypeNotValid(x)) {
			throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
		}
		bookTicket(x);
		sendTicketBookedMail(x);
		return x.getType();
	}

	private void bookTicket(Ticket x) {
		if (x.getType() == 1) {
			bookBusTicket(x);
		} else {
			bookCarTicket(x);
		}
	}

	private boolean isTicketTypeNotValid(Ticket x) {
		return !validTicketTypes.contains(x.getType());
	}

	private void bookCarTicket(Ticket x) {
		// assume Car is booked by making some entries in db
	}

	private void bookBusTicket(Ticket x) {
		// assume Bus is booked by making some entries in db
	}

	private void sendTicketBookedMail(Ticket x) {
		// Assume email is sent to passenger that his/her ticket is booked
	}

//Ensure all input data is present
	void validateAllFieldsPresent(Ticket ticket) {
		Objects.requireNonNull(ticket);
		Objects.requireNonNull(ticket.getStartDate());
		Objects.requireNonNull(ticket.getEndDate());
		Objects.requireNonNull(ticket.getFrom());
		Objects.requireNonNull(ticket.getDestination());
		Objects.requireNonNull(ticket.getPassenger());

	}

	static {
		validTicketTypes = new HashSet<>();
		//adding valid ticket types.
		validTicketTypes.add(1);
		validTicketTypes.add(2);
	}
}
