package com.mapping.onetoone;





import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name="cllg")
public class College {
	@Id//@GeneratedValue
	private int id;
	private String name ;
	private String address;
	
	
	@OneToOne
	private Dept dept;
	//@ManyToMany(mappedBy="college")
    
	
	
	public Dept getDept() {
		return dept;
	}
//	public void setDept(Dept dept) {
//		
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDept(Dept d) {
		// TODO Auto-generated method stub
		this.dept = dept;
	}
	
	
	
}


