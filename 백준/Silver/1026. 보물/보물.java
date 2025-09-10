import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Integer[] aArray = new Integer[n];
        Integer[] bArray = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            aArray[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            bArray[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(aArray);
        Arrays.sort(bArray, Collections.reverseOrder());

        int min = 0;
        for (int i = 0; i < n; i++) {
            min += aArray[i] * bArray[i];
        }

        System.out.println(min);
    }
}