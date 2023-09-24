class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 5로 나눴을때 나머지가 0이 아니면? -> hp가 남는다면? 
        if(hp % 5 != 0) { // 장군
            answer += hp/5; // hp를 5로 나눈 값
            hp = hp % 5; // hp는 5로 나눈 값의 나머지
            System.out.println(hp +" 지금 내 피는 이정도야1");
            
            // 5로 나누고 또 hp가 남았다면 3으로 나누기
            if(hp % 3 != 0) { // 병졍
                answer += hp/3; // hp를 3으로 나눈 값
                hp = hp % 3; // hp는 3으로 나눈 값의 나머지
                System.out.println(hp +" 지금 내 피는 이정도야2");
                
                // 그러고도 남으면 1로 다시 한 번
                if(hp % 1 != 0) { // 일개미
                    answer += hp/1;
                    hp = hp % 1;
                    System.out.println(hp +" 지금 내 피는 이정도야3");
                } else { // 1로 나눠진다면 hp는 0으로
                    answer += hp/1;
                    hp = 0;
                    System.out.println(hp +" 지금 내 피는 이정도야4");
                }
            } else { // 3으로 나눠진다면 hp는 0으로 끝
                answer += hp/3;
                hp = 0;
                System.out.println(hp +" 지금 내 피는 이정도야5");
            }
        } else { // 5로 나눠진다면 hp는 0으로 끝
            answer += hp/5;
            hp = 0;
            System.out.println(hp +" 지금 내 피는 이정도야6");
        }
        return answer;
    }
}