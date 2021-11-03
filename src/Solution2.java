public class Solution2 {
    public int search(int[] nums, int target) {
        int low = 0;
        int up = nums.length - 1;
        int midpoint;

        while (up >= low) {
            midpoint = low + (up - low) / 2;
            if (nums[midpoint] < target) {
                low = midpoint + 1;
            } else if(nums[midpoint] > target) {
                up = midpoint - 1;
            } else if (nums[midpoint] == target) {
                return midpoint;
            }
        }
        return -1;
    }
}
