class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = 2*n;
        int[] result = new int[size];

        int[] front = new int[n];
        int[] back = new int[n];

        //map the halves
        for (int i = 0; i<n; i++) {
            front[i] = nums[i];
            back[i] = nums[n+i];
        }

        //combine into result
        for (int i = 0; i < n; i++) {
            result[2*i] = front[i];
            result[(2*i)+1] = back[i];
        }

        return result;
    }
}