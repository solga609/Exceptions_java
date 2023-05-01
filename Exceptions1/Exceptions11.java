package Exceptions1;

public class Exceptions11 {
    public static void main(String [] agrs){
        System.out.println(check(new int [][] {{1, 2, 5, 4, 6},{5, 6, 7, 3, 9},{8, 9, 7, 5, 4}}));
        System.out.println(check(new int [][] {{1, 2, 5, 4, 6},{5, 6, 7, 3, 9},{8, 9, 7, 5, 4}}));
    }
    public static int check (int[][] arr){
        int diff = 0;
        int l = arr.length;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].length !=l) throw new RuntimeException();
            for(int j = 0; j <arr.length; j++){
                if(arr[i][j] == 0 || arr[i][j]==1)
                diff-=arr[i][j];
                else throw new RuntimeException("Wrong length");
            }
        }

        return diff;
    }
}
