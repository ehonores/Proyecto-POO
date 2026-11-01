import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private int numeroTemporadas;
    private List<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numeroTemporadas, List<Temporada> temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.numeroTemporadas = numeroTemporadas;
        this.temporadas = temporadas;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Temporadas: " + numeroTemporadas + ", Temporadas: " + temporadas;
    }
}