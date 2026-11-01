public class Animacion extends ContenidoAudiovisual {
    private String tecnicaAnimacion; // Ej. Stop-Motion, CGI, Animación Tradicional
    private boolean esParaAdultos;

    public Animacion(String titulo, int duracionEnMinutos, String genero, String tecnicaAnimacion, boolean esParaAdultos) {
        super(titulo, duracionEnMinutos, genero);
        this.tecnicaAnimacion = tecnicaAnimacion;
        this.esParaAdultos = esParaAdultos;
    }

    public String getTecnicaAnimacion() {
        return tecnicaAnimacion;
    }

    public void setTecnicaAnimacion(String tecnicaAnimacion) {
        this.tecnicaAnimacion = tecnicaAnimacion;
    }

    public boolean isEsParaAdultos() {
        return esParaAdultos;
    }

    public void setEsParaAdultos(boolean esParaAdultos) {
        this.esParaAdultos = esParaAdultos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Técnica: " + tecnicaAnimacion + ", Para Adultos: " + (esParaAdultos ? "Sí" : "No");
    }
}