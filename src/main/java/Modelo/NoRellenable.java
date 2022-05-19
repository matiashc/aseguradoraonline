/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class NoRellenable extends Prescripcion {

    private String razon;

    public NoRellenable() {
    }

    public NoRellenable(String razon, int id, String fecha, String dosis, String duracion) {
        super(id, fecha, dosis, duracion);
        this.razon = razon;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

}
