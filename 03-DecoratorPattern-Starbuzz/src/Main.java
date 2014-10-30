import com.example.abstractclass.Beverage;
import com.example.condiment.Mocha;
import com.example.condiment.Soy;
import com.example.condiment.Whip;
import com.example.products.Espresso;
import com.example.products.HouseBlend;


public class Main {

	public static void main(String[] args) {
		Beverage espressoBeverage = new Espresso();
		System.out.println(espressoBeverage.getDescription() + " $" + espressoBeverage.cost());
		
		Beverage houseBlendBeverage = new HouseBlend();
		houseBlendBeverage = new Soy(houseBlendBeverage);
		houseBlendBeverage = new Mocha(houseBlendBeverage);
		houseBlendBeverage = new Whip(houseBlendBeverage);
		System.out.println(houseBlendBeverage.getDescription() + " $" + houseBlendBeverage.cost());

	}

}
