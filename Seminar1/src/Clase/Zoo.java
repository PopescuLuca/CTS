package Clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> lista;
	public Zoo() {
		super();
		this.zookeeper=new Zookeeper ("gigel");
		this.lista=new ArrayList<>();
	}
	public Zoo(Zookeeper zookeeper, List<Animal> lista) {
		super();
		this.zookeeper = zookeeper;
		this.lista = lista;
	}
	public void AddAnimal(Animal a) {
		lista.add(a);
	}
	public void FeedAll() {
		for(Animal animal : lista) {
			zookeeper.feed(animal);
		}
	}
}
