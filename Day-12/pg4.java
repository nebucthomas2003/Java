class Student{
    int Sid;
    String Sname;
    int Sage;

   public Student(int Sid)
 {
    this.Sid=Sid;
  }

 Student(int Sid, String Sname){
    this.Sid= Sid;
    this.Sname= Sname;
 }
 Student(int Sid, String Sname, int sid){
    this.Sid=Sid;
    this.Sname=Sname;
    this.Sage=Sage;
 }


public class pg4 {
    public static void main(String[] args) {
        Student s1 = new Student(01);
        System.out.println(s1.Sage);
        Student s2 = new Student(02, "Nebu");
        System.out.println(s2.Sid);
        sou
        Student s3 = new Student(03, "Ajmal", 42);
    }
    
}
}