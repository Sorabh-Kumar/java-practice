import java.util.Scanner;
class student{
    public String name;        // Instance variable
    public int age;            // Instance variable
    public static String clg_name="GLA UNIVERSITY near Mathura , Uttar Pradesh ";          //Static variable use
}
public class StaticUse {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        //class_name obj_name = new(keyword) Constructor();         syntax
        student obj1=new student();
        student obj2=new student();
        System.out.println("Enter details of Student-1:- ");
        obj1.name=x.next();
        obj1.age=x.nextInt();
        System.out.println("Enter details of Student-2:- ");
        obj2.name=x.next();
        obj2.age=x.nextInt();
        //student.clg_name="Gla University";
        System.out.println(obj1.name+"   "+obj1.age+"    "+student.clg_name);
        System.out.println(obj2.name+"   "+obj2.age+"    "+student.clg_name);
    }
}