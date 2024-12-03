package conn.mamartinez.encuentaapp.modelos;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Docente {

    // Getters y Setters
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // Clave primaria

	private String nombre;

}
