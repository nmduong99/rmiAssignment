//server

import java.rmi.*;
import java.net.*;
import java.io.*;


public class FindStudentServer {

  public static final String HOST = "localhost";

  public static void main(String args[]) {
    try {
      FindStudentImpl localobj = new FindStudentImpl();
      Naming.rebind("rmi://" +  HOST + "/FindStudent", localobj);
    }
    catch (RemoteException re) {
      re.printStackTrace();
    }
    catch (MalformedURLException mfe) {
      mfe.printStackTrace();
    }
  }
}
