//Inheritance - it is a concept that acquires the properties from one class to other classes .
import java.util.Scanner;
class peace{
    public void jam(int a){
        System.out.println(a+2);        // Overloading matters on the following factors - Number of variable , Types of variables , Sequencing of variables .
    }
    public void jam(int a,int b){
        System.out.println(a+b);
    }
    public void jam(int a, String str, int c){
        System.out.println(a+" "+str+c);
    }
}
public class Overloading {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        //Overloading    It is also called compile time polymorphism or static banding.
        // The process by which we create more than one method by the same name is called overloading .
        peace obj1=new peace();
        obj1.jam(x.nextInt());
        obj1.jam(x.nextInt(),x.nextInt());
        obj1.jam(x.nextInt(),x.next(),x.nextInt());
    }
}
