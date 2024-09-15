package OOPS;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal c=new Animal();
        c.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Cow extends Animal{
    void eat(){
        System.out.println("eats only veg");
    }
}
