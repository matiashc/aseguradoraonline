/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Rellenable {

    private int numeroRecargas;
    private String comentarios;

    public Rellenable() {
    }

    public Rellenable(int numeroRecargas, String comentarios) {
        this.numeroRecargas = numeroRecargas;
        this.comentarios = comentarios;
    }

    public int getNumeroRecargas() {
        return numeroRecargas;
    }

    public void setNumeroRecargas(int numeroRecargas) {
        this.numeroRecargas = numeroRecargas;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

}
