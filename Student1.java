
package com.mapping.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity(name="stud")
public class Student1 {
	

	
		@Id @GeneratedValue
		private int id;
		private String name;
		private String year;
		//@ManyToMany
		//private List<College1> college;
		
		
		//@ManyToMany
	
		public int getId() {
			return id;
		}
//		public List<College1> getCollege() {
//			return college;
//		}
//		public void setCollege(List<College1> college) {
//			this.college = college;
//		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", year=" + year + "]";
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
		public String getYear() {
			return year;
		}
		public void setYear(String year) {
			this.year = year;
		}
		
	}


