import java.awt.Robot;

import com.example.abstractclass.Duck;
import com.example.abstractclass.RealDuck;
import com.example.abstractclass.RockDuck;


public class TestDuck {

	public static void main(String[] args) {
		Duck duck = new RockDuck();
		duck.display();
		duck.swim();
		duck.performFly();
		duck.performQuack();
	}

}
