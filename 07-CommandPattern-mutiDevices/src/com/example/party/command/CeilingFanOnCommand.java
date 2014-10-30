package com.example.party.command;

import com.example.party.CeilingFan;

public class CeilingFanOnCommand implements Command {

	private int prevSpeed;
	private CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		switch (prevSpeed) {
		case CeilingFan.HIGH:
			ceilingFan.high();
			break;
			
		case CeilingFan.MEDIUM:
			ceilingFan.medium();
			break;
			
		case CeilingFan.LOW:
			ceilingFan.low();
			break;
			
		default:
			ceilingFan.off();
			break;
		}

	}

}
