import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<int[]> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            int index = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty()) {
                if (stack.peek()[1] > index) {
                    sb.append(stack.peek()[0] + " ");
                    break;
                }
                stack.pop();
            }
            
            if (stack.isEmpty()) {
                sb.append(0 + " ");
            }

            stack.push(new int[]{i, index});
        }

        System.out.println(sb.toString());
    }
}