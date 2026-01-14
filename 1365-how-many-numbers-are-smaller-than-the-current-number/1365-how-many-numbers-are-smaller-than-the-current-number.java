class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer;

        for (i=0; i< nums.length; nums++) {
            int counter = 0;
            for (j=0;j<nums.length;j++) {
                if (nums[j] < nums[i]) {
                    counter++;
                }
            }
            answer[i] = counter;
        }

    }
}