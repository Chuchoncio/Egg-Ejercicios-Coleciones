
package obligatorio_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Obligatorio_1 {
    
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void ingresoDatosLista(ArrayList<String> lista) {
        System.out.print("Ingrese raza de perro: ");
        
        String razaPerroInput;
        razaPerroInput = leer.next();
        lista.add(razaPerroInput);
    }
    
    public static char validarOpcion(char opc, char resp1, char resp2) {
        System.out.println("Desea seguir ingresando razas? (n - no | s - si)");
        opc = leer.next().toLowerCase().charAt(0);
        while(opc != resp1 && opc != resp2) {
            System.out.println("Error en el ingreso! Las opcioens son: n - no | s - si");
            opc = leer.next().toLowerCase().charAt(0);
        }
        return opc;
    }
    
    public static void mostrarDatosListaPerro(ArrayList<String> lista) {
        for(String elem : lista) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> listaRazasPerros = new ArrayList();
        String perroIng;
        Boolean perroBorrado = false;
        char opcion = ' ';
        
        do {
            ingresoDatosLista(listaRazasPerros);
            opcion = validarOpcion(opcion, 's', 'n');
        }while(opcion != 'n');
        
        System.out.println("Las razas ingresadas son las siguientes: ");
        mostrarDatosListaPerro(listaRazasPerros);
        
        System.out.println("Ingrese un perro a eliminar: ");
        perroIng = leer.next();
        
        Iterator ite = listaRazasPerros.iterator();
        
        while(ite.hasNext()) {
            if(ite.next().equals(perroIng)) {
                ite.remove();
                perroBorrado = true;
                break;
            }
        }
        
        Collections.sort(listaRazasPerros);
        if(perroBorrado == true)
            System.out.println("Perro eliminado de la lista");
        else
            System.out.println("Perro no encontrado en la lista");
        
        mostrarDatosListaPerro(listaRazasPerros);
    }

}
