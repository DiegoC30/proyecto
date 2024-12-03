package conn.mamartinez.encuentaapp.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Pregunta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "pregunta_id") // Indica que `pregunta_id` será la clave foránea en `Leyenda`
	private List<Leyenda> leyendas;

	public Pregunta() {}

	public Pregunta(Long id, String nombre, List<Leyenda> leyendas) {
		this.id = id;
		this.nombre = nombre;
		this.leyendas = leyendas;
	}
}
