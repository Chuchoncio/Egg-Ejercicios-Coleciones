
package obligatorio_3;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.AlumnoServicio;

public class Obligatorio_3 {
    
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static char validarOpcion(char opc, String msje, char resp1, char resp2) {
        System.out.println(msje);
        opc = leer.next().toLowerCase().charAt(0);
        while(opc != resp1 && opc != resp2) {
            System.out.println("Error en el ingreso! Las opcioens son: n - no | s - si");
            opc = leer.next().toLowerCase().charAt(0);
        }
        return opc;
    }

    public static void main(String[] args) {
        AlumnoServicio servAlum = new AlumnoServicio();
        ArrayList<Alumno> listaAlum = new ArrayList();
        Alumno alum = new Alumno();
        String msje = "Desea seguir ingresando alumnos? (s - si | n - no): ";
        char resp = ' ';     
        
        do {
            System.out.println("Ingreso del alumno");
            alum = servAlum.crearAlumno();
            listaAlum.add(alum);
            System.out.println("Alumno ingresado correctamente!");
            resp = validarOpcion(resp, msje, 's', 'n');
        }while(resp == 's');
        
        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombreBusc = leer.next();
        Double notaFinal = servAlum.notaFinal(listaAlum, nombreBusc);
        System.out.println("La nota final del alumno" + nombreBusc + " es: " + notaFinal);
    }        
}
