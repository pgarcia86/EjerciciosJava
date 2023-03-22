package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.domain.IFruit;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.repository.Fruit;

@Service
public class FruitService implements IFruitService{

	@Autowired //Cuando tenga que instanciar el objeto de debajo, creará una instancia de ese tipo
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
	public void deleteById(int id) {
		fruit.deleteById(id);
	}

	@Override
	public void add(@RequestBody Fruit fruit) {		
		this.fruit.save(fruit);		
	}

	@Override
	public void updateStock(Fruit fruit) {		
		this.fruit.save(fruit);		
	}
}
