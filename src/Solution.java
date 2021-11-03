import java.util.*;

public class Solution {
    public int search(int[] nums, int target) {
        int answer = Arrays.binarySearch(nums, target);
        if (answer < 0) {
            return -1;
        }
        return answer;
    }
}
