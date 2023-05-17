public class Innerclass {
    static  class Student{

       static int id;
       static  String name;
         static  void  print(){
            System.out.println("The Name of Student is "+name+" and its ID is "+id);
        }
    }
    public static void main(String[] args) {
        Student Zain=new Student();
        Zain.id=12;
        Zain.name="Zain";
         Zain.print(); // we should use Student.print() 
    }

}

