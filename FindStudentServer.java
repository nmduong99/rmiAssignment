//server

import java.rmi.*;
import java.net.*;

public class FindStudentServer {

  public static final String HOST = "localhost";

  public static void main(String args[]) {




    try {
      FindStudentImpl localobj = new FindStudentImpl();
      Naming.rebind("rmi://" +  HOST + "/FindStudent", localobj);
      System.out.println("Server ready!");
    }
    catch (RemoteException re) {
      re.printStackTrace();
    }
    catch (MalformedURLException mfe) {
      mfe.printStackTrace();
    }
  }
}
