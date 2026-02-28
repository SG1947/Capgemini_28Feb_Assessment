package Capgemini_assessment_28Feb.Question1;

import java.util.ArrayList;
import java.util.List;

public class Order {
// Polymorphism: List can store both VegItem and NonVegItem
private List<FoodItem>foodlist;
public Order() {
	foodlist=new ArrayList<>();
}
public void addFoodItem(FoodItem food) {
	foodlist.add(food);
}
public double calculateTotalBill() {
	double result=0;
	for(FoodItem item:foodlist) {
		result+=item.getPrice()-item.calculateDiscount();
	}
	return result;
}
}
