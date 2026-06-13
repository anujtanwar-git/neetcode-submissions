class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String,List<String>> mpp = new HashMap<>();


        for (String str : strs) { 
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            mpp.putIfAbsent(sorted,new ArrayList<>());
            mpp.get(sorted).add(str);
            
        
            
        }
            return new ArrayList<>(mpp.values());
    }


    // public boolean anagramCheck(String str1, String str2){
    //     if(Arrays.sort(str1.toCharArray()) == Arrays.sort(str2.toCharArray())) return true;
    //     return false;
    // }
}
