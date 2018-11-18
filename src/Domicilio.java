
import java.sql.ResultSet;
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
public class Domicilio extends javax.swing.JFrame {

     public int indice;
    private DefaultTableModel modeloTablaDom;
    /**
     * Creates new form Cliente
     */
    public Domicilio() {
         
     initComponents();
      
    }
       
    
   private void getColumn() {
        modeloTablaDom = (DefaultTableModel) tblDom.getModel();
         
         modeloTablaDom.addColumn("ID");
         modeloTablaDom.addColumn("Nombre");
         modeloTablaDom.addColumn("Apellido");
         modeloTablaDom.addColumn("Telefon");

    }

    
    //Metodo para cargar los registros en la tabla
    private void cargarTabla(){
        Domicilios objDomicilios = new Domicilios();
        ResultSet resultado = objDomicilios.cargarDom();
        try {
            Object datos[] = new Object[4];
            while(resultado.next()){
                for(int i = 0; i < 4; i++){
                    datos[i] = resultado.getObject(i+1);
                }
                modeloTablaDom.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDom = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtCed = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtTel = new javax.swing.JTextField();

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
        jLabel10.setText("Telefono");

        tblDom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDomMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDom);

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel11.setText("Cedula");

        txtCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedActionPerformed(evt);
            }
        });
        txtCed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setText("Domicilio");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setText("Id ");

        txtId.setEditable(false);
        txtId.setText("0");
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(10, 10, 10))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(txtCed, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(txtTel)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void tblDomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDomMouseClicked
        // TODO add your handling code here:
        int seleccion = tblDom.rowAtPoint(evt.getPoint());
        txtId.setText(String.valueOf(tblDom.getValueAt(seleccion, 0)));
        txtNombre.setText(String.valueOf(tblDom.getValueAt(seleccion, 1)));
        txtTel.setText(String.valueOf(tblDom.getValueAt(seleccion, 2)));
        txtCed.setText(String.valueOf(tblDom.getValueAt(seleccion, 3)));
    }//GEN-LAST:event_tblDomMouseClicked

    private void txtCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedActionPerformed

    private void txtCedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedKeyTyped

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:

        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingresa tu nombre cliente");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        modeloTablaDom = (DefaultTableModel) tblDom.getModel();
        modeloTablaDom.setColumnCount(0);
        modeloTablaDom.setRowCount(0);
        getColumn();
        cargarTabla();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite Su nombre ");
            txtNombre.requestFocus();
            return;

        }
        if (txtTel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Digite Su apellido ");
            txtTel.requestFocus();
            return;

        }

        Domicilios objDomicilios = new Domicilios();

        int id_domiciliario = Integer.parseInt(txtId.getText());

        String Nombre = txtNombre.getText();
        String Telefono = txtTel.getText();
        //int Cedula= Integer.parseInt(txtCed.getText());
         String Cedula = txtCed.getText();
        if (id_domiciliario == 0) {
            boolean resultado = objDomicilios.insertarDomicilio(Nombre, Telefono, Cedula );
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Se inserto un nuevo registro.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar.");
            }

        } else {
            boolean resultado = objDomicilios.actualizarDomicilio(id_domiciliario, Nombre, Telefono, Cedula);
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Se actualizó el registro.");
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar.");

            }
            // *** Limpio los Campos ***
            txtId.setText("0");
            txtNombre.setText("");
            txtTel.setText("");
            txtCed.setText("");
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //LIMPIAR clientes
        modeloTablaDom = (DefaultTableModel) tblDom.getModel();

        // Limpio los campos
        // *** Limpio los Campos ***
        txtId.setText("0");
        txtNombre.setText("");
        txtTel.setText("");
        txtCed.setText("");
        txtNombre.requestFocus();
        modeloTablaDom.setColumnCount(0);
        modeloTablaDom.setRowCount(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        // Elimino el registro del JTable y la tabla cliente
        // Defino el modelo para el JTable
        DefaultTableModel modelo = (DefaultTableModel) tblDom.getModel();

        // Asigno el indice del elemento seleccionado
        indice = tblDom.getSelectedRow();

        // Asigno a idCiudad el elemento a eliminar
        int id_domiciliario = Integer.parseInt(txtId.getText());

        // System.out.println(id_cliente);

        // Elimino el registro del JTable
        modelo.removeRow(indice);

        Domicilios objDomicilios = new Domicilios();
        // Elimino el registro de la tabla cliente

        try {

            boolean resultado = objDomicilios.eliminarDomicilio(id_domiciliario);
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
            java.util.logging.Logger.getLogger(Domicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Domicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Domicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Domicilio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Domicilio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDom;
    private javax.swing.JTextField txtCed;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
