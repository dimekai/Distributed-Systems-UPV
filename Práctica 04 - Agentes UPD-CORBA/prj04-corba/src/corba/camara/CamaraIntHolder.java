package corba.camara;

/**
* corba/camara/CamaraIntHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from robot.idl
* martes 12 de noviembre de 2019 06:51:36 PM GMT
*/

public final class CamaraIntHolder implements org.omg.CORBA.portable.Streamable
{
  public corba.camara.CamaraInt value = null;

  public CamaraIntHolder ()
  {
  }

  public CamaraIntHolder (corba.camara.CamaraInt initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corba.camara.CamaraIntHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corba.camara.CamaraIntHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corba.camara.CamaraIntHelper.type ();
  }

}
