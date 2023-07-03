package inheritance;
  public  class Box { // if i put final here it will not allaow any other class to create inheritance
    double l;
    double w;
    double h;
    double weight;

    Box(){
this.l = -1;
this.w = -1;
this.h = -1;
    }
    Box(double side){ 
this.l = side;
this.w = side;
this.h = side;
    }
    Box(double l, double w, double h){
        super(); // refers to object class 
this.l=l;
this.w=w;
this.h=h;
    }
// Copy constructor
    Box(Box old ){
this.l=old.l;
this.w=old.w;
this.h=old.h;
    }
    public void Info(){
System.out.println("Information about box");
    }
}
