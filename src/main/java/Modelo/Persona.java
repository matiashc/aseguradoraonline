/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Persona {

    private String id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correoElectronico;

    public Persona() {
    }

    public Persona(String id, String nombre, String apellido, String direccion, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

}
