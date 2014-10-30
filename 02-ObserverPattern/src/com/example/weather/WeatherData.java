package com.example.weather;

import java.util.ArrayList;

import com.example.allinterface.Observer;
import com.example.allinterface.Subject;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = observers.indexOf(observer);
		if (i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged(){
		notifyObserver();
	}
	
	public void setMeasurements (float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
