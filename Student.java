// student class
import java.io.Serializable;

public class Student implements Serializable {
  public String name;
  public int Id;
  public String DoB;
  public String clas;


  public Student(String name, int Id, String DoB, String clas){
    this.name = name;
    this.Id = Id;
    this.DoB = DoB;
    this.clas = clas;
 }

  public void setData(String name, int Id, String DoB, String clas) {
    this.name = name;
    this.Id = Id;
    this.DoB = DoB;
    this.clas = clas;
  }

  public String getName(){
    return name;
  }
  public int getId(){
    return Id;
  }
  public String getDoB(){
    return DoB;
  }
  public String getClas(){
    return clas;
  }
}
