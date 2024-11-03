package STACKS;
import java.util.*;
public class arraylist {
    static class Stack{
        static List<Integer> stack =new ArrayList<>();
        static boolean isEmpty(){
             return stack.size()==0;
        }
        static void push(int data){
            stack.add(data);
        }
        static int pop(){
            if(isEmpty())
                return -1;
            int val=stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return val;
        }
        static int peek(){
            return stack.get(stack.size()-1);
        }
        
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
