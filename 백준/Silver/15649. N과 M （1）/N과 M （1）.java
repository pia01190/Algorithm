import java.io.*;

class Main {

    private static int[] arr;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int number = Integer.parseInt(input[0]);
        int targetDepth = Integer.parseInt(input[1]);

        arr = new int[targetDepth];
        visited = new boolean[number + 1];

        dfs(number, targetDepth, 0);
        System.out.println(sb.toString());
    }

    private static void dfs(int number, int targetDepth, int depth) {
        if (depth == targetDepth) {
            for (int num : arr) {
                sb.append(num).append(' ');
            }

            sb.append('\n');
            return;
        }

        for (int i = 1; i <= number; i++) {
            if (!visited[i]) {
                arr[depth] = i;
                visited[i] = true;
                dfs(number, targetDepth, depth + 1);
                visited[i] = false;
            }
        }
    }
}