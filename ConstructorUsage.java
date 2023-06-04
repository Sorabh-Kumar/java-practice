public class ConstructorUsage {
    ConstructorUsage(){
        System.out.println("Hello Programmer!");
    }
    ConstructorUsage(String name){
        System.out.println("Hello "+name);
    }
    ConstructorUsage(int a){
        System.out.println("hello"+a);
    }
    ConstructorUsage(int a,int b)
    {
        System.out.println("hello"+a+b);
    }
}
class ConstrictorUsageExec{
    public static void main(String[] args) {
        ConstructorUsage obj1= new ConstructorUsage();
        ConstructorUsage obj2=new ConstructorUsage("Aryan");
        ConstructorUsage obj3 = new ConstructorUsage(5,6);
        ConstructorUsage obj4= new ConstructorUsage(9);
    }
}
