import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[2][7];
        int gender = 0;
        int grade = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            gender = Integer.parseInt(st.nextToken());
            grade = Integer.parseInt(st.nextToken());
            arr[gender][grade]++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                count += arr[i][j] / k;
                if (arr[i][j] % k != 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}