package conn.mamartinez.encuentaapp.modelos;



public class Leyenda {

	private int id;
	private String nombre; //Ejemplo s, cs, av
	private String descripcion; //Ejemplo: siempre, casi siempre, algunas veces


	public Leyenda(int id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}//end Leyenda