//implement remote interface

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class FindStudentImpl extends UnicastRemoteObject implements FindStudent {

  private static final long serialVersionUID = 1L;

  public FindStudentImpl() throws RemoteException {
  };
  public String display(String host) throws RemoteException {
    return("connected to " + host + " successfully");
  }

  public Student[] getStudentData(){
      Student mydata[] = new Student[4];
      mydata[0] = new Student("Do Xuan Anh", 16020192,"13/10/1998","QH-2016-I/CQ-C-A-CLC1");
      mydata[1] = new Student("Nguyen Cong Tuan Anh", 1702120,"03/06/1999","QH-2017-I/CQ-C-A-CLC2");
      mydata[2] = new Student("Nguyen Tuan Anh", 17021207,"27/12/1999","QH-2017-I/CQ-C-A-CLC2");
      mydata[3] = new Student("Truong Viet Anh", 17021209,"26/11/1999","QH-2017-I/CQ-C-A-CLC2");
      return mydata;
  }
  public Student findById(Student[] mydata, int sid){
      for (int i = 0; i < mydata.length; i++){
        if (mydata[i].Id == sid)
          return mydata[i];
      }
      return null;
  }
}
