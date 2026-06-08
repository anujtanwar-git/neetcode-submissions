class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : nums) {
            if (!arr.contains(i)){
                arr.add(i);
            } else {return true;}
        }
        return false;
    }
}