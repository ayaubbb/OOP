package lab3.task2;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Divable> oceanInhabitants = new ArrayList<>();
        
		oceanInhabitants.add(new Whale("Wheej"));
		oceanInhabitants.add(new Submarine("Ayaulym"));

        for (Divable explorer : oceanInhabitants) {
            explorer.move();
            explorer.dive(500);
            explorer.surface();
        }

	}

}
