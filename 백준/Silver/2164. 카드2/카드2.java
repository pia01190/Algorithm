import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            que.offer(i);
        }

        while(que.size() > 1) {
            que.poll();
            que.offer(que.poll());
        }

        System.out.println(que.peek());
    }
}