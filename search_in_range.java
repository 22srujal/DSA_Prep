public class search_in_range {
    public static void main(String[] args) {
        int [] arr = {10,45,2,5,12,89};
        int target = 2;
        int sart = 2;
        int end = 4;
        System.out.println(l_search(arr, target, sart, end));
    }

    static boolean l_search (int [] arr, int target, int start, int end ){
        if (arr.length==0){
            return false;
        }

        for (int i = start; i <= end; i++ ){
            if (arr[i]== target){
                return true;
            }
        }
        return false;
    }
}
