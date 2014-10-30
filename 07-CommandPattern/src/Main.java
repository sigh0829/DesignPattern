import com.example.party.GarageDoor;
import com.example.party.Light;
import com.example.party.command.GarageDoorOpenCommand;
import com.example.party.command.LightOnCommand;


public class Main {

	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		
		// Control the Light
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		simpleRemoteControl.setCommand(lightOn);
		simpleRemoteControl.buttonWasPressed();
		
		// Control the Light of the garageDoor
		GarageDoor garageDoor = new GarageDoor("");
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		simpleRemoteControl.setCommand(garageDoorOpen);
		simpleRemoteControl.buttonWasPressed();
		
		
	}

}
