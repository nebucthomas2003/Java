
public class PanagramWords {
    public static void main(String[] args) {
        String s1="abcdefghijklmnopqrstuvwxy";
        s1.toLowerCase();
        boolean allpresent= true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!s1.contains(String.valueOf(ch))) {
                allpresent=false;
                break;
                
            }
        }
        if (allpresent) {
            System.out.println("Its a panagram");
            
        }else{
            System.out.println("its not a panagram");
        }
            
        }
    }

            
            
       
    
