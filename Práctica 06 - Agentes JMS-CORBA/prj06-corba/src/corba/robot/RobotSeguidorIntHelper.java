package corba.robot;


/**
* corba/robot/RobotSeguidorIntHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from robot.idl
* viernes 29 de noviembre de 2019 08:16:14 PM GMT
*/

abstract public class RobotSeguidorIntHelper
{
  private static String  _id = "IDL:corba/robot/RobotSeguidorInt:1.0";

  public static void insert (org.omg.CORBA.Any a, corba.robot.RobotSeguidorInt that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corba.robot.RobotSeguidorInt extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (corba.robot.RobotSeguidorIntHelper.id (), "RobotSeguidorInt");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corba.robot.RobotSeguidorInt read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_RobotSeguidorIntStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corba.robot.RobotSeguidorInt value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static corba.robot.RobotSeguidorInt narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corba.robot.RobotSeguidorInt)
      return (corba.robot.RobotSeguidorInt)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corba.robot._RobotSeguidorIntStub stub = new corba.robot._RobotSeguidorIntStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static corba.robot.RobotSeguidorInt unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corba.robot.RobotSeguidorInt)
      return (corba.robot.RobotSeguidorInt)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corba.robot._RobotSeguidorIntStub stub = new corba.robot._RobotSeguidorIntStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
