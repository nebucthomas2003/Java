
import java.util.ArrayList;
import java.util.Scanner;

class Bank {
    private int id;
    private String name;

    Bank(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getid() {
        return id;
    }

    public String getdetails() {
        return "Id: " + id + "\nName: " + name;
    }
}

class BankDriver {

    private ArrayList<Bank> Banklist;

    public BankDriver() {
        Banklist = new ArrayList<>();
    }

    public void addBank(Bank bank) {
        Banklist.add(bank);
    }

    public String getdetailsbyid(int id) {
        for (Bank bank : Banklist) {
            if (bank.getid() == id) {
                return bank.getdetails();
            }
        }
        return "Not found";
    }

    public static void main(String[] args) {
        BankDriver driver = new BankDriver();
        Scanner sc = new Scanner(System.in);
        driver.addBank(new Bank(1, "Nebu"));
        System.out.println(">>>>>>Bank Details<<<<<<");
        System.out.println("Enter the id: ");
        int id1 = sc.nextInt();
        System.out.println(driver.getdetailsbyid(id1));

    }
}
