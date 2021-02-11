package com.smarteinc.assignment.booking.service.impl;

public enum TicketType {
	BUS(1), CAR(2);

	private int type;

	TicketType(int typ) {
		this.type = typ;
	}

	public int getType() {
		return type;
	}

}
