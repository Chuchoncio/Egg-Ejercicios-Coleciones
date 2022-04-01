package servicios;

import entidades.CantanteFamoso;
import java.util.Scanner;

public class ServicioCantanteFamoso {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private static int nroCantante = 1;

    public ServicioCantanteFamoso() {
    }    
    
    public CantanteFamoso crearCantanteFamoso() {
        CantanteFamoso cf = new CantanteFamoso();
        
        System.out.println("INGRESO DE CANTANTE FAMOSO NRO " + nroCantante);
        nroCantante++;
        
        System.out.print("Ingrese nombre del artista: ");
        String nom = leer.next();
        cf.setNombre(nom);
        
        System.out.print("Ingrese disco con mas ventas: ");
        String discoMasVentas = leer.next();
        cf.setDiscoConMasVentas(discoMasVentas);
        
        return cf;
    }
    
}
