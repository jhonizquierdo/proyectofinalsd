/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Conexion {
    public Conexion(){
        //contructor vacio
    }
    public Connection getConexion(){
        Connection con=null;
        try {
            //Estblecer la conecion con la DB
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsortilegio", "root", "");
            
        } catch (Exception e) {
            //Mensaje de error
           JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return con;
    }
}
