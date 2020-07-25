package com.rapid.workload.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rapid.workload.model.Order;

@Repository
public interface OrderRepository extends CrudRepository<Integer, Order> {

}
