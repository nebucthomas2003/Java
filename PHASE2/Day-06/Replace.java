
public class Replace {//Replacing the element without using inbuild functions
    public static void main(String[] args) {
        String a= "Abc";
       
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='A' || a.charAt(i)=='a') {
               
                System.out.print(1);
                
            }else{
                System.out.print(a.charAt(i));
            }
            
        }
        

    }
    
}
