package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.walk();
        h.eat();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    void walk(){
        System.out.println("on 4 legs");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("on 2 legs");
    }
}
