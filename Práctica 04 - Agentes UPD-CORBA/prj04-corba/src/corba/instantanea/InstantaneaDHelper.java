package corba.instantanea;


/**
* corba/instantanea/InstantaneaDHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from robot.idl
* martes 12 de noviembre de 2019 06:51:36 PM GMT
*/

abstract public class InstantaneaDHelper
{
  private static String  _id = "IDL:corba/instantanea/InstantaneaD:1.0";

  public static void insert (org.omg.CORBA.Any a, corba.instantanea.InstantaneaD that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corba.instantanea.InstantaneaD extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = corba.instantanea.EstadoRobotDHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "estadorobs",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (corba.instantanea.InstantaneaDHelper.id (), "InstantaneaD", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corba.instantanea.InstantaneaD read (org.omg.CORBA.portable.InputStream istream)
  {
    corba.instantanea.InstantaneaD value = new corba.instantanea.InstantaneaD ();
    int _len0 = istream.read_long ();
    value.estadorobs = new corba.instantanea.EstadoRobotD[_len0];
    for (int _o1 = 0;_o1 < value.estadorobs.length; ++_o1)
      value.estadorobs[_o1] = corba.instantanea.EstadoRobotDHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corba.instantanea.InstantaneaD value)
  {
    ostream.write_long (value.estadorobs.length);
    for (int _i0 = 0;_i0 < value.estadorobs.length; ++_i0)
      corba.instantanea.EstadoRobotDHelper.write (ostream, value.estadorobs[_i0]);
  }

}
