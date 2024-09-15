package OOPS;

public class MultipleInheritance {
    public static void main(String[] args) {
        Carnivores c=new Carnivores();
        c.eat();
    }
}
interface herbivores{
    void eat();
}
interface omnivores{
    void eat();
}
class Carnivores implements herbivores,omnivores{
    public void eat(){
        System.out.println("eats both veg and non-veg");
    }
}
