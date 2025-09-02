import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> names = new HashMap<>();
        Map<Integer, String> numbers = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            names.put(name, i);
            numbers.put(i, name);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.charAt(0) - 'A' >= 0) {
                System.out.println(names.get(s));
            } else {
                int num = Integer.parseInt(s);
                System.out.println(numbers.get(num));
            }
        }
    }
}