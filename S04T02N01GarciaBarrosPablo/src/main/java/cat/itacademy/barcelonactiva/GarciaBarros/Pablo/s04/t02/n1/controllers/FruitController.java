package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n1.model.repository.Fruta;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n1.model.services.FrutaService;



@Controller
//Con la notación controller establezco que esta clase es un controller
public class FruitController {
	
	@Autowired //Esta notación dice que debe instanciar un objeto de la siguiente instancia
	private FrutaService frutas;

	@GetMapping("/fruta")
	public String paginaInicial() {
		return "primeraPagina";
	}
	
	@PostMapping("/fruta/add")
	public String paginaAgregarProducto() {
		Fruta fruta = new Fruta();
		fruta.setId(7);
		fruta.setNombre("QUERELIMPION");
		fruta.setCant(25);
		frutas.addFruta(fruta);
		
		return "paginaAgregar";
	}
	
	@PostMapping("/fruta/update")
	public String paginaActualizadBaseDatos() {
		
		frutas.add(3, 50);		
		return "paginaActualizar";
	}
	
	@DeleteMapping("/fruta/delete/{id}")
	public String borrarPorId(@PathVariable("id") int id) {
		frutas.deleteFrutaId(id);
		return "paginaDelete";
	}
	
	@GetMapping("/fruta/getOne/{id}")
	public String getOne(@PathVariable("id") int id, Model model) {
		model.addAttribute("fruta", frutas.getFrutaId(id));
		return "paginaMostrarUno";
	}
	
	@GetMapping("fruta/getAll")
	public String getAll(Model model) {
		model.addAttribute("frutas", frutas.getAll());
		return "paginaMostrarTodos";
	}
	
}
