package Domicilio;


/**
* Domicilio/_DomiciliosStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Domicilio.idl
* s�bado 17 de noviembre de 2018 10H51' COT
*/

public class _DomiciliosStub extends org.omg.CORBA.portable.ObjectImpl implements Domicilio.Domicilios
{

  public boolean insertarDomicilio (String Nombre, String Telefono, String Cedula)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarDomicilio", true);
                $out.write_wstring (Nombre);
                $out.write_wstring (Telefono);
                $out.write_wstring (Cedula);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarDomicilio (Nombre, Telefono, Cedula        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarDomicilio

  public boolean actualizarDomicilio (int id_domiciliario, String Nombre, String Telefono, String Cedula)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarDomicilio", true);
                $out.write_long (id_domiciliario);
                $out.write_wstring (Nombre);
                $out.write_wstring (Telefono);
                $out.write_wstring (Cedula);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarDomicilio (id_domiciliario, Nombre, Telefono, Cedula        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarDomicilio

  public boolean eliminarDomicilio (int id_domiciliario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarDomicilio", true);
                $out.write_long (id_domiciliario);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarDomicilio (id_domiciliario        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarDomicilio

  public String consultarDomicilio (int id_domiciliario)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("consultarDomicilio", true);
                $out.write_long (id_domiciliario);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return consultarDomicilio (id_domiciliario        );
            } finally {
                _releaseReply ($in);
            }
  } // consultarDomicilio

  public void shoutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shoutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shoutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shoutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Domicilio/Domicilios:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _DomiciliosStub
