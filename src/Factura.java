
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DIEGO
 */
public class Factura extends javax.swing.JFrame {

    public int indice;
    private DefaultTableModel modeloTablaFac;

    public Factura() {
        initComponents();
        CmbCliente cb = new CmbCliente();
        DefaultComboBoxModel modeloCmbCliente = new DefaultComboBoxModel(cb.mostrarClis());
        cmbCli.setModel(modeloCmbCliente);

        CmbProducto cbp = new CmbProducto();
        DefaultComboBoxModel modeloCmbProd = new DefaultComboBoxModel(cbp.mostrarProd());
        cmbProd.setModel(modeloCmbProd);

        CmbVehiculo cbvh = new CmbVehiculo();
        DefaultComboBoxModel modeloCmbVeh = new DefaultComboBoxModel(cbvh.mostrarVehiculos());
        cmbVeh.setModel(modeloCmbVeh);

        CmbVendedor cbvn = new CmbVendedor();
        DefaultComboBoxModel modeloCmbVen = new DefaultComboBoxModel(cbvn.mostrarVendedors());
        cmbVen.setModel(modeloCmbVen);
    }
    //Metodo para cargar las columnas en la tabla

    private void getColumn() {
        modeloTablaFac = (DefaultTableModel) tblFac.getModel();

        modeloTablaFac.addColumn("ID");
        modeloTablaFac.addColumn("Cliente");
        modeloTablaFac.addColumn("Producto");
        modeloTablaFac.addColumn("Vendedor");
        modeloTablaFac.addColumn("fecha");
        modeloTablaFac.addColumn("Vehiculo");

        Conexion conn = new Conexion();
    }

    //Metodo par cargar tabla
    private void cargarTabla() {
        Facturas ObjFacturas = new Facturas();
        modeloTablaFac = (DefaultTableModel) tblFac.getModel();
        ResultSet result = ObjFacturas.cargarFac();
        try {
            //creamos un arreglo de 3 sectores
            Object Datos[] = new Object[6];
            while (result.next()) {
                for (int i = 0; i < 6; i++) {
                    Datos[i] = result.getObject(i + 1);
                }
                modeloTablaFac.addRow(Datos);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFac = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cmbCli = new javax.swing.JComboBox<>();
        cmbProd = new javax.swing.JComboBox<>();
        cmbVeh = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cmbVen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNext.setBackground(new java.awt.Color(102, 102, 0));
        btnNext.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnNext.setText("NEXT");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setText("Producto");

        tblFac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFacMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFac);

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 0));
        btnLimpiar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 102, 0));
        btnEliminar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar ");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setText("Fecha");

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Factura");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Id ");

        txtId.setText("0");
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Cliente");

        btnConsultar.setBackground(new java.awt.Color(102, 102, 0));
        btnConsultar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnConsultar.setText("Consultar ");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 102, 0));
        btnGuardar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar ");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel12.setText("Vehiculo");

        btnActualizar.setBackground(new java.awt.Color(102, 102, 0));
        btnActualizar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel13.setText("Vendedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(cmbCli, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbProd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbVeh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(cmbVen, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)))
                .addGap(0, 49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void tblFacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFacMouseClicked
        // TODO add your handling code here:

        int seleccion = tblFac.rowAtPoint(evt.getPoint());
        txtId.setText(String.valueOf(tblFac.getValueAt(seleccion, 0)));
        txtFecha.setText(String.valueOf(tblFac.getValueAt(seleccion, 4)));
       
       


    }//GEN-LAST:event_tblFacMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //LIMPIAR clientes
        modeloTablaFac = (DefaultTableModel) tblFac.getModel();

        // Limpio los campos
        // *** Limpio los Campos ***
        txtId.setText("0");

        txtFecha.setText("dd/mm /aa ");
        cmbCli.setSelectedIndex(0);
        cmbProd.setSelectedIndex(0);
        cmbVeh.setSelectedIndex(0);
        cmbVen.setSelectedIndex(0);
        txtId.requestFocus();
        modeloTablaFac.setColumnCount(0);
        modeloTablaFac.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        // Elimino el registro del JTable y la tabla cliente
        // Defino el modelo para el JTable
        DefaultTableModel modelo = (DefaultTableModel) tblFac.getModel();

        // Asigno el indice del elemento seleccionado
        indice = tblFac.getSelectedRow();

        // Asigno a idCiudad el elemento a eliminar
        int id_factura = Integer.parseInt(txtId.getText());

        // System.out.println(id_cliente);
        // Elimino el registro del JTable
        modelo.removeRow(indice);

        Facturas objFacturas = new Facturas();
        // Elimino el registro de la tabla cliente

        try {

            boolean resultado = objFacturas.eliminarFactura(id_factura);
            // Imprimo el mensaje para indicar si se eliminó o no el registro
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "El registro se elimino.");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: No se elimino el registro.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {

            modeloTablaFac = (DefaultTableModel) tblFac.getModel();
            modeloTablaFac.setColumnCount(0);
            modeloTablaFac.setRowCount(0);
            getColumn();
            cargarTabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR:" + e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtFecha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite Su fecha dd/mm/aa ");
            txtFecha.requestFocus();
            return;

        }
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite Su id ");
            txtId.requestFocus();
            return;

        }

        Facturas objFacturas = new Facturas();

        CmbCliente cb = (CmbCliente) cmbCli.getSelectedItem();
        CmbProducto cbp = (CmbProducto) cmbProd.getSelectedItem();
        CmbVehiculo cbvh = (CmbVehiculo) cmbVeh.getSelectedItem();
        CmbVendedor cbvn = (CmbVendedor) cmbVen.getSelectedItem();

        int id_cliente = cb.getId();
        int id_producto = cbp.getId();
        String matricula = cbvh.getId();
        int id_vendedor = cbvn.getId();
        int id_factura = Integer.parseInt(txtId.getText());

        String fecha = txtFecha.getText();
//        String Telefono = txt.getText();
        //int Cedula= Integer.parseInt(txtCed.getText());
        try {

            boolean resultado = objFacturas.insertarFactura(id_cliente, id_producto, id_vendedor, fecha, matricula);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Se inserto un nuevo registro.");
            }
            txtFecha.setText("dd/mm /aa ");
            cmbCli.setSelectedIndex(0);
            cmbProd.setSelectedIndex(0);
            cmbVeh.setSelectedIndex(0);
            cmbVen.setSelectedIndex(0);
            txtId.requestFocus();
            modeloTablaFac.setColumnCount(0);
            modeloTablaFac.setRowCount(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Facturas objFacturas = new Facturas();

        CmbCliente cb = (CmbCliente) cmbCli.getSelectedItem();
        CmbProducto cbp = (CmbProducto) cmbProd.getSelectedItem();
        CmbVehiculo cbvh = (CmbVehiculo) cmbVeh.getSelectedItem();
        CmbVendedor cbvn = (CmbVendedor) cmbVen.getSelectedItem();

        int id_cliente = cb.getId();
        int id_producto = cbp.getId();
        String matricula = cbvh.getId();
        int id_vendedor = cbvn.getId();
        int id_factura = Integer.parseInt(txtId.getText());

        String fecha = txtFecha.getText();

        try {

            boolean resultado = objFacturas.actualizarFactura(id_factura, id_cliente, id_producto, id_vendedor, fecha, matricula);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Se actualizó el registro.");
                cargarTabla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar. Fac");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox<String> cmbCli;
    private javax.swing.JComboBox<String> cmbProd;
    private javax.swing.JComboBox<String> cmbVeh;
    private javax.swing.JComboBox<String> cmbVen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFac;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
