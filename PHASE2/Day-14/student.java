import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int stdId;
    private String stdName;
    private String stdBranch;
    private String stdCollege;

    public Student(int stdId, String stdName, String stdBranch, String stdCollege) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdBranch = stdBranch;
        this.stdCollege = stdCollege;
    }

    public int getStdId() {
        return stdId;
    }

    public String getDetails() {
        return "ID: " + stdId + ", Name: " + stdName + ", Branch: " + stdBranch + ", College: " + stdCollege;
    }
}







///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class StudentDriver {
    private ArrayList<Student> studentList;

    public StudentDriver() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public String getStudentDetailsById(int stdId) {
        for (Student student : studentList) {
            if (student.getStdId() == stdId) {
                return student.getDetails();
            }
        }
        return "Student not found";
    }




    

    public static void main(String[] args) {

        StudentDriver driver = new StudentDriver();
        Scanner sc = new Scanner(System.in);

        driver.addStudent(new Student(1, "Nebu", "Computer Science", "Mahendra Engineering College"));
        driver.addStudent(new Student(2, "Thamizh", "Computer Science", "Mahendra Engineering College"));
        driver.addStudent(new Student(3, "Sanjai", "Computer Science", "Mahendra Engineering College"));
        driver.addStudent(new Student(4, "Magesh", "Computer Science", "Mahendra Engineering College"));
        driver.addStudent(new Student(5, "Mohan", "Computer Science", "Mahendra Engineering College"));
        System.out.println("Enter the ID: ");
        int id1 = sc.nextInt();
        System.out.println(driver.getStudentDetailsById(id1));

    }
}
