package conn.mamartinez.encuentaapp.modelos;


import java.util.List;

public class Pregunta {

	private int id;
	private String nombre;
	private List<Leyenda> lenyendas ;


	public Pregunta(int id, String nombre, List<Leyenda> lenyendas) {
		this.id = id;
		this.nombre = nombre;
		this.lenyendas = lenyendas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Leyenda> getLenyendas() {
		return lenyendas;
	}

	public void setLenyendas(List<Leyenda> lenyendas) {
		this.lenyendas = lenyendas;
	}
}

