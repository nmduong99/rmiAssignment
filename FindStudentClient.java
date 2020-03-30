//client

import java.rmi.*;
import java.net.*;
import java.io.*;
public class FindStudentClient {
  public static void main(String args[]) {
    try {
      String host="127.0.0.1";
      FindStudent remobject = (FindStudent)Naming.lookup("rmi://" + host
      + "/FindStudent");
      System.out.println(remobject.display());
    }
    catch (RemoteException re){
      re.printStackTrace();
    }
    catch (NotBoundException nbe){
      nbe.printStackTrace();
    }
    catch (MalformedURLException mfe){
      mfe.printStackTrace();
    }
  }
}
