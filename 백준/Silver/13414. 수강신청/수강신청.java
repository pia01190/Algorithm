import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        LinkedHashSet<String> students = new LinkedHashSet<>();

        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
            String studentNum = st.nextToken();
            
            if (students.contains(studentNum)) {
                students.remove(studentNum);
            }

            students.add(studentNum);
        }

        List<String> list = new ArrayList<>(students);
        int limit = Math.min(k, list.size());

        for (int i = 0; i < limit; i++) {
            System.out.println(list.get(i));
        }
    }
}