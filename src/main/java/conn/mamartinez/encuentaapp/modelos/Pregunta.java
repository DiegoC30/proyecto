package conn.mamartinez.encuentaapp.modelos;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Pregunta {

	private int id;
	private String nombre;
	private List<Leyenda> lenyendas ;


	public Pregunta(int id, String nombre, List<Leyenda> lenyendas) {
		this.id = id;
		this.nombre = nombre;
		this.lenyendas = lenyendas;
	}


}

