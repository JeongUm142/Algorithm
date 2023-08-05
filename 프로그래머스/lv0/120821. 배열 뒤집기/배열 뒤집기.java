class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0; i < num_list.length; i++){
            answer[i]=num_list[num_list.length -i -1]; // i의 마지막위치 숫자부터 하나씩
        }
        return answer;
    }
}