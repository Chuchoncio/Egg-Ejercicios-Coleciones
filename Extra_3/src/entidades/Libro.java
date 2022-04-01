package entidades;

public class Libro {
    private String titulo;
    private String autor;
    private Integer nroEjemplares;
    private Integer nroPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer nroEjemplares, Integer nroPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroEjemplares = nroEjemplares;
        this.nroPrestados = nroPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNroEjemplares() {
        return nroEjemplares;
    }

    public void setNroEjemplares(Integer nroEjemplares) {
        this.nroEjemplares = nroEjemplares;
    }

    public Integer getNroPrestados() {
        return nroPrestados;
    }

    public void setNroPrestados(Integer nroPrestados) {
        this.nroPrestados = nroPrestados;
    }

    @Override
    public String toString() {
        return "Titulo = " + titulo + " | Autor = " + autor + " | Ejemplares Disponibles = " +
               nroEjemplares + " | Ejemplares Prestados = " + nroPrestados;
    }  
}
