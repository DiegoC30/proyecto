package conn.mamartinez.encuentaapp;

import conn.mamartinez.encuentaapp.DAO.RespuestaDAO;
import conn.mamartinez.encuentaapp.modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RespuestaDAO respuestaDAO = new RespuestaDAO();
        Scanner scanner = new Scanner(System.in);

        // Crear curso y docente
        Curso curso1 = new Curso(null, "Matemáticas", "Curso básico de matemáticas");
        Docente docente1 = new Docente(null, "Juan", "Pérez", "juan.perez@example.com", "Profesor de Matemáticas");

        // Crear y guardar leyendas
        Leyenda leyendaS = new Leyenda("S", "Siempre");
        Leyenda leyendaCS = new Leyenda("CS", "Casi Siempre");
        Leyenda leyendaAV = new Leyenda("AV", "Algunas Veces");
        Leyenda leyendaE = new Leyenda("E", "Excelente");
        Leyenda leyendaMB = new Leyenda("MB", "Muy Bueno");
        Leyenda leyendaB = new Leyenda("B", "Bueno");
        Leyenda leyendaR = new Leyenda("R", "Regular");

        respuestaDAO.guardarEntidad(leyendaS);
        respuestaDAO.guardarEntidad(leyendaCS);
        respuestaDAO.guardarEntidad(leyendaAV);
        respuestaDAO.guardarEntidad(leyendaE);
        respuestaDAO.guardarEntidad(leyendaMB);
        respuestaDAO.guardarEntidad(leyendaB);
        respuestaDAO.guardarEntidad(leyendaR);

        // Preguntas de Autoreflexión del Estudiante
        List<Pregunta> preguntasAutoreflexion = new ArrayList<>();
        preguntasAutoreflexion.add(new Pregunta(null, "¿Asistí a las sesiones presenciales y/o sincrónicas de esta asignatura?", List.of(leyendaS, leyendaCS, leyendaAV)));
        preguntasAutoreflexion.add(new Pregunta(null, "Realicé las actividades evaluativas propuestas por el docente en esta asignatura", List.of(leyendaS, leyendaCS, leyendaAV)));
        preguntasAutoreflexion.add(new Pregunta(null, "¿Me siento satisfecho con lo aprendido?", List.of(leyendaS, leyendaCS, leyendaAV)));

        // Preguntas de Evaluación del Docente
        List<Pregunta> preguntasDocente = new ArrayList<>();
        preguntasDocente.add(new Pregunta(null, "Planifica y desarrolla las actividades de acuerdo al contenido y competencias establecidas en el syllabus", List.of(leyendaE, leyendaMB, leyendaB, leyendaR)));
        preguntasDocente.add(new Pregunta(null, "Utiliza diferentes recursos tecnológicos para el desarrollo de las estrategias de aprendizaje", List.of(leyendaE, leyendaMB, leyendaB, leyendaR)));
        preguntasDocente.add(new Pregunta(null, "Promueve el aprendizaje en equipo con apoyo de las TIC", List.of(leyendaE, leyendaMB, leyendaB, leyendaR)));

        // Preguntas de Competencias Tecnológicas
        List<Pregunta> preguntasTecnologicas = new ArrayList<>();
        preguntasTecnologicas.add(new Pregunta(null, "Demuestra dominio de los recursos tecnológicos", List.of(leyendaE, leyendaMB, leyendaB, leyendaR)));
        preguntasTecnologicas.add(new Pregunta(null, "Hace uso adecuado de las TIC para la construcción del conocimiento", List.of(leyendaE, leyendaMB, leyendaB, leyendaR)));
        preguntasTecnologicas.add(new Pregunta(null, "Dominio y uso de la plataforma UAM virtual", List.of(leyendaE, leyendaMB, leyendaB, leyendaR)));

        // Guardar curso y docente
        respuestaDAO.guardarEntidad(curso1);
        respuestaDAO.guardarEntidad(docente1);

        // Guardar preguntas
        List<Pregunta> todasPreguntas = new ArrayList<>();
        todasPreguntas.addAll(preguntasAutoreflexion);
        todasPreguntas.addAll(preguntasDocente);
        todasPreguntas.addAll(preguntasTecnologicas);

        for (Pregunta pregunta : todasPreguntas) {
            respuestaDAO.guardarEntidad(pregunta);
        }

        // Recolectar respuestas dinámicamente
        List<Respuesta> respuestas = new ArrayList<>();
        System.out.println("Por favor responda las siguientes preguntas:");

        for (Pregunta pregunta : todasPreguntas) {
            System.out.println(pregunta.getNombre());
            System.out.println("Opciones:");
            for (Leyenda leyenda : pregunta.getLeyendas()) {
                System.out.println(leyenda.getNombre() + ": " + leyenda.getDescripcion());
            }

            String respuestaCodigo;
            while (true) {
                System.out.print("Ingrese su respuesta (código): ");
                respuestaCodigo = scanner.nextLine().trim().toUpperCase();

                // Crear una variable temporal para usar en la lambda
                String finalRespuestaCodigo = respuestaCodigo;

                boolean opcionValida = pregunta.getLeyendas().stream()
                        .anyMatch(leyenda -> leyenda.getNombre().equalsIgnoreCase(finalRespuestaCodigo));
                if (opcionValida) break;
                System.out.println("Respuesta inválida, intente nuevamente.");
            }

            // Usar otra variable temporal para filtrar la selección
            String finalRespuestaCodigo = respuestaCodigo;
            Leyenda leyendaSeleccionada = pregunta.getLeyendas().stream()
                    .filter(leyenda -> leyenda.getNombre().equalsIgnoreCase(finalRespuestaCodigo))
                    .findFirst()
                    .orElse(null);

            respuestas.add(new Respuesta("2024", curso1, docente1, pregunta, leyendaSeleccionada));
        }

        // Guardar las respuestas en la base de datos
        for (Respuesta respuesta : respuestas) {
            respuestaDAO.guardarRespuesta(respuesta);
        }

        respuestaDAO.cerrar();
        scanner.close();
        System.out.println("Respuestas guardadas con éxito.");
    }
}f
