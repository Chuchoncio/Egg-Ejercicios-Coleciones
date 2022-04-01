package entidades;

import java.util.ArrayList;
import java.util.Comparator;

public class Alumno {
    private String nombre;
    ArrayList<Integer> notas;

    public Alumno() {
        this.nombre = "";
        this.notas = new ArrayList();
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    public static Comparator<Alumno> compararNombre = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno al1, Alumno al2) {
            return al1.getNombre().compareTo(al2.getNombre());
        }
    };
}
