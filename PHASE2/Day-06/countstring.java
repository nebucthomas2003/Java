class countstring {
    public static void main(String[] args) {
        String a = "AbcdAaa";
        int count1 = 0;
        int count2=0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)=='A') {
                count1++;
                
            }else if(a.charAt(i)=='a'){
                count2++;
            }
            

        }System.out.println("The count of A:"+count1);
        System.out.println("The count of a:"+count2);

    }
}