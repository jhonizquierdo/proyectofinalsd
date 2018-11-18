package Factura;


/**
* Factura/FacturasPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Factura.idl
* domingo 18 de noviembre de 2018 01H57' COT
*/

public abstract class FacturasPOA extends org.omg.PortableServer.Servant
 implements Factura.FacturasOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarFactura", new java.lang.Integer (0));
    _methods.put ("actualizarFactura", new java.lang.Integer (1));
    _methods.put ("eliminarFactura", new java.lang.Integer (2));
    _methods.put ("consultarFactura", new java.lang.Integer (3));
    _methods.put ("shoutdown", new java.lang.Integer (4));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Factura/Facturas/insertarFactura
       {
         int id_cliente = in.read_long ();
         int id_producto = in.read_long ();
         int id_vendedor = in.read_long ();
         String fecha = in.read_wstring ();
         int id_vehiculo = in.read_long ();
         boolean $result = false;
         $result = this.insertarFactura (id_cliente, id_producto, id_vendedor, fecha, id_vehiculo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Factura/Facturas/actualizarFactura
       {
         int id_factura = in.read_long ();
         int id_cliente = in.read_long ();
         int id_producto = in.read_long ();
         int id_vendedor = in.read_long ();
         String fecha = in.read_wstring ();
         int id_vehiculo = in.read_long ();
         boolean $result = false;
         $result = this.actualizarFactura (id_factura, id_cliente, id_producto, id_vendedor, fecha, id_vehiculo);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Factura/Facturas/eliminarFactura
       {
         int id_factura = in.read_long ();
         boolean $result = false;
         $result = this.eliminarFactura (id_factura);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Factura/Facturas/consultarFactura
       {
         int id_factura = in.read_long ();
         String $result = null;
         $result = this.consultarFactura (id_factura);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Factura/Facturas/shoutdown
       {
         this.shoutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Factura/Facturas:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Facturas _this() 
  {
    return FacturasHelper.narrow(
    super._this_object());
  }

  public Facturas _this(org.omg.CORBA.ORB orb) 
  {
    return FacturasHelper.narrow(
    super._this_object(orb));
  }


} // class FacturasPOA
