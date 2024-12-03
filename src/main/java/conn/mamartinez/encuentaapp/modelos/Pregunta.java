package conn.mamartinez.encuentaapp.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Pregunta {

	@Id
	private int id;
	private String nombre;

	// Relación OneToMany con Leyenda
	@OneToMany(mappedBy = "pregunta")
	private List<Leyenda> leyendas;

	// Constructor sin parámetros (requerido por Hibernate)
	public Pregunta() {
	}

	// Constructor con parámetros
	public Pregunta(int id, String nombre, List<Leyenda> leyendas) {
		this.id = id;
		this.nombre = nombre;
		this.leyendas = leyendas;
	}
}

