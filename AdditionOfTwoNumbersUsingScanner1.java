import java.util.Scanner;
public class Constructor {
    public int age;                      //Instance Variable
    public String name;
    public void add(int A,int B){
        System.out.println(A+B);
    }
    Constructor(){                       //non-parameterized/default     Constructor is also a type of method .
        this.name= "unknown";
        this.age=0;
        //this.add(1,3);                     // Constructor is called when an instance of an object is created .
    }                                         //constructors are not considered members of a class .
    Constructor(String a,int b) {                //parameterized
        this.name=a;                    // This keyword is used to call the instance variable , method .
        this.age=b;
    }
}
class ConstructorExec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Constructor obj1=new Constructor("Aryan",20);
        System.out.println(obj1.name+"    "+obj1.age);
        Constructor obj2= new Constructor(sc.nextLine(),sc.nextInt());
        System.out.println(obj2.name+"    "+obj2.age);
        Constructor obj3=new Constructor();                      // use of non-parameterized constructor
        System.out.print(obj3.name+"   "+obj3.age);
    }
}