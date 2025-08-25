import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] stack = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            
            if (s.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                stack[size] = x;
                size++;
            } else if (s.equals("pop")) {
                if (size > 0) {
                    System.out.println(stack[size - 1]);
                    size--;
                } else {
                    System.out.println(-1);
                }
            } else if (s.equals("size")) {
                System.out.println(size);
            } else if (s.equals("empty")) {
                if (size > 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else if (s.equals("top")) {
                if (size > 0) {
                    System.out.println(stack[size - 1]);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}