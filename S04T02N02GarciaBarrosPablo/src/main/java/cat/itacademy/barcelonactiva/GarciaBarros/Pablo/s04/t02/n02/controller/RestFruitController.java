package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.repository.Fruit;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.service.FruitService;


@RestController //Indico que este es el controlador Rest
@RequestMapping("/frutas")
public class RestFruitController {
	
	@Autowired //Creara una instancia del objeto de debajo
	private FruitService fruits;
	
	
	@GetMapping("/getAll")
	public List<Fruit> getAll() {
		//model.addAttribute("fruits", fruits.getAll());
		return fruits.getAll();
	}
	
	@GetMapping("/getOne/{id}")
	public Fruit getOne(@PathVariable("id") int id) {
		return fruits.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Fruit fruit) {	//RequestBody es para que convierta el archivo de formato JSON en un objeto
		fruits.add(fruit);
	}
	
	@PutMapping("/update")
	public void updateStock(@RequestBody Fruit fruit) {
		fruits.updateStock(fruit);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		fruits.deleteById(id);
	}

}
