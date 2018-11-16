/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.PersonaDAO;
import vista.JFCrud;

/**
 *
 
 */
public class ControladorCrud implements ActionListener{
    JFCrud vistaCRUD;
    PersonaDAO modeloCRUD;
            
//constructor
    public ControladorCrud(JFCrud vistaCrud, PersonaDAO modeloCRUD){
    this.vistaCRUD=vistaCrud;
    this.modeloCRUD=modeloCRUD;
    this.vistaCRUD.btnregistrar.addActionListener(this);
    this.vistaCRUD.btnlistar.addActionListener(this);
    
    }
    //fin constructor
    
    public void InicializarCrud(){
    
    }
    
    public void LlenarTabla(JTable tablaD){
    DefaultTableModel modeloT=new DefaultTableModel();    
    tablaD.setModel(modeloT);
    modeloT.addColumn("Cedula");
    modeloT.addColumn("Nombre");
    modeloT.addColumn("Apellido");
    modeloT.addColumn("Edad");
    Object[] columna=new Object[4];
    int numRegistro=modeloCRUD.listaPersona().size();
    for(int i=0; i<numRegistro; i++)
    {
    columna[0]=modeloCRUD.listaPersona().get(i).getCed();
        columna[0]=modeloCRUD.listaPersona().get(i).getNombre();
            columna[0]=modeloCRUD.listaPersona().get(i).getApellido();
                columna[0]=modeloCRUD.listaPersona().get(i).getEdad();
    modeloT.addRow(columna);
    }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
