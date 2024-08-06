

public class FindReplace {
    public static void main(String[] args) {
        String s1="I am Nebu";
        String s2="Nebu";
        String s3="Ajmal";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.contains(s2)) {
                s1.replace(s2, s3);
                
            }
            
        }
        System.out.println(s1);


    }
    
}
