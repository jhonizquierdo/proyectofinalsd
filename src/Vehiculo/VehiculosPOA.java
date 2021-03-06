package Vehiculo;


/**
* Vehiculo/VehiculosPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Vehiculo.idl
* domingo 18 de noviembre de 2018 02H56' COT
*/

public abstract class VehiculosPOA extends org.omg.PortableServer.Servant
 implements Vehiculo.VehiculosOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarVehiculo", new java.lang.Integer (0));
    _methods.put ("actualizarVehiculo", new java.lang.Integer (1));
    _methods.put ("eliminarVehiculo", new java.lang.Integer (2));
    _methods.put ("consultarVehiculo", new java.lang.Integer (3));
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
       case 0:  // Vehiculo/Vehiculos/insertarVehiculo
       {
         String matricula = in.read_wstring ();
         int id_domiciliario = in.read_long ();
         String marca = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarVehiculo (matricula, id_domiciliario, marca);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // Vehiculo/Vehiculos/actualizarVehiculo
       {
         String matricula = in.read_wstring ();
         int id_domiciliario = in.read_long ();
         String marca = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarVehiculo (matricula, id_domiciliario, marca);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // Vehiculo/Vehiculos/eliminarVehiculo
       {
         String matricula = in.read_wstring ();
         boolean $result = false;
         $result = this.eliminarVehiculo (matricula);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // Vehiculo/Vehiculos/consultarVehiculo
       {
         String matricula = in.read_wstring ();
         String $result = null;
         $result = this.consultarVehiculo (matricula);
         out = $rh.createReply();
         out.write_wstring ($result);
         break;
       }

       case 4:  // Vehiculo/Vehiculos/shoutdown
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
    "IDL:Vehiculo/Vehiculos:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Vehiculos _this() 
  {
    return VehiculosHelper.narrow(
    super._this_object());
  }

  public Vehiculos _this(org.omg.CORBA.ORB orb) 
  {
    return VehiculosHelper.narrow(
    super._this_object(orb));
  }


} // class VehiculosPOA
