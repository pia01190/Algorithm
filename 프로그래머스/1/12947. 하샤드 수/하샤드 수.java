class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;

        String array[] = Integer.toString(x).split("");
        
        for (int i = 0; i < array.length; i++) {
            sum += Integer.parseInt(array[i]);
        }

        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }


        return answer;
    }
}