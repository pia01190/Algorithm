import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] numbers = new int[10];
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) - '0') == 9) {
                numbers[6]++;
            } else {
                numbers[str.charAt(i) - '0']++;
            }
        }

        numbers[6] = (numbers[6] / 2) + (numbers[6] % 2);

        for (int i : numbers) {
            answer = Math.max(answer, i);
        }

        System.out.println(answer);
    }
}