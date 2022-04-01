
package extra_2;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import servicios.ServicioCantanteFamoso;

public class Extra_2 {
    
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void mostrarListaCantantes(ArrayList<CantanteFamoso> listaCF) {
        for(CantanteFamoso cf : listaCF) {
            System.out.println(cf);
        }
    }
    
    public static void menuOpciones() {
        System.out.println("1. Agregar un cantante mas\n"
                         + "2. Mostrar todos los cantantes\n"
                         + "3. Eliminar un cantante\n"
                         + "4. Salir del programa\n");
    }
    
    public static char elegirOpcion() {
        System.out.print("Ingrese la opcion: ");
        char opc = leer.next().charAt(0);
        return opc;
    }

    public static void main(String[] args) {
        ArrayList<CantanteFamoso> listaCF = new ArrayList();
        ServicioCantanteFamoso servCF = new ServicioCantanteFamoso();
        char opc;
        
        for(int i = 0; i < 5; i++){
            listaCF.add(servCF.crearCantanteFamoso());
            System.out.println("");
        }
        
        do{
            menuOpciones();
            opc = elegirOpcion();
            System.out.println("");
            switch(opc) {
                case '1':
                    listaCF.add(servCF.crearCantanteFamoso());
                    System.out.println("Agregando cantante...\n");
                    break;
                case '2':
                    System.out.println("Lista cantantes");
                    mostrarListaCantantes(listaCF);
                    break;
                case '3':
                    System.out.print("Ingrese nombre del cantante a eliminar: ");
                    String nomElim = leer.next();
                    Iterator ite = listaCF.iterator();
                    while(ite.hasNext()) {
                        CantanteFamoso auxCF = (CantanteFamoso)ite.next();
                        if(auxCF.getNombre().equals(nomElim)) {
                            ite.remove();
                            System.out.println("Cantante eliminado!\n");
                            break;
                        }
                    }
                    break;
                case '4':
                    System.out.println("Saliendo del programa...");
                    break;
                default: System.out.println("Opcion incorrecta, re-ingresela!");
            }
            System.out.println("");
        }while(opc != '4');
    }

}
