import com.example.adapter.TurkeyAdapter;
import com.example.duck.Duck;
import com.example.duck.MallarDuck;
import com.example.turkey.WildTurkey;


public class DuckTestDrive {

	public static void main(String[] args) {
		MallarDuck duck = new MallarDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);

	}
	
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
