//server

import java.rmi.*;
import java.net.*;

public class FindStudentServer {

  public static final String HOST = "localhost";

  public static void main(String args[]) {
    
    Student mydata[] = new Student[4];
    mydata[0] = new Student("Đỗ Xuân Anh","16020192","13/10/1998","QH-2016-I/CQ-C-A-CLC1");
    mydata[1] = new Student( "Nguyễn Công Tuấn Anh", "17021205","03/06/1999","QH-2017-I/CQ-C-A-CLC2");
    mydata[2] = new Student("Nguyễn Tuấn Anh","17021207","27/12/1999","QH-2017-I/CQ-C-A-CLC2");
    mydata[3] = new Student("Trương Việt Anh","17021209","26/11/1999","QH-2017-I/CQ-C-A-CLC2");
    
    
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



class Student {
  String name;
  String Id;
  String DoB;
  String clas;
  public Student(String name, String Id, String DoB, String clas){
    this.name = name;
    this.Id = Id;
    this.DoB = DoB;
    this.clas = clas;
 }

  public void setData(String name, String Id, String DoB, String clas) {
    this.name = name;
    this.Id = Id;
    this.DoB = DoB;
    this.clas = clas;
  }
}

