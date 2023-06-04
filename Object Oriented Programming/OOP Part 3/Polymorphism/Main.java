package Polymorphism;
public class Main {
    public static void main(String[] args) {
        Shapes s1=new Circle(); // this is called Runtime polymorphism
            s1.Area();
            // as we know from the pervious concepts that only those method will call that are accesssible by 
            // REference variable (in the case Shapes ) ,Yes that was true Area method will be called but which version of the area will called depends on the object(in this case Circle object) [THis is Statement is true if both child and parent has same methods [same name ,same argument etc] this process is called upcasting ] .This whole phenomena is called overriding .put overide before the method to test whether is the overide or not 
            // This is clear but how java knows which method to execute or not[java will determine which method to execute at runtime and this is called dynamic method dispatching]
    }
}
