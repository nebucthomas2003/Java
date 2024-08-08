
// This is a java application which uses arraylist to store details of employees//
//It will ask for user to view employ details,remove details//
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String dept;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public void set(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String toString() {
        return "ID:" + id + "Name:" + name + "Dept:" + dept;

    }

    public int getid() {
        return id;
    }

    public String getdetails() {
        return "ID:" + id + "\nName:" + name + "\nDept:" + dept;
    }

    public String remdetails() {
        return "Employee details removed";

    }

}

class EmployeeDriver {
    private static ArrayList<Employee> EmployeeList;

    public EmployeeDriver() {
        EmployeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        EmployeeList.add(employee);

    }

    public String getEmployeedetailsbyId(int id) {
        for (Employee employee : EmployeeList) {
            if (employee.getid() == id) {
                return employee.getdetails();
            }

        }
        return "Not found";
    }

    public String getRemovedDetails(int id2) {
        for (Employee employee : EmployeeList) {
            if (employee.getid() == id2) {
                EmployeeList.remove(id2 - 1);
                return employee.remdetails();

            }

        }
        return "NOt FOund";
    }

    public static void getUpdatedDetails(int id3, String name1, String dept1) {
        for (Employee employee : EmployeeList) {
            if (employee.getid() == 5) {
                employee.set(id3, name1, dept1);
            }
        }
    }

    public static void main(String[] args) {
        EmployeeDriver driver = new EmployeeDriver();
        Scanner sc = new Scanner(System.in);
        driver.addEmployee(new Employee(1, "Nebu", "SDE"));
        driver.addEmployee(new Employee(2, "Thamizh", "Machine Learning"));
        driver.addEmployee(new Employee(3, "Sanjai", "Manager"));
        driver.addEmployee(new Employee(4, "Magesh", "MERN Dev"));
        driver.addEmployee(new Employee(5, "Mohan", "Android Dev"));

        getUpdatedDetails(90, "amuthan", " CSE");
        System.out.println(driver.EmployeeList);

        while (true) {
            System.out.println("******************************************************************************");
            System.out.println(">>>>>>>>>>>>>Employee Details App<<<<<<<<<<<<");
            System.out.println(" ");
            System.out.println("1.View Employ Details   2.Remove Employ Details  3.View All Details");
            int val1 = sc.nextInt();
            switch (val1) {
                case 1:
                    System.out.println("Enter the Id: ");
                    int id1 = sc.nextInt();
                    System.out.println(driver.getEmployeedetailsbyId(id1));
                    break;

                case 2:
                    System.out.println("Enter the id to be removed: ");
                    int id2 = sc.nextInt();
                    System.out.println(driver.getRemovedDetails(id2));
                    break;

                case 3:
                    System.out.println(driver.EmployeeList);
                    break;

                case 4:
                    System.out.println("Enter the Id to be updated: ");
                    int id3 = sc.nextInt();
                    System.out.println("Enter the name: ");
                    String name1 = sc.nextLine();
                    System.out.println("Enter the department: ");
                    String dept1 = sc.nextLine();

                default:
                    throw new AssertionError();

            }

        }

    }
}
