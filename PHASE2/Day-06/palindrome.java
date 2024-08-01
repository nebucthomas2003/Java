public class palindrome { //check whether it is palindrome or not
    public static void main(String[] args) {
        String str ="Malayalam";
        String str1= new String();
        str = str.toLowerCase();
        str1=str1.toLowerCase();

        for (int i = str.length()-1; i >=0 ; i--) {
            str1+=str.charAt(i);
        }


        
        if (str.equals(str1)) {
            System.out.println("Its a palindrome");
            
        }else{
            System.out.println("its not a palindrome");
        }

        
    }
    
}
