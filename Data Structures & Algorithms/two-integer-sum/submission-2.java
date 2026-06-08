class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        int n = nums.length;

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for (int i = n-1; i >=0 ; i--){
            int needed = target - nums[i];
            if (mpp.containsKey(needed)) {
                arr[1] = mpp.get(needed);
                arr[0] = i;
                break;
            } else {
                mpp.put(nums[i],i);
            }
        } return arr;

    }
}
