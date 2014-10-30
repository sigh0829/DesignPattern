package com.example.pizzastore;

import com.example.factory.ChicagoPizzaIngredientFactory;
import com.example.factory.PizzaIngredientFactory;
import com.example.pizza.CheesePizza;
import com.example.pizza.ClamsPizza;
import com.example.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
			
		} else if (type.equals("clams")) {
			pizza = new ClamsPizza(ingredientFactory);
			pizza.setName("Chicago Style Clams Pizza");
		}
		
		return pizza;
	}

}
