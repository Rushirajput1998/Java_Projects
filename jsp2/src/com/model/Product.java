package com.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String pmfname;
	private String pmfdate;
	private String pexdate;
	private int pprice;
	
	  @OneToOne(mappedBy = "product", fetch = FetchType.LAZY)
	    private Inventory inventory;
	
	
	public Product() {
		super();
		
	}
	public Product(int pid, String pname, String pmfname, String pmfdate, String pexdate, int pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pmfname = pmfname;
		this.pmfdate = pmfdate;
		this.pexdate = pexdate;
		this.pprice = pprice;
	}
	public int getPid() {
		return pid;
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
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	public String getPmfname() {
		return pmfname;
	}
	public void setPmfname(String pmfname) {
		this.pmfname = pmfname;
	}
	public String getPmfdate() {
		return pmfdate;
	}
	public void setPmfdate(String pmfdate) {
		this.pmfdate = pmfdate;
	}
	public String getPexdate() {
		return pexdate;
	}
	public void setPexdate(String pexdate) {
		this.pexdate = pexdate;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pmfname=" + pmfname + ", pmfdate=" + pmfdate
				+ ", pexdate=" + pexdate + ", pprice=" + pprice + ", inventory=" + inventory + "]";
	}
	
	
	
		
	
	

}
