package inheritance;
// Here i want to extend the properties of class Box mentioned in Box.java
public class BoxWeigth extends Box {
    double weight;
    public BoxWeigth(){
        this.weight = -1;
    }
    public BoxWeigth (double l,double h,double w,double weight){
        super(l,w,h); // call the parent class constructor
        this.weight = weight;
        System.out.println(super.weight); // indicates the weight variable in Parent class 
    }
    public BoxWeigth(double side,double weight) {
super(side); // it means that there should be a constructor in parent class that takes single variable 
this.weight = weight;
    }
    // Now here if here i can make a copy constructor
    public BoxWeigth(BoxWeigth other ){
super(other);
weight = other.weight;
    }




}
