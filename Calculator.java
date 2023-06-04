import java.util.Scanner;
    class find{                    // We can create many number of classes in a program .
    public int a;                    //Instance Variable      It can be used in any class in which its object is made .
    public int b;                    //Instance Variable
    public int Add(int A,int B){         // We can create many number of methods inside any class .
        return (A+B);                    // Local Variable
    }
    public int subtract(int A,int B){                   //Method
        return(A-B);
    }
    public int multiply(int A,int B){
        return(A*B);
    }
    public int divide(int A,int B){
        return(A/B);
    }
}
public class Calculator{
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        find obj=new find();
        System.out.println("Enter the full statement : ");
        obj.a=x.nextInt();
        String str=x.next();
        obj.b=x.nextInt();
        //Method 1
        /* if(str.equals("+"))
            System.out.print(obj.Add(obj.a, obj.b));
        else if(str.equals("-"))
            System.out.print(obj.subtract(obj.a, obj.b));
        else if(str.equals("*"))
            System.out.print(obj.multiply(obj.a, obj.b));
        else if(str.equals("/"))
            System.out.print(obj.divide(obj.a, obj.b));*/
        //Method 2
        switch (str) {
            case "+" -> System.out.print(obj.Add(obj.a, obj.b));
            case "-" -> System.out.print(obj.subtract(obj.a, obj.b));
            case "*" -> System.out.print(obj.multiply(obj.a, obj.b));
            case "/" -> System.out.print(obj.divide(obj.a, obj.b));
        }
    }
}