package com.rapid.workload.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rapid.workload.model.Order;
import com.rapid.workload.model.SubOrder;

@Repository
public interface SubOrderRepository extends JpaRepository<SubOrder, Integer> {

}
