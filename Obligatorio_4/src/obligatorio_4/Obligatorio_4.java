package obligatorio_4;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioPelicula;

public class Obligatorio_4 {
    
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
    
    public static void mostrarListaPeliculas(ArrayList<Pelicula> listaPelis) {
        for(Pelicula pel : listaPelis) {
            System.out.println(pel);
        }
    }
    
    public static void mostrarListaPeliculasMayorUnaHora(ArrayList<Pelicula> listaPelis) {
        for(Pelicula pel : listaPelis) {
            if(pel.getDuracion() > 1) {
                System.out.println(pel);
            }
        }
    }

    public static void main(String[] args) {
        ServicioPelicula servPeli = new ServicioPelicula();
        Pelicula peli = new Pelicula();
        ArrayList<Pelicula> listaPelis = new ArrayList();
        String msje = "Desea seguir ingresando peliculas? (s - si | n - no): ";
        char resp = ' ';
        
        do{
            System.out.println("Ingreso de pelicula");
            peli = servPeli.crearPelicula();
            listaPelis.add(peli);
            resp = validarOpcion(resp, msje, 's', 'n');
        }while(resp != 'n');
        
        System.out.println("\nLista de peliculas");
        System.out.println("----------------------------------------------------");
        mostrarListaPeliculas(listaPelis);
        
        System.out.println("\nLista de peliculas con duracion mayor a 1 hora");
        System.out.println("----------------------------------------------------");
        mostrarListaPeliculasMayorUnaHora(listaPelis);
        
        System.out.println("\nPeliculas ordenadas segun su duracion (mayor a menor)");
        System.out.println("----------------------------------------------------");
        listaPelis.sort(Pelicula.compararDuracionMenor);
        mostrarListaPeliculas(listaPelis);
        
        System.out.println("\nPeliculas ordenadas segun su duracion (menor a mayor)");
        System.out.println("----------------------------------------------------");
        listaPelis.sort(Pelicula.compararDuracionMayor);
        mostrarListaPeliculas(listaPelis);
        
        System.out.println("\nPeliculas ordenadas por titulo alfabeticamente");
        System.out.println("----------------------------------------------------");
        listaPelis.sort(Pelicula.compararTitulo);
        mostrarListaPeliculas(listaPelis);
        
        System.out.println("\nPeliculas ordenadas por director alfabeticamente");
        System.out.println("----------------------------------------------------");
        listaPelis.sort(Pelicula.compararDirector);
        mostrarListaPeliculas(listaPelis);
    }
}
