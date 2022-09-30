package com.coffee.interview.Coffee;

public class Barista {

	private CoffeeType servedCoffee;

	public void serve(CoffeeType coffeeType) {
		servedCoffee = coffeeType;
	}

	public CoffeeType servedCoffee() {
		return servedCoffee;
	}
	
	public boolean checkCoffee() {
		/* need to check in gredeient fn for empty or not */
		
		
		/* End of fn */
		return true;
	}

}
