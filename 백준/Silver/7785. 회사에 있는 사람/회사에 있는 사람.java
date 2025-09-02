import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();

            if (log.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }

        }

        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        for (String s : list) {
            System.out.println(s);
        }
    }
}