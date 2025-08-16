package Binary_search;

public class sorted_binary_search {
    public static void main(String[] args) {
        int [] arr1 = {-3,-2,-0,12,34,45,78};
        int target = 7;
        System.out.println(BinarySearch(arr1, target));
    }

    static int BinarySearch(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            // find the middle element
            //int mid = (start + end)/2; // might be possible that (start + end) excceed the integer range 
            int mid = start + (end - start)/2; 
            
            if(target < arr[mid]){  
                end = mid - 1;
            }
            else if(target > arr[mid]){  
                start = mid + 1;
            }
            else{
                return mid;  
            }
        }
        return -1;  
    }
}
