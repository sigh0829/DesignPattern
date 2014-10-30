package com.example.factory;

import com.example.pizzaingredient.cheese.Cheese;
import com.example.pizzaingredient.cheese.MozzarellaCheese;
import com.example.pizzaingredient.clams.Clams;
import com.example.pizzaingredient.clams.FrozenClams;
import com.example.pizzaingredient.dough.Dough;
import com.example.pizzaingredient.dough.ThickCrustDough;
import com.example.pizzaingredient.pepperoni.Pepperoni;
import com.example.pizzaingredient.pepperoni.SlicedPepperoni;
import com.example.pizzaingredient.sauce.PlumTomatoSauce;
import com.example.pizzaingredient.sauce.Sauce;
import com.example.pizzaingredient.veggies.BlackOlives;
import com.example.pizzaingredient.veggies.Eggplant;
import com.example.pizzaingredient.veggies.Spinach;
import com.example.pizzaingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new FrozenClams();
	}

}
