class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String overwrite1 = my_string.substring(0, s);
        String overwrite2 = my_string.substring(s+overwrite_string.length()); 
 
        answer = overwrite1 + overwrite_string + overwrite2;
        return answer;
    }
}