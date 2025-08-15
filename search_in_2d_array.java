import java.util.Arrays;

public class search_in_2d_array {
    public static void main(String[] args) {
        int [][] arr = {
            {22,43,2,5},
            {12,31,78,1},
            {56,7,17}
        };
        int target = 17;
        int [] ans =twoDArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] twoDArray(int [][] arr, int target){
        if(arr.length == 0){
            return new int[] {-1,-1};
        }

        for( int i=0; i<arr.length; i++){

            for (int j=0; j<arr[i].length; j++){
                if(target == arr[i][j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
