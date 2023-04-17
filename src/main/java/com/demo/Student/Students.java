package com.demo.Student;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String name;
	private String email;
	private int age;
	private String phone;
	public Students(int id, String name, String email, int age, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", phone=" + phone + "]";
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
		
	}
	


