/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import mascota.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author agush
 */
public class Mascotapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //ServicioMascota sm = new ServicioMascota();
        
        //Mascota m1 = sm.crearMascota();
        
        //System.out.println(m1.toString());
        
        //Arays
//        String[] nombres = new String[5];
//        
//        for (int i = 0; i<nombres.length; i++) {
//            nombres[i]= "Chiquito"+i; 
//        }
//    
//        for (String nombre : nombres) {
//            System.out.println(nombre);
//        }
//        
//        
//        //Colecctions
//        ArrayList<String> nombresArraysList = new ArrayList();
//        
//        nombresArraysList.add("Chiquito");
//        nombresArraysList.add("Chiquito");
//        nombresArraysList.add("Chiquito");
//
//        System.out.println(nombresArraysList.size());
//        
//        
//        nombresArraysList.remove("Chiquito");
//        System.out.println(nombresArraysList.size());
        
//    ServicioMascota SerMasc = new ServicioMascota();
//    
//    SerMasc.fabricaMascota(2);
//    
//    SerMasc.mostrarMascota();
//    
//    
//    SerMasc.actualizarMascota(0);
//    
//    SerMasc.mostrarMascota();
//    
//    SerMasc.eliminarMascota(0);

        ArrayList<String> nombre = new ArrayList();
        
        nombre.add("Lola");
        nombre.add("Roman");
        nombre.add("Shiquitop");
        
        
        Iterator<String> it = nombre.iterator();
        
        while (it.hasNext()) {
            String aux = it.next();
//            System.out.println(aux);SerMasc.mostrarMascota();
            if(aux.equals("Lola")){
                it.remove();
            }
            
        }
        
        //Solo mostrar 
//        for (String string : nombre) {
//            System.out.println(string);
//        }

        for (int i = 0; i < nombre.size(); i++) {
            
            System.out.println(nombre.get(i));
            
        }
        
//        nombre.forEach((e)->System.out.println(e));
        //Buscar con filtros
        
        //Recorrer y eliminar
        
    
    }
    
    
}
