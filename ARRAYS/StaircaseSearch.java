package ARRAYS;

public class StaircaseSearch {
    static boolean search(int mat[][],int key){
        int i=mat.length-1,j=0;
        while(i>=0 && j<mat[0].length){
            if(key==mat[i][j]){
                System.out.println("found at ("+i+","+j+")");
                return true;
            }
            else if(key<mat[i][j]){
                i--;
            }else
                j++;
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(search(matrix,33));
    }
}
