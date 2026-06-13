class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i: nums) {
            map.merge(i,1,Integer::sum);
        }
        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr, (a, b) -> map.get(b) - map.get(a));
        int[] sol = new int[k];
        int i = 0;
        while (k-- > 0) {
            sol[i] = arr.get(i);
            i++;
        }
        return sol;
    }
}
