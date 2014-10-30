package com.example.party.command;

import com.example.party.GarageDoor;

public class GarageDoorDownCommand implements Command{

	private GarageDoor garageDoor;
	
	public GarageDoorDownCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.down();		
	}

	@Override
	public void undo() {
		garageDoor.up();
	}

}
