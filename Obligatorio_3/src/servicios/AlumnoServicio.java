
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AlumnoServicio() {
    }
    
    public Alumno crearAlumno() {
        Alumno alum = new Alumno();
        ArrayList<Integer> listaNotas = new ArrayList();
        
        System.out.print("Ingrese nombre del alumno: ");
        String nom = leer.next();
        alum.setNombre(nom);
        
        System.out.println("Ingrese 3 notas del mismo");
        System.out.print("Nota 1: ");
        Integer nota1 = leer.nextInt();
        listaNotas.add(nota1);
        
        System.out.print("Nota 2: ");
        Integer nota2 = leer.nextInt();
        listaNotas.add(nota2);
        
        System.out.print("Nota 3: ");
        Integer nota3 = leer.nextInt();
        listaNotas.add(nota3);
        
        alum.setNotas(listaNotas);
        
        return alum;
    }
    
    public static Double notaFinal(ArrayList<Alumno> listaAlum, String nombreBusc) {
        Integer acumNotas = 0;
        Double promedioFinal = 0.0;
        
        for(Alumno alum : listaAlum) {
            if(alum.getNombre().compareTo(nombreBusc) == 0) {
                System.out.println("Alumno encontrado");
                for(Integer nota : alum.getNotas()) {
                    acumNotas += nota;
                }
                promedioFinal = (double)(acumNotas / 3);
                break;
            }   
        }
        
        return promedioFinal;
    }
}
