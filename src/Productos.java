
import java.sql.*;
import Producto.*;
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
public class Productos extends ProductosPOA {

    Conexion objCone = new Conexion();

    @Override
    public boolean insertarProducto(String Nombre, float Precio) {
        boolean resultado = false;
        try {
            String sql = "insert into producto(Nombre,Precio) values('" + Nombre + "','" + Precio + "')";
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
    public boolean actualizarProducto(int id_producto, String Nombre, float Precio) {
        boolean resultado = false;
        try {
            String sql = "update producto set id_producto= '" + id_producto + "', Nombre = '" + Nombre + "',Precio='" + Precio + "'";
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
    public boolean eliminarProducto(int id_producto) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM producto WHERE id_producto =" + id_producto;
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

        return resultado;
    }

    @Override
    public String consultarProducto(int id_producto) {
        String resultado = "";
        try {
            String sqlConsultar = "select*from producto id_producto = " + id_producto;
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
        return resultado;
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet cargarProducto() {
       
        ResultSet resultado = null;
        try {
            String sql = "Select id_producto,Nombre, Precio from producto";
            objCone.conectar(); // abrimos la conexion
            Statement st = objCone.con.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return resultado;
    }
}
