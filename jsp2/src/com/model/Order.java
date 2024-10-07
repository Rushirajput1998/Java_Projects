package com.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private int pid;
	private int price;
	private int quantity;
	private Long sid;
	private Long uid;
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDateTime;
	@ManyToOne
    @JoinColumn(name = "product")
	private Product product;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getPid() {
		return pid;
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPrice() {
		return price;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public Date getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", pid=" + pid + ", price=" + price + ", quantity=" + quantity + ", sid=" + sid
				+ ", uid=" + uid + ", orderDateTime=" + orderDateTime + ", product=" + product + "]";
	}
	
	
	

}
