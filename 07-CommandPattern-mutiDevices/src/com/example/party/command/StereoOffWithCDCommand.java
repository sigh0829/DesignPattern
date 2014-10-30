package com.example.party.command;

import com.example.party.Stereo;

public class StereoOffWithCDCommand implements Command{

	private Stereo stereo;
	
	public StereoOffWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {
		stereo.on();
	}

}
