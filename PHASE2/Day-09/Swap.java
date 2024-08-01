
public class Swap {//swap to string without third variable
    public static void main(String[] args) {
        String str1="Hai";
        String str2 ="Hello";
        System.out.println("Before Swap");
        System.out.println("***************");
        System.out.println(str1);
        System.out.println(str2);

        str1= str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
       System.out.println();
        System.out.println("After Swap");
        System.out.println("***************");
        System.out.println(str1);
        System.out.println(str2);

        
        


        
                
            }
            
        }

  