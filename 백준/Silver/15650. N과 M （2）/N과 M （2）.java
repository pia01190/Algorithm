import java.io.*;

class Main {

    private static int number, targetDepth;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        number = Integer.parseInt(input[0]);
        targetDepth = Integer.parseInt(input[1]);

        arr = new int[targetDepth];

        dfs(1, 0);
        System.out.println(sb.toString());
    }

    private static void dfs(int num, int depth) {
        if (depth == targetDepth) {
            for (int i : arr) {
                sb.append(i).append(' ');
            }

            sb.append('\n');
            return;
        }

        for (int i = num; i <= number; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}