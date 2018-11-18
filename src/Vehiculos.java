import java.sql.*;
import Vehiculo.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class Vehiculos extends VehiculosPOA {
    Conexion objCone = new Conexion();

 
//     
//  

    @Override
    public boolean insertarVehiculo(String matricula, int id_domiciliario, String marca) {
       boolean resultado = false;
        try {
            String sql = "insert into vehiculo  (matricula,id_domiciliario,marca) values('"+matricula+"','" + id_domiciliario + "','" + marca+ "')";
            objCone.conectar();
            Statement st = objCone.con.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;

            }
            //cerrar las conexiones 
            objCone.con.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar dato en cliente " + e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean actualizarVehiculo(String matricula, int id_domiciliario, String marca) {
       boolean resultado = false;
        try {
            String sql = "update vehiculo set matricula='"+matricula+"' ,id_domiciliario= '" + id_domiciliario + "', marca = '" + marca + "'";
            objCone.conectar();
            Statement st = objCone.con.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objCone.con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar clientes " + e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean eliminarVehiculo(String matricula) {
       boolean resultado = false;
        try {
            String sql = "DELETE FROM vehiculo WHERE matricula =" + matricula;
            objCone.conectar();
            Statement st = objCone.con.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objCone.con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al eliminar cliente " + e.getMessage());
        }

        return resultado;}

    @Override
    public String consultarVehiculo(String matricula) {
       String resultado = "";
        try {
            String sqlConsultar = "select*from vehiculo matricula = " + matricula;
            objCone.conectar();
            Statement st = objCone.con.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            while (rs.next()) {
                resultado += rs.getString(2) + "-"
                        + rs.getString(3) + "-"
//                        + rs.getString(4) + "-"
                        + rs.getString(4);

            }

            rs.close(); // resultado de la consultad del Query
            objCone.con.close();

        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
        }
        return resultado;}

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public ResultSet cargarVehiculo() {
       
        ResultSet resultado = null;
        try {
            String sql = "Select matricula,id_domiciliario, marca from vehiculo";
            objCone.conectar(); // abrimos la conexion
            Statement st = objCone.con.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return resultado;
    }
}
