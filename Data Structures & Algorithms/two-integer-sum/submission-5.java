class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int n = nums.length;

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for (int i = 0; i < n ; i++){
            int needed = target - nums[i];
            if (mpp.containsKey(needed)) {
                arr[0] = mpp.get(needed);
                arr[1] = i;
                break;
            } else {
                mpp.put(nums[i],i);
            }
        } return arr;

    }
}
