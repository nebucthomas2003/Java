import java.util.Scanner;;
public class c7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i]==' ') {
                continue;
                
            }else{
                System.out.print(ch[i]);
            }
            
        }

        sc.close();
    }
}
