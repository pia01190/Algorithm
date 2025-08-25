import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] stack = new int[k];
        int size = 0;
        int answer = 0;

        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n != 0) {
                stack[size++] = n;
            } else {
                size--;
            }
        }

        for (int i = 0; i < size; i++) {
            answer += stack[i];
        }

        System.out.println(answer);
    }
}