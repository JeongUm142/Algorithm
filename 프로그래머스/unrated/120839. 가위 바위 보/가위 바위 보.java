class Solution {
    public String solution(String rsp) {
        String answer = "";
        int rock = 0;
        int scissors = 2;
        int paper = 5;
        String[] rsps = rsp.split("");
        for(int i = 0; i < rsp.length(); i++) {
            System.out.println(rsp);
            if(rsps[i].equals("0")) {
                answer += 5;
            } else if(rsps[i].equals("2")) {
                answer += 0;
            } else if(rsps[i].equals("5")) {
                answer += 2;
            }
        }
        return answer;
    }
}