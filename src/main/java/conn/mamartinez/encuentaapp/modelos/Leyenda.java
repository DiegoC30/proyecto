package conn.mamartinez.encuentaapp.modelos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Leyenda {

	private int id;
	private String nombre; //Ejemplo s, cs, av
	private String descripcion; //Ejemplo: siempre, casi siempre, algunas veces


	public Leyenda(int id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

}//end Leyenda