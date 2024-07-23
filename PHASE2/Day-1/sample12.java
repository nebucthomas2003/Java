public class sample12 { //count odd elements in an array
    public static void main(String[] args) {
        int a[]={10,20,30,40,28,36,7,9};
        int count=0;
        for (int i = 0; i <=a.length-1; i++) {
            if (a[i]%2 !=0) {
                count++;
                
            }
            
        }
        System.out.println(count);
    }
    
}
