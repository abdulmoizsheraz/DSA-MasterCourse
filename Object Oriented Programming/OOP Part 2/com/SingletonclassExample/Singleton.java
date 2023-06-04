public class Singleton{
    private Singleton(){

    }
    private static  Singleton instance; // object
    public static  Singleton getInstance(){
        // getter method
        if(instance == null){
instance=new Singleton();
        }
        return instance;
    }
}