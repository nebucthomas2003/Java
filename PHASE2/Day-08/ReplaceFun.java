public class ReplaceFun { // Replace the word with another word without methods
    public static void main(String[] args) {
        String str1 = "I am Nebu";
        String str2 = "Nebu";
        String str3 = "Thamizh";

        

        for (int i = 0; i < str1.length();) {
            String temp ="";
            for (int j = i; j < str1.length(); j++) {
                if (str1.charAt(j)==' ') {
                    i++;
                    break;
                    
                }else{
                    i++;
                    temp=temp+str1.charAt(j);
                    if (temp.equalsIgnoreCase(str2)) {
                        temp=str3;
                        
                    }
                    
                }
                
                
            }System.out.print(temp);
            
            
        }
        
     
    }
}
