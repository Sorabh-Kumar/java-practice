public class ConstructorInherit {
    public int age;
    public String name;
    ConstructorInherit() {
    }
    ConstructorInherit(int a,String b) {
        age=a;
        name=b;
        System.out.println(a+"   "+b);
    }
}
class ConstructorInherit2 extends ConstructorInherit{
    public static void main(String[] args) {
        ConstructorInherit obj = new ConstructorInherit(55,"Vaibhav");
    }
}