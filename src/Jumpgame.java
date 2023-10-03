import static java.lang.Math.max;

public class Jumpgame {
    static class Solution {
        public boolean canJump(int[] nums) {
            int reachable = 0;
            for(int i=0;i<nums.length;i++){
                if(i>reachable){
                    return false;
                }
                reachable = Math.max(reachable,nums[i]+i);
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        int nums[] = new int[]{1,3,2,0,2};
        obj.canJump(nums);

    }
}
