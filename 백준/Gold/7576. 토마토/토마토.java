import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] box = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());

                if (box[i][j] == 1) {
                    queue.add(new int[] {i, j, 0});
                }
            }
        }

        System.out.println(bfs(box, queue));
    }

    private static int bfs(int[][] box, Queue<int[]> queue) {
        int rowLength = box.length;
        int colLength = box[0].length;

        int day = 0;
        int totalDay = 0;

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            int row = temp[0];
            int col = temp[1];
            day = temp[2];

            for (int k = 0; k < dx.length; k++) {
                int newRow = row + dx[k];
                int newCol = col + dy[k];

                if (!isMapIn(newRow, newCol, rowLength, colLength)) {
                    continue;
                }

                if (box[newRow][newCol] == 0) {
                    queue.add(new int[] {newRow, newCol, day + 1});
                    box[newRow][newCol] = 1;
                }
            }
        }

        if (!checkedTomato(box, rowLength, colLength)) {
            return -1;
        }

        return Math.max(totalDay, day);
    }

    private static boolean isMapIn(int newRow, int newCol, int rowLength, int colLength) {
        return newRow < rowLength && newRow >= 0 && newCol < colLength && newCol >= 0;
    }

    private static boolean checkedTomato(int[][] box, int rowLength, int colLength) {
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (box[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}