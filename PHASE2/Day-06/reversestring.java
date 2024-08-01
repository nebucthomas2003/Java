public class reversestring { //Program to reverse a string
    public static void main(String[] args) {
        String str ="Nebu";
        String str1 = new String();

        for (int i = str.length()-1; i >=0; i--) {
            str1+=str.charAt(i);
           
            
        }
        System.out.println(str1);
    }
    
}
