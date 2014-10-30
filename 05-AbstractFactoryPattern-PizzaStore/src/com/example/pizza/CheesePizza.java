package com.example.pizza;

import com.example.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
	private PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

	@Override
	public void printPizzaContent() {
		System.out.println("Dough: "+ dough.toString());
		System.out.println("Sauce: "+ sauce.toString());
		System.out.println("Cheese: "+ cheese.toString());
	}

}
