//implement remote interface

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class FindStudentImpl extends UnicastRemoteObject implements FindStudent {
  public FindStudentImpl() throws RemoteException{};
  public String display() throws RemoteException {
    return("hello");
  }
}
