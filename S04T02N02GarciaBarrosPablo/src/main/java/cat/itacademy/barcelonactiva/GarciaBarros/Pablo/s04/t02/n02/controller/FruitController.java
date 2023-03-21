package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.service.FruitService;

@Controller
public class FruitController {
	
	@Autowired
	private FruitService fruits;
	
	
	@GetMapping("/frutas/getAll")
	public String getAll(Model model) {
		model.addAttribute("fruits", fruits.getAll());
		return "getAllPage";
	}
	
	@PostMapping("/frutas/add/{id}/{name}/{cant}")
	public String add(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("cant") int cant) {		
		fruits.add(id,name, cant);
		return "addPage";
	}
	
	@PostMapping("/frutas/updateStock/{id}/{cant}")
	public String updateStock(@PathVariable int id, @PathVariable("cant") int cant) {
		fruits.updateStock(id, cant);
		return "updateStock";
	}

}
