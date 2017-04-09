
package modelo;

import java.io.Serializable;


public class Profesor implements Serializable{
    private String nif;
    private String nombre;
    private String departamento;
    private String edad;

    public Profesor(String nif, String nombre, String departamento, String edad) {
        this.nif = nif;
        this.nombre = nombre;
        this.departamento = departamento;
        this.edad = edad;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        String info;
        info = String.format("%-12s %-30s %-20s %-3s",this.nif,this.nombre,this.departamento,this.edad);
        return info;
    }
}

