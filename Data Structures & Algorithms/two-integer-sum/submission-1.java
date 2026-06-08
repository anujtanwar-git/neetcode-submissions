class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = {-1,-1};

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            mpp.put(nums[i],i);
        }
        for (int i = 0; i< nums.length; i++){
            if (mpp.keySet().contains(target-nums[i]) && mpp.get(target-nums[i])!= i){
                arr[0] = i;
                arr[1] = mpp.get(target-nums[i]);
                return arr;
            }
        }
        return arr;

    }
}
