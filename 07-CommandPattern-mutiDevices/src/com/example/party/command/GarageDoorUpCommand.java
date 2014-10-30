package com.example.party.command;

import com.example.party.GarageDoor;

public class GarageDoorUpCommand implements Command{

	private GarageDoor garageDoor;
	
	public GarageDoorUpCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();		
	}

	@Override
	public void undo() {
		garageDoor.down();		
	}

}
