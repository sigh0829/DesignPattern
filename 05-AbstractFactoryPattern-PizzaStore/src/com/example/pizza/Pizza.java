package com.example.pizza;

import com.example.pizzaingredient.cheese.Cheese;
import com.example.pizzaingredient.clams.Clams;
import com.example.pizzaingredient.dough.Dough;
import com.example.pizzaingredient.pepperoni.Pepperoni;
import com.example.pizzaingredient.sauce.Sauce;
import com.example.pizzaingredient.veggies.Veggies;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clams;
	
	public abstract void prepare();
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void printPizzaContent();
	
}
