package OOPS;

public class Oops {
    public static void main(String[] args) {
        Pen p1=new Pen("orange",5);
        p1.marks[0]=30;
        p1.marks[1]=40;
        p1.marks[2]=50;
        System.out.println(p1.color+" "+p1.tip);
        Pen p2=new Pen(p1);
        p1.marks[0]=69;
        System.out.println(p2.color+","+p2.tip+","+p2.marks[0]);
    }
}
class Pen{
    String color;
    int tip;
    int marks[];
    Pen(String color,int tip){
        this.color=color;
        this.tip=tip;
        this.marks=new int[3];
    }
    Pen(Pen p1){
        this.color=p1.color;
        this.tip=p1.tip;
        this.marks=p1.marks;
    }
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int newTip){
        this.tip=newTip;
    }
}
