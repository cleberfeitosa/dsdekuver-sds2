package com.mrhandosme.dsdeliver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mrhandosme.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
