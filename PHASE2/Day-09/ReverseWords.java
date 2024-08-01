
public class ReverseWords { //Reverse words using spilt method
    public static void main(String[] args) {
        String s1 = "I am Nebu";
        String str[] = s1.split(" ");

        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i]+" ");

        }

    }

}
