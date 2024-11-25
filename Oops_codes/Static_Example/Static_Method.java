package Oops_codes.Static_Example;
class Student{
    int rollno;
    String name;
    static String schlname="Netaji";
    void show(){
    System.out.println(name +" "+rollno+" "+schlname);
    }
    static void show1(){
    System.out.println(schlname);
}
}

class Static_Method{
 public static void main(String args[]){
    Student anamika =new Student();
    anamika.name="Anamika";
    anamika.rollno=1;
    Student souvik =new Student();
    souvik.name="Souvik";
    souvik.rollno=2;
    System.out.println(Student.schlname);
    Student.schlname="Najrul";
    souvik.show();
    Student.show1();

}
}
