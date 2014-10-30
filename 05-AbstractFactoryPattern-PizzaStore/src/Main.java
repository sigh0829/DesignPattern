import com.example.pizza.Pizza;
import com.example.pizzastore.ChicagoStylePizzaStore;
import com.example.pizzastore.NYStylePizzaStore;
import com.example.pizzastore.PizzaStore;


public class Main {

	public static void main(String[] args) {
		Pizza pizza = null;
		
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		pizza = nyPizzaStore.orderPizza("cheese");
		pizza.printPizzaContent();

		System.out.println("#########################");
		
		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		pizza = chicagoPizzaStore.orderPizza("clams");
		pizza.printPizzaContent();
	}

}
