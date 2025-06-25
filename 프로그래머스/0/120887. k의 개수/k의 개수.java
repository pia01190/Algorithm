class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            if (Integer.toString(a).contains(Integer.toString(k))) {
                String[] arr = Integer.toString(a).split("");
                
                for (int z = 0; z < arr.length; z++) {
                    if (arr[z].equals(Integer.toString(k))) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}