/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascota.utilidades;

import java.util.Comparator;
import mascota.entidades.Mascota;

/**
 *
 * @author agush
 */
public class Comparadores {
    
    public static Comparator<Mascota> ordernarPorNombre = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getNombre().compareTo(t.getNombre());
        }
    };
    public static Comparator<Mascota> ordernarPorEdad = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t, Mascota t1) {
            return t1.getEdad().compareTo(t.getEdad());
        }
    };
    
}
