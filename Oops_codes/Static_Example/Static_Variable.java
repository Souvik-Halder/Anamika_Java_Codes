package Oops_codes.Static_Example;
class Student{
    int rollno;
    String name;
    static String schlname="Netaji";
}
public class Static_Variable {
    public static void main(String[] args) {
  
       
        
            Student anamika =new Student();
            anamika.name="Anamika";
            anamika.rollno=1;
            Student souvik =new Student();
            souvik.name="Souvik";
            souvik.rollno=2;
            //modifying the static variable 
            Student.schlname="Najrul";
            //accessing the static variable
            System.out.println(Student.schlname);
           
        
        
        
    }
}
