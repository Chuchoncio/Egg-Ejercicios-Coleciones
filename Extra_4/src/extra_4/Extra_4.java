package extra_4;

import java.util.HashMap;
import java.util.Scanner;

public class Extra_4 {
    
    private static final Scanner LEER = new Scanner(System.in).useDelimiter("\n");

    private static void mostrarHashMapCiudades(HashMap<Integer, String> listaCiudades) {
        for(HashMap.Entry<Integer, String> elem : listaCiudades.entrySet()) {
            System.out.println("Codigo Postal: " + elem.getKey() + " | Ciudad: " + elem.getValue());
        }
    }
    
    private static Integer ingresoCodigoPostal() {
        System.out.print("Ingrese codigo postal de la ciudad: ");
        return LEER.nextInt();
    }
    
    private static String ingresoNombre() {
        System.out.print("Ingrese nombre de la ciudad: ");
        return LEER.next();
    }
    
    private static HashMap<Integer, String> ingresoCiudad(HashMap<Integer, String> listaCiudades) {
        Integer codPostIng;
        String nomCiudadIng;
        
        codPostIng = ingresoCodigoPostal();
        nomCiudadIng = ingresoNombre();
        listaCiudades.put(codPostIng, nomCiudadIng);
        
        return listaCiudades;
    }
    
    private static void busquedaCiudades(HashMap<Integer, String> listaCiudades, Integer codBusc) {
        if(listaCiudades.containsKey(codBusc)) {
            System.out.println("Ciudad encontrada");
            System.out.println("Ciudad: " + listaCiudades.get(codBusc));
        }
        else
            System.out.println("Ciudad no encontrada, sorry!");
    }
    
    private static HashMap<Integer, String> eliminarCiudad(HashMap<Integer, String> listaCiudades,
                  Integer codCiudadElim) {     
        if(listaCiudades.containsKey(codCiudadElim)) {
            System.out.println("Ciudad encontrada, eliminando...");
            listaCiudades.remove(codCiudadElim);
        }
        else
            System.out.println("Ciudad no encontrada");
        return listaCiudades;
    }
    
    private static void busquedaCiudades(HashMap<Integer, String> listaCiudades) {
        Integer codBusc;
        
        System.out.println("INGRESO CODIGO POSTAL BUSQUEDA");
        codBusc = ingresoCodigoPostal();
        busquedaCiudades(listaCiudades, codBusc);
    }
    
    private static HashMap<Integer, String> ingresoTodasLasCiudades(HashMap<Integer, String> listaCiudades) {
        for(int i = 0; i < 3; i++) {
            System.out.println("INGRESO DE CIUDAD NRO. " + (i+1));
            listaCiudades = ingresoCiudad(listaCiudades);
        }
        
        return listaCiudades;
    }
    
    private static HashMap<Integer, String> agregarCiudad(HashMap<Integer, String> listaCiudades) {
        Integer codPostIng;
        String nomCiudadIng;
        
        System.out.println("INGRESO DE CIUDAD PARA AGREGAR");
        codPostIng = ingresoCodigoPostal();
        nomCiudadIng = ingresoNombre();
        listaCiudades.put(codPostIng, nomCiudadIng);
        
        return listaCiudades;
    }
    
    private static HashMap<Integer, String> eliminacionCiudades(HashMap<Integer, String> listaCiudades) {
        Integer cantCiudadesElim = 2;
        System.out.println("ELIMINACION DE " + cantCiudadesElim + " CIUDADES");
                
        for(int i = 0; i < cantCiudadesElim; i++) {
            Integer codCiudadElim = ingresoCodigoPostal();
            listaCiudades = eliminarCiudad(listaCiudades, codCiudadElim);
        }
        
        return listaCiudades;
    }
    
    public static void main(String[] args) {
        HashMap<Integer, String> listaCiudades = new HashMap();
        
        listaCiudades = ingresoTodasLasCiudades(listaCiudades);
        
        mostrarHashMapCiudades(listaCiudades);
        
        busquedaCiudades(listaCiudades);
        
        listaCiudades = agregarCiudad(listaCiudades);
        
        mostrarHashMapCiudades(listaCiudades);
        
        listaCiudades = eliminacionCiudades(listaCiudades);
        
        mostrarHashMapCiudades(listaCiudades);
    }
}
