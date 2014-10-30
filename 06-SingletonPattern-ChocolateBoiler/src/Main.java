
public class Main {

	public static void main(String[] args) {
		System.out.println("##### First instance #####");
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		
		System.out.println("##### Second instance ##### ");
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		
	}

}
