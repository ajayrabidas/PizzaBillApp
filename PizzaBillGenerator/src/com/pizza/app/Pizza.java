/**
 * 
 */
package com.pizza.app;

/**
 * 
 */
public class Pizza {

	private int price;
	private Boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingPrice = 150;
	private int takeAwayPrice = 20;

	private int basePizzaPrice;
	boolean isExtraCheese;
	boolean isExtraTopping;
	boolean isTakeAway;

	public Pizza(Boolean veg) {
		this.veg = veg;
		if (veg) {
			this.price = 300;
			basePizzaPrice = 300;
		} else {
			this.price = 400;
			basePizzaPrice = 400;
		}
	}

	public void addExtraCheese() {
//		System.out.println("Added: Extra Cheese");
		isExtraCheese = true;
		this.price = price + extraCheesePrice;
	}

	public void addExtraTopping() {
//		System.out.println("Added: Extra Topping");
		isExtraTopping = true;
		this.price = price + extraToppingPrice;
	}

	public void takeAway() {
//		System.out.println("Take Away Order");
		isTakeAway = true;
		this.price = price + takeAwayPrice;
	}

	public void getBill() {
		String bill = "Pizza Base: \t" + basePizzaPrice + "\n";

		if (isExtraCheese) {
			bill = bill + "Extra Cheese: \t" + extraCheesePrice + "\n";
		}
		if (isExtraTopping) {
			bill = bill + "Extra Topping: \t" + extraToppingPrice + "\n";
		}
		if (isTakeAway) {
			bill = bill + "Take Away: \t" + takeAwayPrice + "\n";
		}
		System.out.println("---------------------------");
		System.out.print(bill);
		System.out.println("---------------------------");
		System.out.println("Total: \t\t" + this.price);
		System.out.println("---------------------------");
	}

}
