package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n1.model.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n1.model.domain.IFruta;
import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n1.model.repository.Fruta;

@Service
//Con esta notación establezco que esta clase es un Service

public class FrutaService implements IFrutaService{
//Implemento los métodos de la clase IFrutaService
	
	
	@Autowired	//Instancia lo que sigue
	private IFruta frutas;
	
	public List<Fruta> getAll(){
		return frutas.findAll();
	}
	
	public Fruta getFrutaId(int id) {
		return frutas.getReferenceById(id);
	}
	
	public void deleteFrutaId(int id) {
		frutas.delete(frutas.getReferenceById(id));
	}
	
	public void addFruta(Fruta fruta) {
		frutas.save(fruta);
	}
	
	public void add(int id, int cant) {
		Fruta frutaAux = new Fruta();
		frutaAux = frutas.getReferenceById(id);
		frutaAux.agregarCant(cant);
		frutas.save(frutaAux);
	}
}
