/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class ConsultaInicial extends Consulta {

    private String diagnosticoInicial;

    public ConsultaInicial() {
    }

    public ConsultaInicial(int id, String fecha, String sintomas, String diagnosticoIncial) {
        super(id, fecha, sintomas);
        this.diagnosticoInicial = diagnosticoIncial;
    }

    public String getDiagnosticoInicial() {
        return diagnosticoInicial;
    }

    public void setDiagnosticoInicial(String diagnosticoInicial) {
        this.diagnosticoInicial = diagnosticoInicial;
    }

}
