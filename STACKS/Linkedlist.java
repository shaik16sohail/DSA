package STACKS;
import java.util.*;
public class Linkedlist {
    static class Node{
        int val;
        Node next;
        Node(){
            val=0;
            next=null;
        }
        Node(int data){
            this.val=data;
            this.next=null;
        }
    }
    static class Stack{
        Node top=null;
        boolean isEmpty(){
            return top==null;
        }
        void push(int data){
            Node newNode =new Node(data);
            newNode.next=top;
            top=newNode;
        }
        int pop(){
            if(isEmpty())
                return -1;
            int val=top.val;
            top=top.next;
            return val;
        }
        int peek(){
            if(isEmpty())
                return -1;
            return top.val;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
