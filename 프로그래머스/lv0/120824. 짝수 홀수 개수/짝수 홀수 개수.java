class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int one = 0;
        int two = 0;
        for(int i = 0;  i <= num_list.length-1; i++) {
            if(num_list[i] % 2 == 0) {
                System.out.println(num_list[i]);
                one++;
            } else{
                two++;
            }
        }
        answer[0] = one;
        answer[1] = two;
        return answer;
    }
}