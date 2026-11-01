import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creación de actores para las películas
        Actor actor1 = new Actor("Keanu Reeves", "Canadiense", 61);
        Actor actor2 = new Actor("Carrie-Anne Moss", "Canadiense", 58);

        List<Actor> actoresPelicula = new ArrayList<>();
        actoresPelicula.add(actor1);
        actoresPelicula.add(actor2);

        // Creación de una Película (Herencia y Asociación)
        Pelicula pelicula = new Pelicula("Matrix", 136, "Ciencia Ficción", "Hermanas Wachowski", actoresPelicula);

        // Creación de temporadas para una serie
        List<Temporada> temporadasSerie = new ArrayList<>();
        temporadasSerie.add(new Temporada(1, 8));
        temporadasSerie.add(new Temporada(2, 10));

        // Creación de una Serie de TV
        SerieDeTV serie = new SerieDeTV("Stranger Things", 50, "Suspenso", 2, temporadasSerie);

        // Creación de un Investigador para el documental
        Investigador investigador = new Investigador("Jane Goodall", "Primatología", 60);

        // Creación de un Documental
        Documental documental = new Documental("Los Secretos de la Naturaleza", 90, "Documental", "Vida Silvestre", investigador);

        // Creación de contenido de Reddit (Clase 8)
        Reddit postReddit = new Reddit("Resumen de Noticias Semanal", 15, "Informativo", "ecuador", 450, 89);

        // Creación de una Animación
        Animacion animacion = new Animacion("Spider-Man: Across the Spider-Verse", 140, "Animación", "CGI / Estilo Mixto", false);

        // Lista para almacenar todo el contenido audiovisual
        List<ContenidoAudiovisual> listaContenidos = new ArrayList<>();
        listaContenidos.add(pelicula);
        listaContenidos.add(serie);
        listaContenidos.add(documental);
        listaContenidos.add(postReddit);
        listaContenidos.add(animacion);

        // Mostrar la información de cada contenido
        System.out.println("=== LISTA DE CONTENIDO AUDIOVISUAL ===");
        for (ContenidoAudiovisual contenido : listaContenidos) {
            System.out.println(contenido);
            System.out.println("--------------------------------------------------");
        }
    }
}