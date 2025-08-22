package Binary_search;

public class leetcode_34 {
    public static void main(String[] args) {

    } 
    public int [] findRange(int[] nums, int target){
        int[] ans= {-1,-1};
        int start = Find(nums,target, findStartIndex:true);
        int end = Find(nums,target, findStartIndex:false);
        
        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    static int Find(int[] nums, int target, boolean findStartIndex ){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } if (target > nums[mid]) {
                start = mid + 1;
            } else{
                ans = mid;
                if (findStartIndex == true){
                    end= mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
    }
    return ans;
}
