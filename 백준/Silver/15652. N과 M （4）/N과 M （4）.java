import java.io.*;

class Main {

    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int targetDepth = Integer.parseInt(input[1]);
        arr = new int[targetDepth];

        dfs(num, targetDepth, 0, 1);
        System.out.println(sb);
    }

    private static void dfs(int num, int targetDepth, int depth, int location) {
        if (depth == targetDepth) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }

            sb.append('\n');
            return;
        }

        for (int i = location; i <= num; i++) {
            arr[depth] = i;
            dfs(num, targetDepth, depth + 1, i);
        }
    }
}