import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j) - '0';
            }
        }

        System.out.println(bfs(0, 0, board));
    }

    private static int bfs(int startRow, int startCol, int[][] board) {
        int rowLength = board.length;
        int colLength = board[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rowLength][colLength];

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;

        while(!queue.isEmpty()) {
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            int dist = temp[2];
            board[x][y] = dist;

            for (int k = 0; k < dx.length; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                
                if (!isMapIn(nx, ny, rowLength, colLength)) {
                    continue;
                }

                if (board[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.add(new int[]{nx, ny, dist + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        return board[rowLength - 1][colLength - 1];
    }

    private static boolean isMapIn(int row, int col, int rowLength, int colLength) {
        return row >= 0 && row < rowLength && col >= 0 && col < colLength;
    }
}