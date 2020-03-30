//define remote interface

import java.rmi.*;
public interface FindStudent extends Remote {
  public String display() throws RemoteException;
}
