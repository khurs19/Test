package com.coffee.interview.Coffee;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcceptanceTest {

	private Controller controller;
	private Display display;
	private Barista barista;

	@Test
	public void dispenseBlackCoffeeForFree() {
		powerUp();
		assertEquals("Please select a coffee type", display.currentMessage());
		userWants(CoffeeType.BLACK);
		assertEquals("Great Choice!", display.currentMessage());
		controller.dispense();
		assertEquals(CoffeeType.BLACK, barista.servedCoffee());
		assertEquals("Please collect your delicious coffee", display.currentMessage());
	}
	
	@Test
	public void dispenseCappuccinoCoffeeForFree() {
		powerUp();
		assertEquals("Please select a coffee type", display.currentMessage());
		userWants(CoffeeType.Cappuccino);
			assertEquals("Great Choice!", display.currentMessage());
			controller.dispense();
			assertEquals(CoffeeType.Cappuccino, barista.servedCoffee());
		
		assertEquals("Please collect your delicious coffee", display.currentMessage());
	}
	
	@Test
	public void dispenseLatteCoffeeForFree() {
		powerUp();
		assertEquals("Please select a coffee type", display.currentMessage());
		userWants(CoffeeType.Latte);
			assertEquals("Great Choice!", display.currentMessage());
			controller.dispense();
			assertEquals(CoffeeType.Latte, barista.servedCoffee());
			assertEquals("Please collect your delicious coffee", display.currentMessage());
		
	}

	private AcceptanceTest userWants(CoffeeType coffeeType) {
		controller.userWants(coffeeType);
		return this;
	}

	private void powerUp() {
		display = new Display();
		barista = new Barista();
		controller = new Controller(display, barista);
	}
}
