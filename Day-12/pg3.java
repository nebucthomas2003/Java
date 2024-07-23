class employ{
    String name;
    int id;
    int salary;

    public employ(String name, int id, int salary) { //constructor
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

}
public class pg3 {
    public static void main(String[] args) { //objects
        employ a1 = new employ("Nebu", 1, 12000);
        employ a2 = new employ("Magesh", 2, 100);
        employ a3 = new employ("Arjun", 3, 1134200);

        System.out.println("The name of employ is :"+a1.name);
        System.out.println("Id number:"+a1.id);
        System.out.println("Salary:"+a1.salary);

        System.out.println(a2.name);
        System.out.println(a2.id);
        System.out.println(a2.salary);
    }
    
}
