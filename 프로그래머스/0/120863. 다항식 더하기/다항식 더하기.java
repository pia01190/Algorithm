class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String array[] = polynomial.split(" +");
        int strNum = 0;
        int num = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("x")) {
                strNum += 1;
            } else if (array[i].contains("x")) {
                strNum += Integer.parseInt(array[i].substring(0, array[i].length() - 1));
            } else if (!array[i].equals("+")) {
                num += Integer.parseInt(array[i]);
            }
        }
        
        if (strNum != 0 && num == 0) {
            answer += (strNum == 1) ? "x" : strNum + "x";
        } else if (strNum != 0 && num != 0) {
            answer += (strNum == 1) ? "x + " + num : strNum + "x + " + num;
        } else {
            answer += num;
        }
        
        return answer;
    }
}