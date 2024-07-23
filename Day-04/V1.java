import java.util.Scanner;

public class V1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the language code:");
        System.out.println("en,es,fr");
        String code = sc.nextLine();

        switch (code) {
            case "en":{
                System.out.println("Hello");
                break;
            }
            case "es":{
                System.out.println("Hola");
                break;
            }
            case "fr":{
                System.out.println("Bonjour");
                break;
            }
                
        
            default:
                throw new AssertionError();
        }


    
    }
    
}
