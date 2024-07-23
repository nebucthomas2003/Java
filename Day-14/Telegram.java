
import java.util.Scanner;  //encapsulation

class Telegram {

    private String name;
    private long num;
    private String mail;

    public void setname(String name) {
        this.name = name;
    }

    public void setnum(long num) {
        this.num = num;
    }

    public void setmail(String mail) {
        this.mail = mail;
    }

    public String getname() {
        return name;
    }

    public long getnum() {
        return num;
    }

    public String getmail() {
        return mail;
    }

}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Telegram contact = new Telegram();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        contact.setname(name);
        System.out.println("Enter the num:");
        long num = sc.nextLong();
        sc.nextLine(); 
        contact.setnum(num);
        System.out.println("Enter the mail:");
        String mail = sc.nextLine();
        contact.setmail(mail);


        System.out.println("-----------------------------------");
    
        // Print the contact information
        System.out.println("Contact Information:");
        System.out.println("Name: " + contact.getname());
        System.out.println("Number: " + contact.getnum());
        System.out.println("Mail: " + contact.getmail());
    }
}
