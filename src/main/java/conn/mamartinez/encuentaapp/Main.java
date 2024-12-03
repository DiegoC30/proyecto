package conn.mamartinez.encuentaapp;

import conn.mamartinez.encuentaapp.DAO.RespuestaDAO;
import conn.mamartinez.encuentaapp.modelos.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear las leyendas (opciones de respuesta)
        Leyenda siempre = new Leyenda(1, "S", "Siempre");
        Leyenda casiSiempre = new Leyenda(2, "CS", "Casi siempre");
        Leyenda algunasVeces = new Leyenda(3, "AV", "Algunas veces");
        Leyenda excelente = new Leyenda(4, "E", "Excelente");
        Leyenda muyBueno = new Leyenda(5, "MB", "Muy Bueno");
        Leyenda bueno = new Leyenda(6, "B", "Bueno");
        Leyenda regular = new Leyenda(7, "R", "Regular");
        Leyenda si = new Leyenda(8, "SI", "Sí");
        Leyenda no = new Leyenda(9, "NO", "No");

        // Crear las preguntas divididas por secciones
        List<Pregunta> preguntas = new ArrayList<>();

        // Sección: Autoreflexión del Estudiante
        preguntas.add(new Pregunta(1, "¿Asistí a las sesiones presenciales y/o sincrónicas de esta asignatura?", List.of(siempre, casiSiempre, algunasVeces)));
        preguntas.add(new Pregunta(2, "¿Realicé las actividades evaluativas propuestas por el docente en esta asignatura?", List.of(siempre, casiSiempre, algunasVeces)));
        preguntas.add(new Pregunta(3, "¿Me siento satisfecho con lo aprendido?", List.of(siempre, casiSiempre, algunasVeces)));
        preguntas.add(new Pregunta(4, "Al iniciar la asignatura: ¿Comunicó y explicó detalladamente el programa o syllabus y las formas de evaluación?", List.of(si, no)));

        // Sección: Evaluación del Docente
        preguntas.add(new Pregunta(5, "Planifica y desarrolla las actividades de acuerdo al contenido y competencias establecidas en el syllabus", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(6, "Utiliza diferentes recursos tecnológicos para el desarrollo de las estrategias de aprendizaje", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(7, "Promueve el aprendizaje en equipo con apoyo de las TIC (Tecnologías de la información y la comunicación)", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(8, "Utiliza la bibliografía recomendada y otras fuentes de información actualizadas en el contexto que sirven para consolidar y profundizar los conocimientos.", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(9, "Proporciona material de estudio (Documentos, diapositivas, videos, infografías, páginas web, entre otros) para el desarrollo del aprendizaje autónomo", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(10, "Motiva al estudiante durante el aprendizaje", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(11, "Asesora oportunamente a los estudiantes sobre las dudas que surgen en la clase.", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(12, "Las evaluaciones que realiza son orientadas con claridad y presenta los criterios y formas de evaluación", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(13, "Retroalimenta adecuadamente los resultados de las actividades de aprendizaje asignadas en la plataforma virtual o en el aula de clases.", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(14, "Atiende las dificultades de los estudiantes cuando estas surgen.", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(15, "Trata a todos con equidad, respeto y cordialidad", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(16, "Mantiene una relación cordial y respetuosa", List.of(excelente, muyBueno, bueno, regular)));

        // Sección: Competencias Tecnológicas
        preguntas.add(new Pregunta(17, "Demuestra dominio de los recursos tecnológicos", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(18, "Hace uso adecuado de las TIC para la construcción del conocimiento", List.of(excelente, muyBueno, bueno, regular)));
        preguntas.add(new Pregunta(19, "Dominio y uso de la plataforma UAM virtual", List.of(excelente, muyBueno, bueno, regular)));

        // Crear curso y docente
        Curso curso = new Curso(1, "Matemáticas 101", "Curso básico de matemáticas");
        Docente docente = new Docente(1, "Juan", "Pérez", "juan.perez@example.com", "Licenciado en Matemáticas");

        // Inicializar Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar DAO
        RespuestaDAO respuestaDAO = new RespuestaDAO();

        // Crear lista para almacenar respuestas localmente
        List<Respuesta> respuestas = new ArrayList<>();

        // Recorrer cada pregunta, mostrarla y registrar la respuesta del usuario
        for (Pregunta pregunta : preguntas) {
            System.out.println(pregunta.getNombre());
            System.out.println("Opciones:");

            for (Leyenda leyenda : pregunta.getLenyendas()) {
                System.out.println(leyenda.getId() + ". " + leyenda.getDescripcion());
            }

            // Leer respuesta del usuario
            int respuestaId = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            // Buscar la leyenda seleccionada
            Leyenda respuestaSeleccionada = pregunta.getLenyendas().stream()
                    .filter(l -> l.getId() == respuestaId)
                    .findFirst()
                    .orElse(null);

            if (respuestaSeleccionada != null) {
                Respuesta respuesta = new Respuesta(
                        respuestas.size() + 1, LocalDate.now(), "2024-1", curso, docente, pregunta, respuestaSeleccionada
                );

                // Guardar respuesta en la base de datos
                respuestaDAO.guardarRespuesta(respuesta);

                // Agregar respuesta a la lista local
                respuestas.add(respuesta);
            }
        }

        // Imprimir todas las respuestas registradas
        System.out.println("\nRespuestas registradas:");
        for (Respuesta respuesta : respuestas) {
            System.out.println("Pregunta: " + respuesta.getPregunta().getNombre());
            System.out.println("Respuesta: " + respuesta.getLeyenda().getDescripcion());
        }

        // Cerrar recursos
        respuestaDAO.cerrar();
        scanner.close();
    }
}