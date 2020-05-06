/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla_estudiantes;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class persona {
    
    public String nombre;
    public String Estado;
    public double no;
    ArrayList<Double> notas;

    public persona(String nombre, String Estado) {
        this.nombre = nombre;
        this.Estado = Estado;
        this.notas = new ArrayList<Double>();
    }
    /*
public persona(String nombre, String Estado, double nota) {
        this.nombre = nombre;
        this.Estado = Estado;
        this.no =nota;
    }*/

    public persona() {
    }
    
 @Override
    public String toString() {
        return nombre  + ","+ Estado +"," + notas;
    }
   
   
    
    
}
