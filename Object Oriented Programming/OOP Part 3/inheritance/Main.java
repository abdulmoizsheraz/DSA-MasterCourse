package inheritance;
//  File Where all classes will run 
public class Main {
    public static void main(String[] args) {
        BoxWeigth box1 = new BoxWeigth();
        BoxWeigth box2 = new BoxWeigth(2,3,5,7); // Now it will give me error until i defined the error Now defining the constructor in BoxWeigth.java
         // Now if you want to do like this it will also take constructor from parent class
        System.out.println(box1.weight +" "+box1.h+" " +box1.l+" "+box1.w);
        System.out.println(box2.l+" "+box2.h+" " +box2.w+" " +box2.weight);
// Now if i create the BoxWeight object and that object is refered by the Box class just like below
Box box10=new BoxWeigth(2,4,5,7);
// System.out.println(BoxWeigth.weight);  error
// -->Imp Note:It is actually the type of reference variable that determines the what variable can  be accessed like in above we can accesss l w h but not weight
// Now if i create a reference variable of class BoxWeight and then create a constructor of parent class Box 
// just like this one 
// BoxWeigth box11=new Box(2,3,5,6);
// Now here Box is not able to access the child variables which is weight (fourth argument ) in this case
    }
}
