
package servicios;

import entidades.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioLibro {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static Integer nroLibro = 1;
    
    public Libro crearLibro() {
        Libro lib = new Libro();
        
        System.out.println("INGRESO DE DATOS DEL LIBRO NRO " + nroLibro);
        nroLibro++;
        
        System.out.print("Ingrese titulo del libro: ");
        String title = leer.next();
        lib.setTitulo(title);
        
        System.out.print("Ingrese autor del libro: ");
        String author = leer.next();
        lib.setAutor(author);
        
        System.out.print("Ingrse nro de ejemplares disponibles: ");
        Integer nEjemp = leer.nextInt();
        lib.setNroEjemplares(nEjemp);
        
        System.out.print("Ingrese nro de ejemplares prestados: ");
        Integer nPrest = leer.nextInt();
        lib.setNroPrestados(nPrest);
        
        return lib;
    }
    
    public Boolean realizarPrestamo(HashSet<Libro> setLib, String libPrestamo) {
        Iterator ite = setLib.iterator();
        Boolean resp = false;
        
        while(ite.hasNext()) {
            Libro auxLib = (Libro)ite.next();
            if(auxLib.getTitulo().equals(libPrestamo)) {
                Integer ejemplaresDisponibles = auxLib.getNroEjemplares();
                if(ejemplaresDisponibles > 0) {
                    Integer ejemplaresPrestados = auxLib.getNroPrestados();
                    auxLib.setNroEjemplares(ejemplaresDisponibles - 1);
                    auxLib.setNroPrestados(ejemplaresPrestados + 1);
                    ite.remove();
                    setLib.add(auxLib);
                    resp = true;
                    break;
                } 
            }
        }
        
        return resp;
    }
    
    public Boolean realizarDevolucion(HashSet<Libro> setLib, String libPrestamo) {
        Iterator ite = setLib.iterator();
        Boolean resp = false;
        
        while(ite.hasNext()) {
            Libro auxLib = (Libro)ite.next();
            if(auxLib.getTitulo().equals(libPrestamo)) {
                Integer ejemplaresPrestados = auxLib.getNroPrestados();
                if(ejemplaresPrestados > 0) {
                    Integer ejemplaresDisponibles = auxLib.getNroEjemplares();
                    auxLib.setNroEjemplares(ejemplaresDisponibles + 1);
                    auxLib.setNroPrestados(ejemplaresPrestados - 1);
                    ite.remove();
                    setLib.add(auxLib);
                    resp = true;
                    break;
                }
            }
        }
        
        return resp;
    }
}
