public class Find_minimum {
    public static void main(String [] args){
        int [] arr = {14,45,-123,67,9,3};
        System.out.println(min(arr));
    }

    static int min(int [] arr){
        int ans = arr[0];
        for(int i=1; i < arr.length; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
