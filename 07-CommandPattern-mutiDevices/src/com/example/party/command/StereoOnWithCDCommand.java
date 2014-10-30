package com.example.party.command;

import com.example.party.Stereo;

public class StereoOnWithCDCommand implements Command{

	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

	@Override
	public void undo() {
		stereo.off();
		
	}

}
