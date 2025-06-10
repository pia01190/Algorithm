class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] array = quiz[i].split(" ");
            if (array[1].equals("+")) {
                if (Integer.parseInt(array[0]) + Integer.parseInt(array[2]) == Integer.parseInt(array[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (array[1].equals("-")) {
                if (Integer.parseInt(array[0]) - Integer.parseInt(array[2]) == Integer.parseInt(array[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}