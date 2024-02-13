package com.hexaware.ITasset1.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hexaware.ITasset1.DTO.TicketDTO;
import com.hexaware.ITasset1.entity.Asset;
import com.hexaware.ITasset1.entity.Employee;
import com.hexaware.ITasset1.entity.IssuedAsset;
import com.hexaware.ITasset1.entity.Ticket;
import com.hexaware.ITasset1.repository.AssetRepository;
import com.hexaware.ITasset1.repository.EmployeeRepository;
import com.hexaware.ITasset1.repository.IssuedAssetRepository;
import com.hexaware.ITasset1.repository.TicketRepository;
import com.hexaware.ITasset1.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Autowired
	private TicketRepository ticketRepo;
	
	@Autowired
	private ModelMapper modelmapper;
	
	@Autowired
	private AssetRepository assetRepo;
	
	@Autowired
	private IssuedAssetRepository issueAssetRepo;
	
	
	@Override
	public TicketDTO createTicket(TicketDTO ticketdto) {

		System.out.println(ticketdto);
		
		Ticket ticket = modelmapper.map(ticketdto, Ticket.class);
		
		ticket.setTicketStatus(Ticket.status.IN_PROCESS);
		
		Ticket t=null;
		
		t=ticketRepo.save(ticket);
		
		TicketDTO ticketdto1 = modelmapper.map(t, TicketDTO.class);
		
		return ticketdto1;
	}


	@Override
	public String approveTicket(Long ticketId) {
		System.out.println("ticket id given is: "+ticketId);
		String s="";
		Optional<Ticket> ticket=ticketRepo.findById(ticketId);
		Ticket t=null;
		t=ticket.get();
		if(t.getTicketStatus()!=Ticket.status.IN_PROCESS)
		{
			s="ticket aleready approve OR Rejected";
			return s;
		}
		Employee employee=t.getEmployee();
		System.out.println("employee details: "+employee);
		Asset asset=t.getAsset();
		System.out.println("asset details are: "+asset);
		
		IssuedAsset issueAsset= new IssuedAsset();
		issueAsset.setAsset(asset);
		issueAsset.setEmployee(employee);
		issueAsset.setIssueDate(LocalDateTime.now());
		
		System.out.println("asset has been issued and status has been changed"+issueAsset);
		
		t.setTicketStatus(Ticket.status.RESOLVED);
		ticketRepo.save(t);
		issueAssetRepo.save(issueAsset);
		
		s="ticket has been approved and asset has been issued";
		return s;
	}

}
