/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PersonaDAO {
 Conexion conexion;
 //constructor
 public PersonaDAO(){
 conexion=new Conexion();
  }
 //Metodo Insertar
 public String insetPersona(  String nombre,int edad ,String ced,String apellido ){
 String rptaRegistro=null;
     try {
         Connection accesoDB=conexion.getConexion();
         PreparedStatement ps=accesoDB.prepareStatement("Insertinto cliente value(Nombre,Edad,cedula,Apellido,)");
         ps.setString(1,nombre);
         ps.setInt(2,edad);
         ps.setString(3,ced);
         ps.setString(4,apellido);
         int re=ps.executeUpdate();
         ps.close();
         accesoDB.close();
         
         if(re>0)
             rptaRegistro="Registro Exitoso";
         
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
     }
     return rptaRegistro;
 }
 //Metodo Listar
 public ArrayList<Persona> listaPersona(){
 ArrayList listaPersona=new ArrayList();
 Persona persona;
     try {
         Connection accesoDB=conexion.getConexion();
         PreparedStatement ps=accesoDB.prepareStatement("select * from persona");
         ResultSet rs=ps.executeQuery();
         while(rs.next()){
         persona =new Persona();
         persona.setCed(rs.getString(1));
         persona.setNombre(rs.getString(2));
         persona.setApellido(rs.getString(3));
         persona.setEdad(rs.getInt(4));
         listaPersona.add(persona);
         }
         rs.close();
         accesoDB.close();
         ps.close();
     } catch (Exception e) {
     }
     return listaPersona;
 
 }
}
