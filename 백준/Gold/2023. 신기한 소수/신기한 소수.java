import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int targetDepth = Integer.parseInt(br.readLine()); // 자리수
        int depth = 0; // 현재 자리수
        int num = 0; // 현재 숫자

        StringBuilder sb = new StringBuilder();
        dfs(depth, targetDepth, num, sb);

        System.out.println(sb);
    }

    private static void dfs(int depth, int targetDepth, int num, StringBuilder sb) {
        if (depth == targetDepth) {
            sb.append(num).append('\n');
            return;
        }

        for (int i = depth == 0 ? 2 : 0; i < 10; i++) {
            int next = num * 10 + i;

            if (isPrime(next)) {
                dfs(depth + 1, targetDepth, next, sb);
            }
        }
    }

    private static boolean isPrime(int next) {
        for (int i = 2; i <= (int) Math.sqrt(next); i++) {
            if (next % i == 0) {
                return false;
            }
        }

        return true;
    }
}