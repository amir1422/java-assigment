package com.smarteinc.assignment.booking;

import com.smarteinc.assignment.booking.service.BookingService;
import com.smarteinc.assignment.booking.service.Messenger;
import com.smarteinc.assignment.booking.service.impl.BookingServiceImpl;
import com.smarteinc.assignment.booking.service.impl.EmailMessenger;
import com.smarteinc.assignment.booking.util.ValidatorUtil;

public class BookingApp {

	private BookingService bookingService;
	private Messenger messenger;

	public BookingApp() {
		this.bookingService = new BookingServiceImpl();
		this.messenger = new EmailMessenger();
	}

	public int bookingProcess(Ticket x) {
		ValidatorUtil.validateAllFieldsPresent(x);
		if (!x.isValid(x)) {
			throw new IllegalArgumentException("Only type 1 and 2 tickets are supported");
		}
		bookingService.bookTicket(x);
		messenger.sendTicketBookedMail(x);
		return x.getType();
	}
}
