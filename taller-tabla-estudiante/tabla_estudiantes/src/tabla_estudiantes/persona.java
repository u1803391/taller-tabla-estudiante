/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla_estudiantes;

/**
 *
 * @author crist
 */
public class persona {
    
    String nombre;
    String apellido;
    String nota;

    public persona(String nombre, String apellido, String nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

   
    
    
}
