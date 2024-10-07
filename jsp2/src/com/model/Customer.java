package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long uid;
	private String cfname;
	private String clname;
	private String cemail;
	private String cphno;
	private String caddress;
	private String cpass1;
	private String cpass2;

	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getCfname() {
		return cfname;
	}
	public void setCfname(String cfname) {
		this.cfname = cfname;
	}
	public String getClname() {
		return clname;
	}
	public void setClname(String clname) {
		this.clname = clname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCphno() {
		return cphno;
	}
	public void setCphno(String cphno) {
		this.cphno = cphno;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public String getCpass1() {
		return cpass1;
	}
	public void setCpass1(String cpass1) {
		this.cpass1 = cpass1;
	}
	public String getCpass2() {
		return cpass2;
	}
	public void setCpass2(String cpass2) {
		this.cpass2 = cpass2;
	}
	@Override
	public String toString() {
		return "Customer [uid=" + uid + ", cfname=" + cfname + ", clname=" + clname + ", cemail=" + cemail + ", cphno="
				+ cphno + ", caddress=" + caddress + ", cpass1=" + cpass1 + ", cpass2=" + cpass2 + "]";
	}
	
	

}
