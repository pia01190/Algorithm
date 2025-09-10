import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Integer[] rope = new Integer[n];

        for (int i = 0; i < n; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope, Collections.reverseOrder());

        int max = 0;
        for (int k = 0; k < n; k++) {
            max = Math.max(max, rope[k] * (k + 1));
        }

        System.out.println(max);
    }
}