package com.example.pizzastore;

import com.example.pizza.NYStyleCheesePizza;
import com.example.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		}
		return pizza;
	}

}
