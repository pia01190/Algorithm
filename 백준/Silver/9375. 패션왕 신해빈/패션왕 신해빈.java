import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int testCase = Integer.parseInt(st.nextToken());

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                String wear = st.nextToken();
                String kind = st.nextToken();

                map.put(kind, map.getOrDefault(kind, 1) + 1);
            }

            int answer = 1;
            for (int count : map.values()) {
                answer *= count;
            }

            System.out.println(answer - 1);
        }
    }
}