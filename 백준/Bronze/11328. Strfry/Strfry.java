import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            int[] first = new int[26];
            int[] second = new int[26];

            for (int j = 0; j < a.length(); j++) {
                first[a.charAt(j) - 'a']++;
            }

            for (int j = 0; j < b.length(); j++) {
                second[b.charAt(j) - 'a']++;
            }

            boolean same = true;
            for (int j = 0; j < first.length; j++) {
                if (first[j] != second[j]) {
                    same = false;
                    break;
                }
            }

            System.out.println(same ? "Possible" : "Impossible");
        }
    }
}