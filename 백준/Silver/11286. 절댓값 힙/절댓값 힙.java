import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                if (a[0] == b[0]) return Integer.compare(a[1], b[1]);
                return Integer.compare(a[0], b[0]);
            }
        );

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0 && !pq.isEmpty()) {
                int[] min = pq.poll();
                sb.append(min[1]).append('\n');
            } else if(num == 0) {
                sb.append(0).append('\n');
            } else {
                pq.add(new int[] {Math.abs(num), num});
            }
        }

        System.out.println(sb);
    }
}