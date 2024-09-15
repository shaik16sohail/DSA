package PATTERNS;

import java.lang.*;
import java.io.*;

public class some {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,i,j,a=1,t;
        System.out.print("Enter N value:");
        n=Integer.parseInt(br.readLine());
        for(i=1;i<=n;i++)
        {
        if(i%2==0)
        {
        t=a+n;
        for(j=1;j<n;j++)
        {
        System.out.print((t++)+"*");
        }
        System.out.println(t++);
        }
        else
        {
        for(j=1;j<n;j++)
        {
        System.out.print((a++)+"*");
        }
        System.out.println(a++);
        }
        }
        
    }
}
