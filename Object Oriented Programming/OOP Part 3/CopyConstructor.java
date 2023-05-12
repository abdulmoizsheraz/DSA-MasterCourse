public class CopyConstructor {
  static class Testing{
   private  int a;
    private int b;
    private int c;
   Testing(int a,int b){
        this.a=a;
        this.b=b;
    }
    // Copy  Contructor
    Testing(Testing other){
        this.a=other.a;
        this.c=other.b;
    }
 } 
 public static void main(String[] args) {
    Testing obj1=new Testing(10,20);
    Testing obj2=new Testing(obj1);
   System.out.println(obj2.c);
 }  
}
