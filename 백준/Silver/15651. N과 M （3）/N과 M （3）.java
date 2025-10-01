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

        dfs(num, targetDepth, 0);
        System.out.println(sb);
    }

    private static void dfs(int num, int targetDepth, int depth) {
        if (depth == targetDepth) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= num; i++) {
            arr[depth] = i;
            dfs(num, targetDepth, depth + 1);
        }
    }
}