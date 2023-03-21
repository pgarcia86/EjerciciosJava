package cat.itacademy.barcelonactiva.GarciaBarros.Pablo.s04.t02.n02.model.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity

@Table(name="frutas")
public class Fruit {
	
	@Id
	@Column(name="id")
	
	private int id;
	
	@Column(name="name", length=50, nullable=false)
	private String name;
	
	@Column(name="cant")
	private int cant;
	
	public Fruit() {}
	
	public Fruit(int id, String name, int cant) {
		this.cant=cant;
		this.name=name;
		this.id=id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	
	public void addCant(int cant) {
		this.cant += cant;
	}
}
