
package extra_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra_1 {
    
    public static void mostrarArrayEnteros(ArrayList<Integer> listaEnteros) {
        for(Integer elem : listaEnteros) {
            System.out.print(elem + " ");
        }
    }
    
    public static Integer calcularSumaValores(ArrayList<Integer> lista) {
        Integer sumaValores = 0;
        for(Integer elem : lista) {
            sumaValores += elem;
        }
        return sumaValores;
    }
    
    public static void imprimirResultados(Integer cantidad, Integer suma, Double promedio) {
        System.out.println("La cantidad total de valores ingresados es: " + cantidad + "\n"
                         + "La suma total de valores ingresados es: " + suma + "\n"
                         + "El promedio de los valores ingresados es: " + promedio);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> listaEnteros = new ArrayList();
        Integer valorInput, sumaValores, cantValores;
        Double promValores;
        
        cantValores = 0;
        System.out.println("PROGRAMA DE INSERCION DE ENTEROS");
        System.out.print("Ingrese entero (-99 para salir): ");
        valorInput = leer.nextInt();
        
        while(valorInput != -99) {
            listaEnteros.add(valorInput);
            cantValores++;
            System.out.print("Ingrese entero (-99 para salir): ");
            valorInput = leer.nextInt();
        }
        sumaValores = calcularSumaValores(listaEnteros);
        if(cantValores > 0) {
            promValores = (sumaValores / (double)cantValores);
            imprimirResultados(cantValores, sumaValores, promValores);
        }
        else
            System.out.println("No se ingreso ningun valor");
    }

}
