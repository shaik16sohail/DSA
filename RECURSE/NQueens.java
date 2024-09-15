package RECURSE;

public class NQueens {
    static void print(char [][]board){
        System.out.println("--------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(char[][]board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q')
                return false;
        }
        int i=row-1;
        int j=col-1;
        while(i!=-1 && j!=-1){
            if(board[i][j]=='Q')
                return false;
            i--;
            j--;
        }
        i=row-1;
        j=col+1;
        while(i!=-1 && j!=board.length){
            if(board[i][j]=='Q')
                return false;
            i--;
            j++;
        }
        return true;
    }
    static boolean nqueens(char[][]board,int row){
        if(row==board.length){
            print(board);
            count++;
            return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                boolean ans=nqueens(board, row+1);
                board[row][j]='X';
                if(ans==true)
                    return true;
            }
        }
        return false;
    }
    static int count=0;
    public static void main(String[] args) {
        int n=3;
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        boolean ans=nqueens(board,0);
        System.out.println(ans);
        System.out.println(count);

    }
}
