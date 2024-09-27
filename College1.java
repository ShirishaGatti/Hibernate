package com.mapping.manytomany;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name="cllg")
public class College1 {
	@Id @GeneratedValue
	private int id;
	private String name ;
	private String address;
	
	@ManyToMany
	private List<Student1> student;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public List<Student1> getStudent() {
		return student;
	}
	public void setStudent(List<Student1> student) {
		this.student = student;
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
	
	
	
}


