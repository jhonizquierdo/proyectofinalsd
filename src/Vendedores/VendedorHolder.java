package Vendedores;

/**
* Vendedores/VendedorHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Vendedor.idl
* domingo 18 de noviembre de 2018 04H00' COT
*/

public final class VendedorHolder implements org.omg.CORBA.portable.Streamable
{
  public Vendedores.Vendedor value = null;

  public VendedorHolder ()
  {
  }

  public VendedorHolder (Vendedores.Vendedor initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Vendedores.VendedorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Vendedores.VendedorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Vendedores.VendedorHelper.type ();
  }

}
