public class max_in_2D_array {
    public static void main(String[] args) {
            int [][] arr = {
                {22,43,12,5},
                {12,31,78,10},
                {56,7,17}
            };
            System.out.println(minintwoDArray(arr));
        }

    static int minintwoDArray(int [][] arr){
        int max =arr[0][0]; // Interger.MAX_VALUE;
        for( int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }   

}
