package com.model;

import jakarta.persistence.*;

@Entity
@Table(name="Emp")
public class Employee {
	
@Id	
@Column
private int id;
@Column
private String name;
@Column
private String email;
@Column(name="mobile number")
private String mobile;
public Employee(int id, String name, String email, String mobile) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.mobile = mobile;
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
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
}

}
