/*
import java.util.Arrays;
import java.util.Scanner;

*//*
*/
/*

*//*

*/
/*
class hello{
    int age;      //Instance Variable
    String name;
    private int fees;

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void Display(int a, int b)
    {
        System.out.println(a+b);
    }

}

public class Practice {

    public static void main(String[] args) {
        int a; //local variable
        hello aryan=new hello();
        aryan.name="aryan";
        aryan.age=19;
        aryan.name="Tanmay";
        hello vaivhav=new hello();
        vaivhav.name="vaivhav";
        vaivhav.age=20;
        hello sourabh=new hello();
        sourabh.age=15;
        sourabh.name="Sourabh";
        aryan.setFees(20);
//        System.out.println(sourabh.name+sourabh.age);
//        System.out.println(aryan.name);
//        System.out.println(aryan.getFees(40000));
        aryan.Display(20,50);
    }
}*//*
*/
/*
*//*

*/
/*

class Car{
    public String name;
    public int price;
    Car(String b,int a)
    {
        name=b;
        price=a;
    }
    public int max(int a,int b,int c)
    {
        int arr[] ={a,b,c};
        Arrays.stream(arr).sorted();
        return
    }
}
public class Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Car obj1 = new Car(s.next(),s.nextInt());
        Car obj2 = new Car("Ferrari",20);
        Car obj3 = new Car("hyundai",15);
    }
}*//*
*/
/*

public class Practice{
    public static void main(String[] args) {
        String s="ARYAN";
        System.out.print(s.charAt(3));
    }
}
*//*

import java.util.InputMismatchException;
import java.util.Scanner;
class Driver{
    public static void main(String[] args){
        try{
            Scanner x=new Scanner(System.in);
            int a=x.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Aryan Tewatia");
        }
    }
}*/






/*
import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {
        //Scanner s=new Scanner("my name is neeraj");
        */
/*while(s.hasNext()){
            s.next();
        }*//*

        //try with resources
        try(Scanner s=new Scanner(System.in)){
            int i=Integer.parseInt(s.next());
        }
        catch(Exception obj){
            obj.printStackTrace();
            System.out.println(obj.toString());
            System.out.println(obj.getMessage());
            System.out.println(obj);
        }
        System.out.println("end of the method");
    }
}*/


import java.util.Scanner;
public class Practice{
    public void m1(){
        m2();
    }
    public void m2(){

    }
    public static void main(String[] args) {
        /*Integer i1= 122;
        //Integer i1=Integer.valueOf(234);
        int a=i1;    //Unboxing*/
        Practice obj=new Practice();
        obj.m1();
    }
}