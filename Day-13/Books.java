public class Books{
     Static int price;
    int pages;


    Books(int pages){
        this.pages=pages;

    }

    public static void main(String[] args) {
        Books  B1= new Books(120);
        Books B2 = new Books(200);
        Books B3 = new Books(420);
        System.out.println();

        B1.price=150;
        System.out.println(B1.price);
        System.out.println(B2.price);
        System.out.println(B3.price);


        B2.price=200;
        System.out.println(B1.price);
        System.out.println(B2.price);
        System.out.println(B3.price);



    }
}