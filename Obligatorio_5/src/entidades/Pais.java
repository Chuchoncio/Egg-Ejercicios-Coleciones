package entidades;

import java.util.Comparator;

public class Pais {
    private String nombre;
    private Long poblacion;
    private String formaGobierno;
    private String capital;

    public Pais() {
    }

    public Pais(String nombre, Long poblacion, String formaGobierno, String capital) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.formaGobierno = formaGobierno;
        this.capital = capital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Long poblacion) {
        this.poblacion = poblacion;
    }

    public String getFormaGobierno() {
        return formaGobierno;
    }

    public void setFormaGobierno(String formaGobierno) {
        this.formaGobierno = formaGobierno;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + ", poblacion=" + poblacion + ", formaGobierno=" + formaGobierno + '}';
    }
    
    public static Comparator<Pais> compararNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    };
}
