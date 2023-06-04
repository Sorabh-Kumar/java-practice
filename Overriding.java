//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
//Overriding is also called Dynamic method dispatch / Runtime polymorphism.
public class Overriding {
    public void Display() {
        System.out.println("Yash");
    }
}
class OverridingExec extends Overriding{
    public void Display() {
        super.Display();
        System.out.println("Saamoohik Beta");
    }
    public static void main(String[] args) {
        OverridingExec obj = new OverridingExec();
        obj.Display();
    }
}