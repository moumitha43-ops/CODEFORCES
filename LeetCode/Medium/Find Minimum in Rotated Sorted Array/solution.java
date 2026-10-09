class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid;
        int m = Integer.MAX_VALUE;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[low]<=nums[mid]){
                m=Math.min(nums[low],m);
                low=mid+1;
            }
            else{
                m=Math.min(m,nums[mid]);
                high=mid-1;
            }
        }
        return m;
    }
}
//TC : [2,1]