package com.hexaware.ITasset1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.ITasset1.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Long> {

}
