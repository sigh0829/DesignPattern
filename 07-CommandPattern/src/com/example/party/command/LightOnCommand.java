package com.example.party.command;

import com.example.party.Light;

public class LightOnCommand implements Command{
	private Light Light;
	
	public LightOnCommand(Light light){
		this.Light = light;
	}
	
	@Override
	public void execute() {
		Light.on();
	}

}
