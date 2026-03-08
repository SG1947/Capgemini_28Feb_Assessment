package Capgemini_assessment_28Feb.Question1;

public abstract class FoodItem {
// Encapsulation: private variables
private int id;
private String name;
private double price;
public FoodItem(int id, String name, Double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
//Getters and Setters (Encapsulation)
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
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
//Abstract method to be implemented in subclasses
public abstract double calculateDiscount();
}
