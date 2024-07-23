public class ElectionCommission {
   private String nationality;
   private String qualification;
   private  int age;

   public void setnation(String nationality){
      this.nationality=nationality;
   }
   public void setquali(String qualification){
      this.qualification=qualification;
   }
   public void setage(int age){
      this.age=age;
   }

   public String getnation(){
      return nationality;
   }
   public String getquali(){
      return qualification;
   }
   public int getage(){
      return age;
   }
    
}
