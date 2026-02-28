package Capgemini_assessment_28Feb.Question1;

public class Driver {

	public static void main(String[] args) {
		Order order=new Order();
		FoodItem vegItem = new VegItem(1, "Paneer Butter Masala", 250.0);
        FoodItem nonVegItem = new NonVegItem(2, "Chicken Biryani", 300.50);

        order.addFoodItem(vegItem);
        order.addFoodItem(nonVegItem);
        
        double totalBill = order.calculateTotalBill();
        
        System.out.println("Total Bill after Discount: " + totalBill);

	}

}
