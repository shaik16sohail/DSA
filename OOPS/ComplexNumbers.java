package OOPS;
import java.util.*;
import java.lang.*;
public class ComplexNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number real part:");
        int real_one=sc.nextInt();
        System.out.print("Enter the first number imaginary part:");
        int imag_one=sc.nextInt();
        System.out.print("Enter the second number real part:");
        int real_two=sc.nextInt();
        System.out.print("Enter the second number imaginary part:");
        int imag_two=sc.nextInt();
        Complex c1=new Complex(real_one,imag_one);
        Complex c2=new Complex(real_two,imag_two);
        
        Complex add=Complex.sum(c1,c2);
        Complex sub=Complex.subtract(c1,c2);
        Complex mul=Complex.multiply(c1,c2);
        add.printComplex();
        sub.printComplex();
        mul.printComplex();
        
    }
}
class Complex{
    int real;
    int imag;
    Complex(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    static Complex sum(Complex a,Complex b){
        return new Complex((a.real+b.real),(b.imag+a.imag));
    }
    static Complex subtract(Complex a,Complex b){
       return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    static Complex multiply(Complex a,Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)),((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex(){
        System.out.println(real+"+"+imag+"i");
    }

}
