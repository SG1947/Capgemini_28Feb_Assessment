package Capgemini_assessment_28Feb.Question1;

public class NonVegItem extends FoodItem {

	public NonVegItem(int id, String name, Double price) {
		super(id, name, price);
	}

	@Override
	public double calculateDiscount() {
		double discount=getPrice()*0.05;
		return discount;
	}

}
