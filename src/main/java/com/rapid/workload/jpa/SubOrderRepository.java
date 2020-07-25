package com.rapid.workload.jpa;

import org.springframework.data.repository.CrudRepository;

import com.rapid.workload.model.Order;
import com.rapid.workload.model.SubOrder;

public interface SubOrderRepository extends CrudRepository<Integer, SubOrder> {

}
