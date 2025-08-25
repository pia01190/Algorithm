import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int index = 0;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        System.out.print("<");

        while (!list.isEmpty()) {
            index = (index + (k - 1)) % list.size();
            System.out.print(list.remove(index));

            if (!list.isEmpty()) {
                System.out.print(", ");
            }
        }

        System.out.print(">");
    }
}