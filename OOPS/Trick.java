package OOPS;

public class Trick {
    public static void main(String[] args) {
        Vehicle obj1=new Car();
        obj1.print();
        
    }

}
class Vehicle{
    void print(){
        System.out.println("Base class");
    }
}
class Car extends Vehicle{
    // void print1(){
    //     System.out.println("derived class");
    // }
    void print(){
        System.out.println("derived class");
    }
}
