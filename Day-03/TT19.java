import java.util.Scanner;
public class TT19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 letter word:");
        String word = sc.nextLine();

        if(word.charAt(0)=='x'){
            System.out.println("Word found");
        }
        else if(word.charAt(1)=='x'){
            System.out.println("Word found");
        }
        else if(word.charAt(2)=='x'){
            System.out.println("Word found");
        }
        else if(word.charAt(3)=='x'){
            System.out.println("Word found");
        }
        else if(word.charAt(4)=='x'){
            System.out.println("Word found");
        }
        else{
            System.out.println("not found");
        }
    }
    
}
