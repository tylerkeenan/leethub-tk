class Solution {
    
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int counter = 0;
        int count1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
            } else {
                count1 = Math.max(count1, counter);
                counter=0;
            }
        }

        count1 = Math.max(count1, counter);

        return count1;
    }

}