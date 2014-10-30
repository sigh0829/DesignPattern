package com.example.pizzastore;

import com.example.factory.NYPizzaIngredientFactory;
import com.example.factory.PizzaIngredientFactory;
import com.example.pizza.CheesePizza;
import com.example.pizza.ClamsPizza;
import com.example.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
			
		} else if (type.equals("clams")) {
			pizza = new ClamsPizza(ingredientFactory);
			pizza.setName("New York Style Clams Pizza");
		}
		
		return pizza;
	}

}
