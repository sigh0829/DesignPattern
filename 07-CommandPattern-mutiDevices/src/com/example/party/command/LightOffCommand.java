package com.example.party.command;

import com.example.party.Light;

public class LightOffCommand implements Command{
	private Light Light;
	
	public LightOffCommand(Light light){
		this.Light = light;
	}
	
	@Override
	public void execute() {
		Light.off();
	}

	@Override
	public void undo() {
		Light.on();		
	}

}
