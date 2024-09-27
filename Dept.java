package com.mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dept {
	
	@Id
   // @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int deptId;
	private String name;
	
	@OneToOne
	private College college;
	
	
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public int getDeptId() {
		return deptId;
	}
	public String getName() {
		return name;
	}
	
	public College getCollege() {
		return college;
	}
	
	
	
	
}
