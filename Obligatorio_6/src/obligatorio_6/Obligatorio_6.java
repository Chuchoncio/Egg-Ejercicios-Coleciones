package obligatorio_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Obligatorio_6 {
    
    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void menuOpciones() {
        System.out.println("APLICACION DE TIENDA");
        System.out.println("1. Introducir producto\n"
                         + "2. Modificar precio producto\n"
                         + "3. Eliminar producto\n"
                         + "4. Mostrar productos\n"
                         + "5. Salir\n");
        System.out.print("Ingrese opcion: ");
    }
    
    public static void mostrarMapaProductos(HashMap<String, Double> mapaProds) {
        for(Map.Entry<String, Double> entry : mapaProds.entrySet()) {
            System.out.println("Prod: " + entry.getKey() + " | Precio: " + entry.getValue());
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        char resp;
        String nombreProd;
        Double precioProd;
        HashMap<String, Double> mapaProds = new HashMap();
        
        do {
           menuOpciones();
           resp = leer.next().toLowerCase().charAt(0);
           
           switch(resp) {
                case '1': 
                    System.out.print("Ingrese nombre del producto: ");
                    nombreProd = leer.next();
                    System.out.print("Ingrese precio del producto: ");
                    precioProd = leer.nextDouble();
                    mapaProds.put(nombreProd, precioProd);
                    System.out.println("");
                    break;
                   
                case '2':
                    System.out.print("Ingrese nombre del producto a modificar: ");
                    String buscProd = leer.next();
                    while(!mapaProds.containsKey(buscProd)){
                        System.out.print("Producto no encontrado en el mapa, reingreselo: ");
                        buscProd = leer.next();
                    }
                    System.out.println("Producto encontrado!");
                    System.out.println("Ingrese nuevo precio: ");
                    Double nuevoPrecioProd = leer.nextDouble();
                    while(nuevoPrecioProd <= 0) {
                        System.out.print("El precio no puede ser negativo o 0, re ingreselo: ");
                        nuevoPrecioProd = leer.nextDouble();
                    }
                    mapaProds.put(buscProd, nuevoPrecioProd);
                    System.out.println("");
                    break;
                    
                case '3':
                    System.out.print("Ingrese nombre del producto a eliminar: ");
                    String elimProd = leer.next();
                    while(!mapaProds.containsKey(elimProd)){
                        System.out.print("Producto no encontrado en el mapa, reingreselo: ");
                        elimProd = leer.next();
                    }
                    System.out.println("Producto encontrado, eliminando...");
                    mapaProds.remove(elimProd);
                    System.out.println("");
                    break;
                    
                case '4':
                    System.out.println("Lista de Productos");
                    if(!mapaProds.isEmpty())
                        mostrarMapaProductos(mapaProds);
                    else
                        System.out.println("Aun no hay productos listados!");
                    
                    System.out.println("");
                    break;
                    
                case '5':
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta!\n");
           }  
        }while(resp != '5');
    }

}
