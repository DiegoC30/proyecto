package conn.mamartinez.encuentaapp.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Leyenda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	private String descripcion;

	public Leyenda() {}

	public Leyenda(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
}
