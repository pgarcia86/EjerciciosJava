package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.service;

import java.util.List;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.repository.Fruit;

public interface IFruitService {
	
	public List<Fruit> getAll();
	
	public Fruit getById(int id);
	
	public void delete(int id);
	
	public void update(int id, int cant);
	
	public void add(int id, String name, int cant);
	
	public void updateStock(int id, int cant);

}
