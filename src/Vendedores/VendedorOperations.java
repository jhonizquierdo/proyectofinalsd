package Vendedores;


/**
* Vendedores/VendedorOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Vendedor.idl
* domingo 18 de noviembre de 2018 04H00' COT
*/

public interface VendedorOperations 
{
  boolean insertarVendedor (String Nombre, int Telefono, int Cedula, String Cargo);
  boolean actualizarVendedor (int id_vendedor, String Nombre, int Telefono, int Cedula, String Cargo);
  boolean eliminarVendedor (int id_vendedor);
  String consultarVendedor (int id_vendedor);
  void shoutdown ();
} // interface VendedorOperations
