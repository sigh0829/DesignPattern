import com.example.pizzastore.ChicagoStylePizzaStore;
import com.example.pizzastore.NYStylePizzaStore;
import com.example.pizzastore.PizzaStore;


public class Main {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		nyPizzaStore.orderPizza("cheese");

		System.out.println("#########################");
		
		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		chicagoPizzaStore.orderPizza("cheese");

	}

}
