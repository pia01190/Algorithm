import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int top = 0;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int index = Integer.parseInt(br.readLine());
            if (index > top) {
                for (int j = top + 1; j <= index; j++) {
                    sb.append("+\n");
                    stack.push(j);
                }
                top = index;
            }
            
            if (stack.peek() != index) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb.toString());
    }
}