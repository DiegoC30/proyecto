package conn.mamartinez.encuentaapp.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Leyenda {

	@Id
	private int id;
	private String nombre; // Ejemplo: S, CS, AV
	private String descripcion; // Ejemplo: Siempre, Casi siempre, Algunas veces

	// Relación ManyToOne con Pregunta
	@ManyToOne
	private Pregunta pregunta;

	// Constructor sin parámetros (requerido por Hibernate)
	public Leyenda() {
	}

	// Constructor con parámetros
	public Leyenda(int id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
}
