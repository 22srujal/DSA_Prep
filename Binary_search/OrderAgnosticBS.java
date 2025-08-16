package Binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr1 = {78,45,34,12,0,-1,-3};
        int target = 12;
        System.out.println(orderagnosticbs(arr1, target));
    }

    static int orderagnosticbs(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isasec = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }

            if(isasec){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if (target > arr[mid]){
                    start=mid + 1;
                }
            }
            else{
                 if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start=mid + 1;
                }
            }
        }
        return -1;
    }
}
