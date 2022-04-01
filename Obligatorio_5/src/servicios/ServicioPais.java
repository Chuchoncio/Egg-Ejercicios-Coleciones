package servicios;

import entidades.Pais;
import java.util.Scanner;

public class ServicioPais {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pais crearPais() {
        Pais nuevoP = new Pais();
        
        System.out.println("Ingreso de datos del PAIS");
        
        System.out.print("Ingrese nombre del pais: ");
        String nom = leer.next();
        nuevoP.setNombre(nom);
        
        System.out.print("Ingrese capital del pais: ");
        String cap = leer.next();
        nuevoP.setCapital(cap);
        
        System.out.print("Ingrese tamanio de la poblacion: ");
        Long tamPob = leer.nextLong();
        nuevoP.setPoblacion(tamPob);
        
        System.out.print("Ingrese forma de gobierno: ");
        String formGob = leer.next();
        nuevoP.setFormaGobierno(formGob);
        
        return nuevoP;
    }
    
}
