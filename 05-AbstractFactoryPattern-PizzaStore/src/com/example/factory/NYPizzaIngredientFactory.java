package com.example.factory;

import com.example.pizzaingredient.cheese.Cheese;
import com.example.pizzaingredient.cheese.ReggianoCheese;
import com.example.pizzaingredient.clams.Clams;
import com.example.pizzaingredient.clams.FreshClams;
import com.example.pizzaingredient.dough.Dough;
import com.example.pizzaingredient.dough.ThinCrustDough;
import com.example.pizzaingredient.pepperoni.Pepperoni;
import com.example.pizzaingredient.pepperoni.SlicedPepperoni;
import com.example.pizzaingredient.sauce.MarinaraSauce;
import com.example.pizzaingredient.sauce.Sauce;
import com.example.pizzaingredient.veggies.Garlic;
import com.example.pizzaingredient.veggies.Mushroom;
import com.example.pizzaingredient.veggies.Onion;
import com.example.pizzaingredient.veggies.RedPepper;
import com.example.pizzaingredient.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FreshClams();
	}

}
