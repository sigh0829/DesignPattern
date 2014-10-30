package com.example.abstractclass;
import com.example.behavior.FlyWithWings;
import com.example.behavior.Quack;


public class RealDuck extends Duck{

	public RealDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a real duck!!");
		
	}

}
