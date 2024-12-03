package conn.mamartinez.encuentaapp.modelos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Curso {


	private int id;
	private String nombre;
	private String descripcion;

	public Curso(int id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

}//end Curso