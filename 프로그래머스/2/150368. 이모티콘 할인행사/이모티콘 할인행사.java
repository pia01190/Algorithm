class Solution {
    public int[] solution(int[][] users, int[] emoticons) {
        int[] discount = {10, 20, 30, 40};
        int[] emoticonDiscount = new int[emoticons.length];
        
        return dfs(discount, emoticonDiscount, users, emoticons, 0);
    }
    
    private static int[] dfs(int[] discount, int[] emoticonDiscount, int[][] users, int[] emoticons, int count) {
        if (count == emoticons.length) {
            int joinCount = 0; // 이모티콘 플러스 서비스 가입 수
            int totalPrice = 0; //  이모티콘 매출액
            
            for (int i = 0; i < users.length; i++) {
                int minRate = users[i][0];
                int money = users[i][1];
                int price = 0;

                for (int j = 0; j < emoticons.length; j++) {
                    if (emoticonDiscount[j] >= minRate) {
                        price += emoticons[j] * (100 - emoticonDiscount[j]) / 100;
                    }
                }

                if (price >= money) {
                    joinCount++;
                } else {
                    totalPrice += price;
                }
            }

            return new int[] {joinCount, totalPrice};
        }

        int[] answer = {0, 0};
        for (int rate : discount) {
            emoticonDiscount[count] = rate;
            int[] result = dfs(discount, emoticonDiscount, users, emoticons, count + 1);
            answer = max(answer, result);
        }

        return answer;
    }
    
    private static int[] max(int[] answer, int[] result) {
        if (result[0] > answer[0]) {
            return result;
        } else if (answer[0] == result[0] && result[1] > answer[1]) {
            return result;
        }
        
        return answer;
    }
}