package RECURSE;

public class BinaryStrings {
    static void PrintAll(String str,int length,int curr_length,boolean isOne){
        if(curr_length>length){
            System.out.print(str+" ");
            return;
        }
        PrintAll(str+"0", length, curr_length+1, false);
        if(isOne==false)
            PrintAll(str+"1", length, curr_length+1, true);
    }
    public static void main(String[] args) {
        int n=4;
        PrintAll("",n,1,false);
        System.out.println();
    }
}
