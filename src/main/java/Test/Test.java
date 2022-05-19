/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Modelo.Hospital;
import datos.HospitalDao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IMAGEN-02
 */
public class Test {

    public static void main(String[] args) {
        HospitalDao ad = new HospitalDao();
        //ad.create(new Hospital("56478", "Internacional", "av 12"));
       List<Hospital> hospitales = new ArrayList<>();
       hospitales = ad.all();
        for (int i = 0; i < hospitales.size(); i++) {
            System.out.println("nombre = " + hospitales.get(i).getNombre());
       }

    }

}
