import com.example.party.CeilingFan;
import com.example.party.GarageDoor;
import com.example.party.Light;
import com.example.party.Stereo;
import com.example.party.command.CeilingFanOffCommand;
import com.example.party.command.CeilingFanOnCommand;
import com.example.party.command.GarageDoorDownCommand;
import com.example.party.command.GarageDoorUpCommand;
import com.example.party.command.LightOffCommand;
import com.example.party.command.LightOnCommand;
import com.example.party.command.StereoOffWithCDCommand;
import com.example.party.command.StereoOnWithCDCommand;


public class Main {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
	
		Light livingRoomLight = new Light("Living Room");
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		Light kitchenLight = new Light("Kitchen Room");
		LightOnCommand kitchenLightLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightLightOff = new LightOffCommand(kitchenLight);
		
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoor garageDoor = new GarageDoor("");
		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
		
		Stereo stereo = new Stereo("Living Room");
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightLightOn, kitchenLightLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
		remoteControl.setCommand(4, stereoOn, stereoOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);
		remoteControl.onButtonWasPressed(3);
		remoteControl.offButtonWasPressed(3);
		remoteControl.onButtonWasPressed(4);
		remoteControl.offButtonWasPressed(4);

		
	}

}
