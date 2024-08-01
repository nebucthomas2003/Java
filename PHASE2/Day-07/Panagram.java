public class Panagram { //check whether it is a panagram or not
    public static void main(String[] args) {
    
        String str1="qwert";
        str1.toLowerCase();
        boolean allpresent=true;
        for (char ch = 'a'; ch < 'z'; ch++) {

            if (str1.contains(String.valueOf(ch))) {
                 allpresent=true;
                break;
            
        }}
        if (allpresent) {
            System.out.println("Its a panagram");
            
        }else{
            System.out.println("Its not a panagaram");
        }
            
    }
    }

