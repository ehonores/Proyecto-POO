import java.util.List;

public class Pelicula extends ContenidoAudiovisual {
    private String director;
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String director, List<Actor> actores) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.actores = actores;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Actores: " + actores;
    }
}