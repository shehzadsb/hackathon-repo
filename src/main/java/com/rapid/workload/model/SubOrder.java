package com.rapid.workload.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name="SubOrder")
public class SubOrder {
	
	@Id
	@Column(name = "SubOrderID")
	private Integer subOrderId;
	
	@Column(name = "OrderID")
	private Integer orderId;
	
	@Column(name = "GroupID")
	private Integer groupId;
	
	@Column(name = "Quantity")
	private Integer quantity;
	
	@Column(name = "ChefID")
	private Integer chefId;
	
	@Column(name = "StatusID")
	private Integer statusId;
	
	

	public Integer getSubOrderId() {
		return subOrderId;
	}

	public void setSubOrderId(Integer subOrderId) {
		this.subOrderId = subOrderId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getChefId() {
		return chefId;
	}

	public void setChefId(Integer chefId) {
		this.chefId = chefId;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	

	
	
	
	

}
