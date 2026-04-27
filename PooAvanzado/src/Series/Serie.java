package Series;

public class Serie {
    String titulo;
    int num_temporada;
    boolean entregado;
    String genero;
    String creador;

    public Serie () {
        titulo = "";
        num_temporada = 3;
        entregado = false;
        genero = "";
        creador = "";
    }

    public Serie (String titulo, String creador) {
        new Serie();
        this.titulo = titulo;
        this.creador = creador;

    }

    public Serie(String titulo, int num_temporada, String genero, String creador) {
        this.titulo = titulo;
        this.num_temporada = num_temporada;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNum_temporada() {
        return num_temporada;
    }

    public void setNum_temporada(int num_temporada) {
        this.num_temporada = num_temporada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString () {
        return "Titulo: " + titulo + "\n Numero de tempradas: " + num_temporada + "\n Genero: " + genero + "\n Creador: " + creador;
    }
}
