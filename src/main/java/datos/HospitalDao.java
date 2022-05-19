/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import Modelo.Hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import red.BaseDeDatos;

/**
 *
 * @author IMAGEN-02
 */
public class HospitalDao implements HospitalServices {

    public static final String SQL_CONSULTA = "SELECT * FROM hospital";
    public static final String SQL_INSERT = "INSERT INTO hospital(id, nombre, direccion) VALUES (?,?,?)";
    public static final String SQL_DELETE = "DELETE FROM hospital WHERE id= ?";
    public static final String SQL_UPDATE = "UPDATE hospital SET nombre = ?, direccion = ? WHERE id = ?";
    public static final String SQL_CONSULTAID = "SELECT * FROM hospital WHERE id = ?";

    @Override
    public int create(Hospital hospital) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(1, hospital.getId());
            ps.setString(2, hospital.getNombre());
            ps.setString(3, hospital.getDireccion());
            registros = ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;

    }

    @Override
    public List<Hospital> all() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        List<Hospital> hospitales = new ArrayList();
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTA);
            res = ps.executeQuery();
            while (res.next()) {
                String id = res.getString("id");
                String nombre = res.getString("nombre");
                String direccion = res.getString("direccion");
                Hospital hospital = new Hospital(id, nombre, direccion);
                hospitales.add(hospital);

            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(res);
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return hospitales;
    }

    @Override
    public Hospital selectId(Hospital hospital) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet res = null;
        Hospital registroHospital = null;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_CONSULTAID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
            ps.setString(1, hospital.getId());
            res = ps.executeQuery();
            res.absolute(1);
            String id = res.getString("id");
            String nombre = res.getString("nombre");
            String direccion = res.getString("direccion");
            registroHospital = new Hospital(id, nombre, direccion);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(res);
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registroHospital;

    }

    @Override
    public int update(Hospital hospital) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, hospital.getNombre());
            ps.setString(2, hospital.getDireccion());
            ps.setString(3, hospital.getId());
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
         }

    @Override
    public int delete(Modelo.Hospital hospital) {
        Connection con = null;
        PreparedStatement ps = null;
        int registros = 0;
        try {
            con = BaseDeDatos.getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setString(1, hospital.getId());
            registros = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                BaseDeDatos.close(ps);
                BaseDeDatos.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
         }

}
