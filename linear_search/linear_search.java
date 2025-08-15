public class linear_search {
    public static void main (String[] args){
        int [] arr = {10,23,45,12,1,34,56};
        int target= 23;
        boolean search= l_search(arr, target);
        System.out.println(search);      
        
    }

    static boolean l_search2 (int [] arr, int target ){
        if (arr.length==0){
            return false;
        }

        for (int i=0; i<arr.length;i++ ){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

    static boolean l_search (int arr[], int target ){
        if (arr.length==0){
            return false;
        }

        for (int element : arr ){
            if (element == target){
                return true;
            }
        }
        return false;
    }
}


