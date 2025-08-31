import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        int[][] visited = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        int count = 0;
        int maxWidth = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1 && visited[i][j] == 0) {
                    count++;
                    visited[i][j] = 1;
                    int width = 0;
                    queue.add(new int[]{i, j});

                    while(!queue.isEmpty()) {
                        int[] temp = queue.poll();
                        int x = temp[0];
                        int y = temp[1];
                        width++;

                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];

                            if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                                continue;
                            }

                            if (board[nx][ny] == 1 && visited[nx][ny] == 0) {
                                queue.add(new int[]{nx, ny});
                                visited[nx][ny] = 1;
                            }
                        }
                    }

                    maxWidth = Math.max(maxWidth, width);
                }
            }
        }

        System.out.println(count);
        System.out.println(maxWidth);
    }
}