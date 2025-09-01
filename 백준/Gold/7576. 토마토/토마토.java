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

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            int row = temp[0];
            int col = temp[1];
            day = temp[2];

            for (int k = 0; k < dx.length; k++) {
                int nextRow = row + dx[k];
                int nextCol = col + dy[k];

                if (!isMapIn(nextRow, nextCol, rowLength, colLength)) {
                    continue;
                }

                if (box[nextRow][nextCol] == 0) {
                    queue.add(new int[]{nextRow, nextCol, day + 1});
                    box[nextRow][nextCol] = 1;
                }
            }
        }

        if (checkTomato(box, rowLength, colLength)) {
            return -1;
        }

        int maxDay = 0;
        return Math.max(maxDay, day);
    }

    private static boolean isMapIn(int row, int col, int rowLength, int colLength) {
        return row >= 0 && row < rowLength && col >= 0 && col < colLength;
    }

    private static boolean checkTomato(int[][] box, int rowLength, int colLength) {
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if(box[i][j] == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}