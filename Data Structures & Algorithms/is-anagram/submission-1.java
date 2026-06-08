class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        TreeMap<Character,Integer> ss = new TreeMap<>();
        TreeMap<Character,Integer> ts = new TreeMap<>();

        for (int i = 0; i<s.length(); i++){
            ss.merge(s.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i<t.length(); i++){
            ts.merge(t.charAt(i), 1, Integer::sum);
        }
        if (ss.equals(ts)) { return true;} else {return false;}
    }
}
