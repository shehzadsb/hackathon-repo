package com.rapid.workload.jpa;

import org.springframework.data.repository.CrudRepository;

import com.rapid.workload.model.Order;

public interface OrderRepository extends CrudRepository<Integer, Order> {

}
