package com.example.display;

import com.example.allinterface.DisplayElement;
import com.example.allinterface.Observer;
import com.example.allinterface.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	
	private Subject weatherData;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
		
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degree and "+ humidity +"% humidity");
	}
	
}
