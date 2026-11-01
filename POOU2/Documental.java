public class Documental extends ContenidoAudiovisual {
    private String tematica;
    private Investigador investigador;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tematica, Investigador investigador) {
        super(titulo, duracionEnMinutos, genero);
        this.tematica = tematica;
        this.investigador = investigador;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public Investigador getInvestigador() {
        return investigador;
    }

    public void setInvestigador(Investigador investigador) {
        this.investigador = investigador;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temática: " + tematica + ", Investigador: " + investigador;
    }
}