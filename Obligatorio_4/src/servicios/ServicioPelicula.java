package servicios;

import entidades.Pelicula;
import java.util.Scanner;

public class ServicioPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Pelicula crearPelicula() {
        Pelicula peli = new Pelicula();
        
        System.out.print("Ingrese titulo de la pelicula: ");
        String tit = leer.next();
        peli.setTitulo(tit);
        
        System.out.print("Ingrese nombre del director: ");
        String nomDir = leer.next();
        peli.setDirector(nomDir);
        
        System.out.print("Ingrese duracion de la pelicula (en horas): ");
        Integer durac = leer.nextInt();
        peli.setDuracion(durac);
        
        return peli;
    }
}
