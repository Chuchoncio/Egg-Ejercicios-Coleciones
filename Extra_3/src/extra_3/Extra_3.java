
package extra_3;

import entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;
import servicios.ServicioLibro;

public class Extra_3 {
    
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static char validarOpcion(char opc, String msje, char resp1, char resp2) {
        System.out.println(msje);
        opc = leer.next().toLowerCase().charAt(0);
        while(opc != resp1 && opc != resp2) {
            System.out.println("Error en el ingreso! Las opciones son: "
                    + resp1 + " o " + resp2);
            opc = leer.next().toLowerCase().charAt(0);
        }
        return opc;
    }
    
    public static void mostrarConjunLibros(HashSet<Libro> conjunLib) {
        for(Libro lib : conjunLib) {
            System.out.println(lib);
        }
    }

    public static void main(String[] args) {
        String msje = "Desea seguir ingresando libros? (s - si | n - no): ";
        char resp = ' ';
        ServicioLibro servLib = new ServicioLibro();        
        HashSet<Libro> conjunLibros = new HashSet();
        
        do{
            conjunLibros.add(servLib.crearLibro());
            resp = validarOpcion(resp, msje, 's', 'n');
        }while(resp != 'n');
        
        mostrarConjunLibros(conjunLibros);
        
        System.out.print("Ingrese titulo del libro que desea pedir prestado: ");
        String libPrestamo = leer.next();
        if(servLib.realizarPrestamo(conjunLibros, libPrestamo))
            System.out.println("Operacion realizada correctamente");
        else
            System.out.println("No quedan mas ejemplares por prestar!");
        
        mostrarConjunLibros(conjunLibros);

        System.out.print("Ingrese titulo del libro que desea devolver: ");
        String libDevolver = leer.next();
        if(servLib.realizarDevolucion(conjunLibros, libDevolver))
            System.out.println("Operacion realizada correctamente");
        else
            System.out.println("No quedan libros por devolver!");
        
        mostrarConjunLibros(conjunLibros);
    }
}
