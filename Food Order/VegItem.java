package Capgemini_assessment_28Feb.Question1;

public class VegItem extends FoodItem{

	public VegItem(int id, String name, Double price) {
		super(id, name, price);
	}

	@Override
	public double calculateDiscount() {
		double discount=getPrice()*0.1;
		return discount;
	}

}
