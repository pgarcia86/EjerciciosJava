package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n1.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n1.model.repository.Fruta;

public interface IFrutaService{
	
	public List<Fruta> getAll();
	
	public Fruta getFrutaId(int id);
	
	public void deleteFrutaId(int id);
	
	public void addFruta(Fruta fruta);
	
	public void add(int id, int cant);

}
