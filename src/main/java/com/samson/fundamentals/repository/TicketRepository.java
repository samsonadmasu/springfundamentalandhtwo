package com.samson.fundamentals.repository;

import com.samson.fundamentals.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket,Integer> {
}
