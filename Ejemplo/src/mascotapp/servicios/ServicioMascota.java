/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import mascota.entidades.Mascota;

/**
 *
 * @author agush
 */
public class ServicioMascota {

    private Scanner leer ;
    
    private ArrayList<Mascota> mascotas;

    
    public ServicioMascota() {
        this.leer =  new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    
    
    
    public Mascota crearMascota(){
    
        System.out.println("Introducir Nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        return new Mascota(nombre,tipo,apodo);
        
    }
    
    public void agregarMascota(Mascota m){
            mascotas.add(m);
        }
    
    public void mostrarMascota(){
    
        for(Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        
        System.out.println("cantidad = "+ mascotas.size());
    }

/**
 * 
 * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
 * crea mascota de chiquitos
 */    
    public void fabricaDeChiquitos(int cantidad){
    
        for (int i = 0; i < cantidad; i++) {
            mascotas.add( new Mascota("Fer","Chiquito","Beagle") );
        }
    
    }

    /**
     * Crea mascota pidiendo datos por teclado.
     */
    public void fabricaMascota(int cantidad){
    
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
        }
    
    }
    
    
    //TODO Añadir try and catch
    /*
    public void actualizarMascota(int index){
        Mascota m = mascotas.get(index);
        m.setApodo("Robeto");
    }
    */
    
    public void actualizarMascota(int index){
        Mascota m = crearMascota();
        
        mascotas.set(index,m);
    }
    
    public void eliminarMascota(int index){
        mascotas.remove(index);
    }

    public void eliminarPorNombre(String nombre){
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombre)){
                mascotas.remove(i);
            }
            
        }
        
    }
    
    public void actualizarPorNombre(String nombreViejo, String nombreNuevo){
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombreViejo)){
                m.setNombre(nombreNuevo);
            }
            
        }
        
    }
}



 