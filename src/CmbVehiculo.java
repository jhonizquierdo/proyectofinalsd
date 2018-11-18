
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class CmbVehiculo {
    private String id;
    private String nombre;  

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public String toString() {
        return this.nombre;
    }

    public Vector<CmbVehiculo> mostrarVehiculos() {
        Conexion conex = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conex.conectar();

        Vector<CmbVehiculo> datosCmbVehiculos = new Vector<CmbVehiculo>();

        CmbVehiculo dat = null;

        try {
            String sql = "SELECT * FROM vehiculo";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new CmbVehiculo();
            dat.setId("");
            dat.setNombre("Seleccione");
            datosCmbVehiculos.add(dat);

            while (rs.next()) {
                dat = new CmbVehiculo();
                dat.setId(rs.getString("matricula"));
                dat.setNombre(rs.getString("marca"));
                datosCmbVehiculos.add(dat);
            }
            rs.close();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return datosCmbVehiculos;
    }
}
