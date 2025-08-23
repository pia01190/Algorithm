import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine(); 
        int m = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        ListIterator<Character> cursor = list.listIterator(list.size());

        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            char option = line.charAt(0);

            if (option == 'L') {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                }
            } else if (option == 'D') {
                if (cursor.hasNext()) {
                    cursor.next();
                }
            } else if (option == 'B') {
                if (cursor.hasPrevious()) {
                    cursor.previous();
                    cursor.remove();
                }
            } else if (option == 'P') {
                cursor.add(line.charAt(2));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}