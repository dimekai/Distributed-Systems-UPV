package corba.camara;


/**
* corba/camara/CamaraIntHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from robot.idl
* viernes 29 de noviembre de 2019 08:16:14 PM GMT
*/

abstract public class CamaraIntHelper
{
  private static String  _id = "IDL:corba/camara/CamaraInt:1.0";

  public static void insert (org.omg.CORBA.Any a, corba.camara.CamaraInt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corba.camara.CamaraInt extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (corba.camara.CamaraIntHelper.id (), "CamaraInt");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corba.camara.CamaraInt read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CamaraIntStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corba.camara.CamaraInt value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static corba.camara.CamaraInt narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corba.camara.CamaraInt)
      return (corba.camara.CamaraInt)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corba.camara._CamaraIntStub stub = new corba.camara._CamaraIntStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static corba.camara.CamaraInt unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corba.camara.CamaraInt)
      return (corba.camara.CamaraInt)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corba.camara._CamaraIntStub stub = new corba.camara._CamaraIntStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
