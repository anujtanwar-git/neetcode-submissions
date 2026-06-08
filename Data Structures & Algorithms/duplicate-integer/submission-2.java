class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for (int i : nums) {
            if (arr.contains(i)){
                return true;
            } else {arr.add(i);}
        }
        return false;
    }
}