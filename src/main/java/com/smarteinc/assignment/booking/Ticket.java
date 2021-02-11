package com.smarteinc.assignment.booking;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.smarteinc.assignment.booking.service.impl.TicketType;

public class Ticket implements Validable {
	private static Map<Integer, String> validTicketTypes;

	// Only two values are allowed 1 == Bus ticket, 2 == Car ticket
	private TicketType ticketType;
	private boolean valid;
	private int type;
	private String from;
	private String destination;
	// start on
	private LocalDate startDate;

	// reach on/end date
	private LocalDate endDate;

	// Traveler
	private Passenger passenger;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.valid = validTicketTypes.containsKey(type);
		this.type = type;
		this.ticketType = valid ? TicketType.valueOf(validTicketTypes.get(type)) : null;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	@Override
	public boolean isValid(Ticket x) {
		return valid;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	static {
		validTicketTypes = new HashMap<>();
		// adding valid ticket types.
		validTicketTypes.put(1, "BUS");
		validTicketTypes.put(2, "CAR");
	}
}
