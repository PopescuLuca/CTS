package seminar1;

import Clase.Lion;
import Clase.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo=new Zoo();
		Lion lion1=new Lion("Leo");
		Lion lion2=new Lion("Leona");
		zoo.AddAnimal(lion1);
		zoo.AddAnimal(lion2);
		zoo.FeedAll();
	}

}
