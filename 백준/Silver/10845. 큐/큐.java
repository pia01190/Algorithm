import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        
        int[] array = new int[n];
        int head = 0;
        int tail = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("push")) {
                array[tail++] = Integer.parseInt(st.nextToken());
            }
            
            if (s.equals("pop")) {
                if (tail - head == 0) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(array[head]).append('\n');
                    head++;
                }
            }
            
            if (s.equals("size")) {
                sb.append(tail - head).append('\n');
            }
            
            if (s.equals("empty")) {
                if (tail - head == 0) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            }
            
            if (s.equals("front")) {
                if (tail - head == 0) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(array[head]).append('\n');
                }
            }
            
            if (s.equals("back")) {
                if (tail - head == 0) {
                    sb.append(-1).append('\n');
                } else {
                    sb.append(array[tail - 1]).append('\n');
                }
            }
        }

        System.out.println(sb.toString());
    }
}