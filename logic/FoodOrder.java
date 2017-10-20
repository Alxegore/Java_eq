package logic;

import java.util.Scanner;

public class FoodOrder {

	// Fields: description, price, chicken, vegetable, extraChicken, extraRice
	// START CODE HERE
	private String description;
	private int price;
	private boolean hasChicken;
	private boolean hasVegetable;
	private boolean hasExtraChicken;
	private boolean hasExtraRice;
	// END CODE HERE

	// Constructor
	// START CODE HERE
	public FoodOrder(){
		description = "Hainanese Chicken rice";
		hasChicken = true;
		hasVegetable = true;
		hasExtraChicken = false;
		hasExtraRice = false;
	}
	// END CODE HERE

	// Methods
	// START CODE HERE
	public String getDescription(){
		return description;
	}
	public int getPrice(){
		return price;
	}
	public void calCulatePrice(){
		price = 40;
		if(!hasChicken)
			price -= 10;
		if(hasExtraChicken)
			price += 10;
		if(hasExtraRice)
			price += 5;
	}
	public void setHasChicken(boolean eq){
		hasChicken = eq;
		calCulatePrice();
	}
	public void setHasVegetable(boolean eq){
		hasVegetable = eq;
	}
	public void setHasExtraChicken(boolean eq){
		hasExtraChicken = eq;
		calCulatePrice();
	}
	public void setHasExtraRice(boolean eq){
		hasExtraRice = eq;
		calCulatePrice();
	}
	// END CODE HERE

	 @Override
	 public String toString() {
	 	// START CODE HERE
		 String ans = "That would be " + price + " baht. Thanks!" + "\n";
		 ans += description + "\n";
		 ans += "Chicken:" + hasChicken + "\n";
		 ans += "Vegetable:" + hasVegetable + "\n";
		 ans += "Extra Chicken:" + hasExtraChicken + "\n";
		 ans += "Extra Rice:" + hasExtraRice;
		 return ans;
	 	// END CODE HERE
	 }

	//@Override
	public boolean equals(FoodOrder other) {
		// START CODE HERE
		return this.price == other.price;
		// END CODE HERE
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		FoodOrder foodOrder = new FoodOrder();
		System.out.println("Hi, Welcome to Kao-Mun-Gai food stall!");
		System.out.println("We only sell " + foodOrder.getDescription());
		System.out.println("Would you like your meal with chicken? (Yes/No)");
		String customerInput = keyboard.next();
		if (customerInput.equals("No")) {
			foodOrder.setHasChicken(false);
			System.out.println("Okay...");
		} else if (customerInput.equals("Yes")) {
			foodOrder.setHasChicken(true);
		}
		System.out.println("Would you like your meal with vegetable? (Yes/No)");
		customerInput = keyboard.next();
		if (customerInput.equals("No")) {
			foodOrder.setHasVegetable(false);
		} else if (customerInput.equals("Yes")) {
			foodOrder.setHasVegetable(true);
		}
		System.out.println("Extra chicken? (Yes/No)");
		customerInput = keyboard.next();
		if (customerInput.equals("Yes")) {
			foodOrder.setHasExtraChicken(true);
			System.out.println("Good Choice!");
		} else if (customerInput.equals("No")) {
			foodOrder.setHasExtraChicken(false);
		}
		System.out.println("Extra Rice? (Yes/No)");
		customerInput = keyboard.next();
		if (customerInput.equals("Yes")) {
			foodOrder.setHasExtraRice(true);
		} else if (customerInput.equals("No")) {
			foodOrder.setHasExtraRice(false);
		}

		System.out.println(foodOrder);
		/*
		FoodOrder testOrder = new FoodOrder();
		testOrder.setHasChicken(false);
		testOrder.setHasExtraChicken(false);
		testOrder.setHasExtraRice(true);
		FoodOrder testOrder2 = new FoodOrder();
		testOrder2.setHasChicken(false);
		testOrder2.setHasExtraChicken(false);
		testOrder2.setHasExtraRice(true);
		System.out.println("Equal:" + testOrder.equals(testOrder2));
		*/
	}

}
