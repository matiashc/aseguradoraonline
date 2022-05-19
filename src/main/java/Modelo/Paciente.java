/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Paciente extends Persona {

    private String tipoSangre;

    public Paciente() {
    }

    public Paciente(String tipoSangre, String id, String nombre, String apellido, String direccion, String correoElectronico) {
        super(id, nombre, apellido, direccion, correoElectronico);
        this.tipoSangre = tipoSangre;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

}
