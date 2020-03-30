//client

import java.rmi.*;
import java.net.*;
import java.util.*;

public class FindStudentClient {
  public static void main(String args[]) {
    try{
      String HOST = "localhost";
      FindStudent remobject = (FindStudent)Naming.lookup("rmi://" + HOST
      + "/FindStudent");
      System.out.println(remobject.display(HOST));
      Student mydata[] = remobject.getStudentData();
      Scanner sc = new Scanner(System.in);

      do{
        System.out.print("Enter student id: ");
        int sid = sc.nextInt();
        if (sid == 0)
          break;
        else{
          Student temp  = remobject.findById(mydata, sid);
          if (temp != null){
            System.out.println(temp.getName());
            System.out.println(temp.getId());
            System.out.println(temp.getDoB());
            System.out.println(temp.getClas());
          }
          else System.out.println("404 not found!");
        }
      } while (true);

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
