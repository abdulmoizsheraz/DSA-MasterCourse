package inheritance;

public class BoxPrice extends BoxWeigth {
    double cost;
    // I will create constrcutors
    public BoxPrice(){
        this.cost=-1;
    }
    public BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }
 
    public BoxPrice(double l,double h,double w,double weight ,double cost){
        super(l,h,w,weight);
        this.cost=cost;
    }
}
