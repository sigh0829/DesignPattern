package com.example.party.command;

import com.example.party.GarageDoor;

public class GarageDoorOpenCommand implements Command{

	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.lightOn();		
	}

}
