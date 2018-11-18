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
public class CmbDom {
 
 private int id;
    private String nombre;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Vector<CmbDom> mostrarDoms() {
        Conexion conex = new Conexion();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Conexion conn = new Conexion();
        Connection con = conex.conectar();

        Vector<CmbDom> datosDoms = new Vector<CmbDom>();

        CmbDom dat = null;

        try {
            String sql = "SELECT * FROM domiciliario";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new CmbDom();
            dat.setId(0);
            dat.setNombre("Seleccione");
            datosDoms.add(dat);

            while (rs.next()) {
                dat = new CmbDom();
                dat.setId(rs.getInt("id_domiciliario"));
                dat.setNombre(rs.getString("Nombre"));
                datosDoms.add(dat);
            }
            rs.close();

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return datosDoms;
    }
    
}

