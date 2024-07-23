import java.util.Scanner;

public class V6 {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the colour");
        String colour = Sc.next();

        if(colour.equals("red") || colour.equals("green") || colour.equals("blue"))
        {
            if (colour.equals("red")) {
                System.out.println("Stop");
                
            }
            else if(colour.equals("green")){
                System.out.println("Go");
            }
            else if(colour.equals("blue")){
                System.out.println("Go Slow");
            }
        }
        else{
            System.out.println("Invalid Colour");
        }
        Sc.close();


    
    }
    
}
