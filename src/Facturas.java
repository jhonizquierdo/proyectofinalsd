
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Factura.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DIEGO
 */
public class Facturas extends FacturasPOA {

    Conexion objCone = new Conexion();

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
//    public String consultarDomicilio(int id_domiciliario) {
//    }
//
//   
//    
//
//   
//
//    @Override
//    public boolean eliminarFactura(int id_factura) {
//    }
//    
//
//    @Override
//    public String consultarFactura(int id_factura) {
//        String resultado = "";
//        try {
//            String sqlConsultar = "select*from factura where id_factura = " + id_factura;
//            objCone.conectar();
//            Statement st = objCone.con.createStatement();
//            ResultSet rs = st.executeQuery(sqlConsultar);
//            while (rs.next()) {
//                resultado += rs.getString(2) + "-"
//                        + rs.getString(3) + "-"
//                        + rs.getString(4) + "-"
//                        + rs.getString(5);
//
//            }
//
//            rs.close(); // resultado de la consultad del Query
//            objCone.con.close();
//
//        } catch (SQLException e) {
//            System.out.println("error" + e.getMessage());
//        }
//        return resultado;
//    }
//
//    @Override
//    public void shoutdown() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//     }
//
//    @Override
//    public boolean actualizarFactura(int id_factura, int id_cliente, int id_producto, int id_vendedor, String fecha, String matricula) {
//        boolean resultado = false;
//        try {
//            String sql = "update factura set id_factura='"+id_factura+"',id_cliente = '" + id_cliente + "', id_producto = '" + id_producto + "',id_vendedor='" + id_vendedor + "',fecha='" + fecha + "',vehiculo_matricula='"+ matricula +"' where id_factura = '" + id_factura + "' ";
//            objCone.conectar();
//            Statement st = objCone.con.createStatement();
//            int valor = st.executeUpdate(sql);
//            if (valor > 0) {
//                resultado = true;
//            }
//
//            objCone.con.close();
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar factura " + e.getMessage());
//        }
//
//        return resultado;
//    }
//
//    @Override
//    public boolean insertarFactura(int id_cliente, int id_producto, int id_vendedor, String fecha, String matricula) {
//       
//    }
//     @Override
//    public void shoutdown() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public ResultSet cargarfac() {
//        ResultSet resultado = null;
//        try {
//            String sql = "Select id_factura,id_cliente, id_producto,id_vendedor,fecha,vehiculo_matricula from factura";
//            objCone.conectar(); // abrimos la conexion
//            Statement st = objCone.con.createStatement();//encargado de la consulta
//            resultado = st.executeQuery(sql);
//        } catch (Exception e) {
//
//            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
//        }
//        return resultado;
//
//
//    }
    @Override
    public boolean insertarFactura(int id_cliente, int id_producto, int id_vendedor, String fecha, String matricula) {
        boolean resultado = false;
        try {
            String sql = "insert into factura  (id_cliente,id_producto,id_vendedor,fecha,vehiculo_matricula) values('" + id_cliente + "','" + id_producto + "','" + id_vendedor + "','" + fecha + "','" + matricula + "')";
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
    public boolean actualizarFactura(int id_factura, int id_cliente, int id_producto, int id_vendedor, String fecha, String matricula) {
        boolean resultado = false;
        try {
            String sql = "update factura set id_factura='" + id_factura + "',id_cliente = '" + id_cliente + "', id_producto = '" + id_producto + "',id_vendedor='" + id_vendedor + "',fecha='" + fecha + "',vehiculo_matricula='" + matricula + "' where id_factura = '" + id_factura + "' ";
            objCone.conectar();
            Statement st = objCone.con.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objCone.con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar factura " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public boolean eliminarFactura(int id_factura) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM factura WHERE id_factura =" + id_factura;
            objCone.conectar();
            Statement st = objCone.con.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objCone.con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al eliminar factura " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public String consultarFactura(int id_factura) {
        String resultado = "";
        try {
            String sqlConsultar = "select*from factura id_factura = " + id_factura;
            objCone.conectar();
            Statement st = objCone.con.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            while (rs.next()) {
                resultado += rs.getString(2) + "-"
                        + rs.getString(3) + "-"
                        + rs.getString(4) + "-"
                        + rs.getString(5) + "-"
                        + rs.getString(6) + "-"
                        + rs.getString(7);

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

    public ResultSet cargarFac() {
        ResultSet resultado = null;
        try {
            String sql = "Select id_factura,id_cliente, id_producto,id_vendedor,fecha,id_vehiculo, from factura";
            objCone.conectar(); // abrimos la conexion
            Statement st = objCone.con.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return resultado;
    }
}
