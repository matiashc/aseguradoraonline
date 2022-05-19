/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import Modelo.Hospital;
import java.util.List;

/**
 *
 * @author IMAGEN-02
 */
public interface HospitalServices {
    public int create(Hospital hospital);
    public List<Hospital> all();
    public Hospital selectId(Hospital hospital);
    public int update (Hospital hospital);
    public int delete (Hospital hospital);    
}
