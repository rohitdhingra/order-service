package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

	public List<Order> getOrders() {
		return Stream.of(new Order(1,"Mobile",1,3000),
				new Order(2,"Book",4,200))
				.collect(Collectors.toList());
	}

}
