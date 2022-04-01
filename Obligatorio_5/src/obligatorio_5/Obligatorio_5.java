
package obligatorio_5;

import entidades.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import servicios.ServicioPais;

public class Obligatorio_5 {

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
    
    public static void mostrarSetPaises(HashSet<Pais> conjunPaises) {
        for(Pais p : conjunPaises) {
            System.out.println(p);
        }
    }
    
    public static void mostrarListaPaises(ArrayList<Pais> listaPaises) {
        for(Pais p : listaPaises) {
            System.out.println(p);
        }
    }
    
    public static void main(String[] args) {
        HashSet<Pais> conjunPaises = new HashSet();
        Pais paisIngreso = new Pais();
        ServicioPais servPais = new ServicioPais();
        String msje = "Desea seguir ingresando paises? (s - si | n - no): ";
        char resp = ' ';
        Boolean paisElim = false;
        
        do{
            paisIngreso = servPais.crearPais();
            conjunPaises.add(paisIngreso);
            resp = validarOpcion(resp, msje, 's', 'n');
        }while(resp != 'n');
        
        mostrarSetPaises(conjunPaises);
        
        ArrayList<Pais> listaPaises = new ArrayList(conjunPaises);
        listaPaises.sort(Pais.compararNombre);
        System.out.println("Lista Paises ordenada");
        mostrarListaPaises(listaPaises);
        
        System.out.println("Ingrese un pais a eliminar: ");
        String paisBuscElim = leer.next();
        
        Iterator it = conjunPaises.iterator();
        
        while(it.hasNext()) {
            Pais paisAux = (Pais)it.next();
            
            if(paisAux.getNombre().equals(paisBuscElim)) {
                it.remove();
                paisElim = true;
            }
        }
        
        if(paisElim) {
            System.out.println(paisBuscElim + " eliminado de la lista");
            System.out.println("Lista Paises");
            listaPaises = new ArrayList(conjunPaises);
            mostrarListaPaises(listaPaises);
        }
        else {
            System.out.println(paisBuscElim + " no encontrado en la lista");
        }
    }

}
