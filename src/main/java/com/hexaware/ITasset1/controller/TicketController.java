package com.hexaware.ITasset1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.ITasset1.DTO.TicketDTO;
import com.hexaware.ITasset1.entity.Ticket;
import com.hexaware.ITasset1.service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@PostMapping("/createTicket")
	public TicketDTO createTicket(@RequestBody TicketDTO ticketdto)
	{
		return ticketService.createTicket(ticketdto);
		
	}
	
	@PostMapping("/approveTicket")
	public String approveTicket(@RequestParam Long ticketId)
	{
		String s=ticketService.approveTicket(ticketId);
		return s;
		
	}

}
