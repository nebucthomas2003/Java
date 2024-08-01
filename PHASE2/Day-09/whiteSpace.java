
public class whiteSpace { //remove white space from string
    public static void main(String[] args) {
        String str1= "I am Nebu";

        for (int i = 0; i < str1.length();) {
            String temp="";
            for (int j = i; j < str1.length(); j++) {
                if (str1.charAt(i)==' ') {
                    i++;
                    break;
                    
                }else{
                    temp = temp+str1.charAt(i);
                    i++;
                   
                        
                    }
                }
                System.out.print(temp);
                
            }
            
        }
    }
    
