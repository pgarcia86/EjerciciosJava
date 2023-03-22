package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.service;

import java.util.List;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.repository.Fruit;

public interface IFruitService {
	
	public List<Fruit> getAll();
	
	public Fruit getById(int id);
	
	public void deleteById(int id);
	
	public void updateStock(Fruit fruit);
	
	public void add(Fruit fruit);
	

}
