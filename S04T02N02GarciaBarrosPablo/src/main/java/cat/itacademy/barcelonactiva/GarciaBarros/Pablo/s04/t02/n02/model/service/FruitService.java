package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.domain.IFruit;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.repository.Fruit;

@Service
public class FruitService implements IFruitService{

	@Autowired
	private IFruit fruit;
	
	@Override
	public List<Fruit> getAll() {
		return fruit.findAll();
	}

	@Override
	public Fruit getById(int id) {
		return fruit.getReferenceById(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(int id, int cant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int id, String name, int cant) {
		
		Fruit newFruit = new Fruit(id, name, cant);
		this.fruit.save(newFruit);
		
	}

	@Override
	public void updateStock(int id, int cant) {
		
		Fruit auxFruit = fruit.getReferenceById(id);
		auxFruit.addCant(cant);
		fruit.save(auxFruit);
		
		
	}


}
