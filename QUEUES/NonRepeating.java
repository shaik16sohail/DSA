package QUEUES;
import java.util.*;
public class NonRepeating {

    public static void main(String[] args) {
        HashMap<Character,Integer> map=new HashMap<>();
        Queue<Character> queue=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string here:");
        String str= sc.nextLine();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            queue.add(c);
            map.put(c, map.getOrDefault(c, 0)+1);
            while (!queue.isEmpty() && map.get(queue.peek())>1) {
                queue.remove();
            }
            // System.out.println(queue.isEmpty()?-1:(char)queue.peek());
            if(queue.isEmpty())
                System.out.println(-1);
            else
                System.out.println(queue.peek());
        }

    }
}
