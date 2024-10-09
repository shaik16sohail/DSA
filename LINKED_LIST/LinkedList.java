package LINKED_LIST;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public void addFirst(int data){
        size++;
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        size++;
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node traversing=head;
        while(traversing!=null){
            System.out.print(traversing.data+" ");
            traversing=traversing.next;
        }
        System.out.println();
    }
    public void insert(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        int i=0;
        Node temp=head;
        while(i<idx-1){
            i++;
            temp=temp.next;
        }
        if(temp.next==null){
            addLast(data);
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        size++;
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("empty");
            return;
        }else if(size==1){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        
    }
    public void removeLast(){
        if(size==0){
            System.out.println("empty");
            return;
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        return;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key)
            return 0;
        int idx=helper(head.next,key);
        if(idx==-1)
            return -1;
        return idx+1;
    }
    public void Search(int key){
        int idx=helper(head,key);
        if(idx==-1){
            System.out.println("Not found!");
            return;
        }
        System.out.println("Found at " + idx);
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.insert(2, 69);
        ll.print();
        ll.insert(0,45);
        ll.print();
        ll.insert(6,89);
        ll.print();
        ll.Search(6);
        ll.removeFirst();
        ll.print();
        ll.Search(69);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.Search(3);
        ll.print();
        
    }
}
