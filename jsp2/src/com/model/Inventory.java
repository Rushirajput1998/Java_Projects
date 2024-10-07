package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
    private String pname;
    private Long sid; // Assuming sid refers to the user's session ID
    private int quantity;
    
    @OneToOne
    @JoinColumn(name = "pid")
    private Product product;
    
    
	public Inventory() {
		super();
	}
	public Inventory(int pid, String pname, Long sid, int quantity) {
		this.pid=pid;
		this.pname=pname;
		this.sid=sid;
	}
	public int getPid() {
		return pid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Inventory [pid=" + pid + ", pname=" + pname + ", sid=" + sid + ", quantity=" + quantity + ", product="
				+ product + "]";
	}
    
    
}
