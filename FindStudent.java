//define remote interface

import java.rmi.*;
public interface FindStudent extends Remote {
  public String display(String host) throws RemoteException;
  public Student[] getStudentData() throws RemoteException;
  public Student findById(Student[] mydata, int sid) throws RemoteException;
}
