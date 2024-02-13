package com.hexaware.ITasset1.service;

import com.hexaware.ITasset1.DTO.TicketDTO;
import com.hexaware.ITasset1.entity.Ticket;

public interface TicketService {

	public TicketDTO createTicket(TicketDTO ticketdto);

	public String  approveTicket(Long ticketId);

}
