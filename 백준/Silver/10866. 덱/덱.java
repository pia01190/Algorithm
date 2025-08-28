import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("push_front")) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            }
            
            if (s.equals("push_back")) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            }

            if (s.equals("pop_front")) {
                if (deque.size() == 0) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.removeFirst()).append('\n');
                }
            }

            if (s.equals("pop_back")) {
                if (deque.size() == 0) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.removeLast()).append('\n');
                }
            }

            if (s.equals("size")) {
                sb.append(deque.size()).append('\n');
            }

            if (s.equals("empty")) {
                if (deque.size() == 0) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            }

            if (s.equals("front")) {
                if (deque.size() == 0) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekFirst()).append('\n');
                }
            }

            if (s.equals("back")) {
                if (deque.size() == 0) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(deque.peekLast()).append('\n');
                }
            }
        }

        System.out.println(sb.toString());
    }
}