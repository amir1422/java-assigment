package com.smarteinc.assignment.booking.util;

import java.util.Objects;

import com.smarteinc.assignment.booking.Ticket;

public class ValidatorUtil {
	
	//Ensure all input data is present
	public static void validateAllFieldsPresent(Ticket ticket) {
		Objects.requireNonNull(ticket);
		Objects.requireNonNull(ticket.getStartDate());
		Objects.requireNonNull(ticket.getEndDate());
		Objects.requireNonNull(ticket.getFrom());
		Objects.requireNonNull(ticket.getDestination());
		Objects.requireNonNull(ticket.getPassenger());

		//added comments 1
		//added comments 2
		//add comment3
		//branch1 comment1;
		//branch1 comment2
		//add comment4
		//add comment5

// branch1-comment3
		//branch1-commit4
		//added 6

	}

}
