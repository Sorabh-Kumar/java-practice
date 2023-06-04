//MultiThreading
    public class Driver2 {
    public static void main(String []args){
        Thread obj = Thread.currentThread();
        System.out.println(obj.getName());
        obj.setName("First");
        System.out.println(obj.getName() + "\n" + obj.isAlive() + "\n" + obj.getId() + "\n" + obj.getPriority());
        System.out.println(obj.isDaemon());
        //low priority threads are known as daemon threads
        //default value of minimum priority is 1
        obj.setPriority(Thread.MIN_PRIORITY);     //it does not return anything
        /*there are two ways to create the multithreading -
        1) by extending thread class
        2) by implementing runnable interface AKA Functional interface which have only one method
        called run() method.*/
    }
}
