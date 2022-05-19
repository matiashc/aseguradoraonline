/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Doctor extends Persona {

    private String especializacion;

    public Doctor() {
    }

    public Doctor(String especializacion, String id, String nombre, String apellido, String direccion, String correoElectronico) {
        super(id, nombre, apellido, direccion, correoElectronico);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

}
