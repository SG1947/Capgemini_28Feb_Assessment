package com.hibernate1.HibernateJPA1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CUSTOMER")
public class Customer {
@Id
@Column
private int id;
@Column
private String name;
@Column
private String mobile_number;
public Customer(int id, String name, String mobile_number) {
	super();
	this.id = id;
	this.name = name;
	this.mobile_number = mobile_number;
}
public Customer() {
	super();
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
public String getMobile_number() {
	return mobile_number;
}
public void setMobile_number(String mobile_number) {
	this.mobile_number = mobile_number;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", mobile_number=" + mobile_number + "]";
}

}
