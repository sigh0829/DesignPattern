package com.example.abstractclass;
import com.example.behaviorinterface.FlyBehavior;
import com.example.behaviorinterface.QuackBehavior;


public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("I can swim!!");
	}
	
	public abstract void display();
}
