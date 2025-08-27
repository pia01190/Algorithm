import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        
        Queue<Integer> que = new LinkedList<>();
        int last = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("push")) {
                last = Integer.parseInt(st.nextToken());
                que.offer(last);
            }
            
            if (s.equals("pop")) {
                if (que.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(que.poll()).append('\n');
                }
            }
            
            if (s.equals("size")) {
                sb.append(que.size()).append('\n');
            }
            
            if (s.equals("empty")) {
                if (que.isEmpty()) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            }
            
            if (s.equals("front")) {
                if (que.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(que.peek()).append('\n');
                }
            }
            
            if (s.equals("back")) {
                if (que.isEmpty()) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(last).append('\n');
                }
            }
        }

        System.out.println(sb.toString());
    }
}