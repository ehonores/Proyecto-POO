public class Reddit extends ContenidoAudiovisual {
    private String subreddit;
    private int upvotes;
    private int cantidadComentarios;

    public Reddit(String titulo, int duracionEnMinutos, String genero, String subreddit, int upvotes, int cantidadComentarios) {
        super(titulo, duracionEnMinutos, genero);
        this.subreddit = subreddit;
        this.upvotes = upvotes;
        this.cantidadComentarios = cantidadComentarios;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getCantidadComentarios() {
        return cantidadComentarios;
    }

    public void setCantidadComentarios(int cantidadComentarios) {
        this.cantidadComentarios = cantidadComentarios;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subreddit: r/" + subreddit + ", Upvotes: " + upvotes + ", Comentarios: " + cantidadComentarios;
    }
}