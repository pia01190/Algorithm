import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = i;
        }

        int num = 0;
        int count = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            }

            for (int j = i; j < arr.length; j += i) {
                if (arr[j] != 0) {
                    num = arr[j];
                    arr[j] = 0;
                    count++;

                    if (count == k) {
                        System.out.println(num);
                        return;
                    }
                }
            }
        }
    }
}