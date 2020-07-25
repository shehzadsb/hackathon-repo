package com.rapid.workload.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Orders")
public class Order {
	
	@Id
	@Column(name = "OrderID")
	private Integer orderId;
	
	@Column(name = "Price")
	private BigDecimal price;
	
	@Column(name = "StatusID")
	private Integer statusId;
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	
	

}
