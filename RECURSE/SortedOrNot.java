package RECURSE;

// package RECURSION;
public class SortedOrNot {
    static int check(int arr[],int n,int prev,int curr_ind){
        if(curr_ind==n){
            return 1;
        }
        if(arr[curr_ind]>=prev)
            return check(arr, n, arr[curr_ind], curr_ind+1);
        return 0;

    }
    public static void main(String[] args) {
        int arr[]={3,4,5,90,7,8};
        if(check(arr,arr.length,0,0)==1)
            System.out.println("sorted");
        else 
            System.out.println("Unsorted");
    }
}

