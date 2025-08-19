package Binary_search;
public class Flloor_of_a_number {
    public static void main(String[] args) {
        int [] arr1 = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floor(arr1, target));
    }

    static int floor(int [] arr, int target){
       int start = 0;
        int end = arr.length-1;
        if (target < arr[arr.length-1]){
            return -1;
        }
        while(start <= end){
            
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
        return arr[end];
    }
}
