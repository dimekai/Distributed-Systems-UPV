package corba.camara;


/**
* corba/camara/CamaraIntPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from robot.idl
* viernes 29 de noviembre de 2019 08:16:14 PM GMT
*/

public abstract class CamaraIntPOA extends org.omg.PortableServer.Servant
 implements corba.camara.CamaraIntOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("SuscribirRobot", new java.lang.Integer (0));
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
       case 0:  // corba/camara/CamaraInt/SuscribirRobot
       {
         String IORrob = in.read_string ();
         corba.camara.suscripcionD $result = null;
         $result = this.SuscribirRobot (IORrob);
         out = $rh.createReply();
         corba.camara.suscripcionDHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:corba/camara/CamaraInt:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public CamaraInt _this() 
  {
    return CamaraIntHelper.narrow(
    super._this_object());
  }

  public CamaraInt _this(org.omg.CORBA.ORB orb) 
  {
    return CamaraIntHelper.narrow(
    super._this_object(orb));
  }


} // class CamaraIntPOA
