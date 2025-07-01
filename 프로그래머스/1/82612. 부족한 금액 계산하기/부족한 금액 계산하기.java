class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalMoney = 0;
        
        for (int i = 1; i <= count; i++) {
            totalMoney += price * i;
        }
        
        answer = (totalMoney <= money) ? 0 : (totalMoney - money);

        return answer;
    }
}