package Factura;

/**
* Factura/FacturasHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Factura.idl
* domingo 18 de noviembre de 2018 04H59' COT
*/

public final class FacturasHolder implements org.omg.CORBA.portable.Streamable
{
  public Factura.Facturas value = null;

  public FacturasHolder ()
  {
  }

  public FacturasHolder (Factura.Facturas initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Factura.FacturasHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Factura.FacturasHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Factura.FacturasHelper.type ();
  }

}
