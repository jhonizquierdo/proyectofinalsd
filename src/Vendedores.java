import java.sql.*;
import Vendedores.*;
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
public class Vendedores extends VendedorPOA {
 Conexion objCone = new Conexion();
    @Override
    public boolean insertarVendedor(String Nombre, int Telefono, int Cedula, String Cargo) {
       boolean resultado = false;
        try {
            String sql = "insert into vendedor  (Nombre,Telefono,Cedula,Cargo) values('" + Nombre + "','" + Telefono + "','" + Cedula + "','"+Cargo+"')";
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
//
//
//    @Override
//    public boolean actualizarDomicilio(int id_domiciliario, String Nombre, String Telefono, String Cedula) {
//       
//    }
//
//    @Override
//    public boolean eliminarDomicilio(int id_domiciliario) {
//        boolean resultado = false;
//        try {
//            String sql = "DELETE FROM domiciliario WHERE id_domiciliario =" + id_domiciliario;
//            objCone.conectar();
//            Statement st = objCone.con.createStatement();
//            int valor = st.executeUpdate(sql);
//            if (valor > 0) {
//                resultado = true;
//            }
//
//            objCone.con.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "ocurrio un error al eliminar cliente " + e.getMessage());
//        }
//
//        return resultado;
//    }
//
//    @Override
//   
//    }
//
//    @Override
//    public void shoutdown() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    }

    @Override
    public boolean actualizarVendedor(int id_vendedor, String Nombre, int Telefono, int Cedula, String Cargo) {
        boolean resultado = false;
        try {
            String sql = "update vendedor set id_vendedor= '" + id_vendedor + "', Nombre = '" + Nombre + "',Telefono='" + Telefono + "',Cedula='" + Cedula + "',Cargo='" + Cargo + "' where id_vendedor = '" + id_vendedor + "' ";
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
    public boolean eliminarVendedor(int id_vendedor) {
         boolean resultado = false;
        try {
            String sql = "DELETE FROM vendedor WHERE id_vendedor =" + id_vendedor;
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
    public String consultarVendedor(int id_vendedor) {
        
        String resultado = "";
        try {
            String sqlConsultar = "select*from vendedor id_vendedor = " + id_vendedor;
            objCone.conectar();
            Statement st = objCone.con.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            while (rs.next()) {
                resultado += rs.getString(2) + "-"
                        + rs.getString(3) + "-"
                        + rs.getString(4) + "-"
                         + rs.getString(5) + "-"
                        + rs.getString(6);

            }

            rs.close(); // resultado de la consultad del Query
            objCone.con.close();

        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
        }
        return resultado;
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public ResultSet cargarDom() {
        ResultSet resultado = null;
        try {
            String sql = "Select id_vendedor,Nombre, Telefono,Cedula,Cargo from vendedor";
            objCone.conectar(); // abrimos la conexion
            Statement st = objCone.con.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return resultado;
    }
}
