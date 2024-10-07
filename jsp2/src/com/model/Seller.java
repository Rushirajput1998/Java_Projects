package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller")
public class Seller {
	private String name;
	private String phno;
	private String address;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sid;
	private String pass1;
	private String pass2;
	
	
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Seller(String name, String phno, String address, Long sid, String pass1, String pass2) {
		super();
		this.name = name;
		this.phno = phno;
		this.address = address;
		this.sid = sid;
		this.pass1 = pass1;
		this.pass2 = pass2;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getPass1() {
		return pass1;
	}
	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}
	public String getPass2() {
		return pass2;
	}
	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}
	@Override
	public String toString() {
		return "Seller [name=" + name + ", phno=" + phno + ", address=" + address + ", sid=" + sid + ", pass1=" + pass1
				+ ", pass2=" + pass2 + "]";
	}

	
}
