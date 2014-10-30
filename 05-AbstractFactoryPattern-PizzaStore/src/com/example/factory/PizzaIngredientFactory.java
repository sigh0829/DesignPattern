package com.example.factory;

import com.example.pizzaingredient.cheese.Cheese;
import com.example.pizzaingredient.clams.Clams;
import com.example.pizzaingredient.dough.Dough;
import com.example.pizzaingredient.pepperoni.Pepperoni;
import com.example.pizzaingredient.sauce.Sauce;
import com.example.pizzaingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
