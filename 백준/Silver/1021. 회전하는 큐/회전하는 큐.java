import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        LinkedList<Integer> deque = new LinkedList<>();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            deque.addLast(i);
        }

        for (int i = 0; i < m; i++) {
            int k = Integer.parseInt(st.nextToken());

            if (deque.indexOf(k) > deque.size() / 2) {
                while(deque.peekFirst() != k) {
                    deque.addFirst(deque.removeLast());
                    count++;
                }
            } else {
                while(deque.peekFirst() != k) {
                    deque.addLast(deque.removeFirst());
                    count++;
                }
            }

            deque.removeFirst();
        }

        System.out.println(count);
    }
}