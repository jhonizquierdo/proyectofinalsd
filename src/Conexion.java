/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Conexion {

    //aqui se realizo la conexion 
    public Connection conex;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/sortilegio","root","");
            System.out.print("conexion establecidad");
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        return conex;
    }

   
}
