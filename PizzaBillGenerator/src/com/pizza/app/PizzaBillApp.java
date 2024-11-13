/**
 * 
 */
package com.pizza.app;

/**
 * 
 */
public class PizzaBillApp {

//	Boolean veg = true;
	Boolean veg = false; // implies non-veg

//	public static void main(String[] args) {
//		Pizza pizzaBill = new Pizza(false);
//
////		pizzaBill.getBill();
//
//		pizzaBill.addExtraCheese(); // 100
//		pizzaBill.addExtraTopping(); // 150
//		pizzaBill.takeAway(); // 20
//
//		pizzaBill.getBill();
//	}

	public static void main(String[] args) {
		DeluxPizza dp = new DeluxPizza(true);
		dp.addExtraCheese(); // Does Not add-up again to the bill since Overridden
		dp.takeAway();
		dp.getBill();
	}
	
	
}