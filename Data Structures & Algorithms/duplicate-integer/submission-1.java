class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for (int i : nums) {
            if (!arr.contains(i)){
                arr.add(i);
            } else {return true;}
        }
        return false;
    }
}