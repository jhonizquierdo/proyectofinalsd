
import java.sql.*;
import Clientes.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO
 */
public class Clientes extends ClientePOA {

    Conexion objCon = new Conexion();

    @Override
    public boolean insertarCliente(String Nombre, String Apellido, int Edad) {
        boolean resultado = false;
        try {
            String sql = "insert into cliente (Nombre,Apellido,Edad) values('" + Nombre + "','" + Apellido + "','" + Edad + "')";
            objCon.conectar();
            Statement st = objCon.con.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;

            }
            //cerrar las conexiones 
            objCon.con.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al insertar dato en cliente " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public boolean actualizarCliente(int id_cliente, String Nombre, String Apellido, int Edad) {

        boolean resultado = false;
        try {
            String sql = "update cliente set id_cliente= '"+id_cliente+"', Nombre = '" + Nombre + "',Apellido='" + Apellido + "',Edad='"+Edad+"' where id_cliente = '" + id_cliente + "' ";
            objCon.conectar();
            Statement st = objCon.con.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objCon.con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al actualizar clientes " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public boolean eliminarCliente(int id_cliente) {
        boolean resultado = false;
        try {
            String sql = "DELETE FROM cliente WHERE id_cliente =" + id_cliente;
            objCon.conectar();
            Statement st = objCon.con.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor > 0) {
                resultado = true;
            }

            objCon.con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ocurrio un error al eliminar cliente " + e.getMessage());
        }

        return resultado;
    }

    @Override
    public String consultarCliente(int id_cliente) {
        String resultado = "";
        try {
            String sqlConsultar = "select*from cliente id_cliente = " + id_cliente;
            objCon.conectar();
            Statement st = objCon.con.createStatement();
            ResultSet rs = st.executeQuery(sqlConsultar);
            while (rs.next()) {
                resultado += rs.getString(2) + "-"
                        + rs.getString(3) + "-"
                        + rs.getString(4) + "-"
                        + rs.getString(5);

            }

            rs.close(); // resultado de la consultad del Query
            objCon.con.close();

        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
        }
        return resultado;
    }

    @Override
    public void shoutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet cargarCliente() {
        ResultSet resultado = null;
        try {
            String sql = "Select id_cliente,Nombre, Apellido,Edad from cliente";
            objCon.conectar(); // abrimos la conexion
            Statement st = objCon.con.createStatement();//encargado de la consulta
            resultado = st.executeQuery(sql);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return resultado;
    }
}
