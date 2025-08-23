import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> cursor = list.listIterator();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '<') {
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                } else if (s.charAt(j) == '>') {
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                } else if (s.charAt(j) == '-') {
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                } else {
                    cursor.add(s.charAt(j));
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c : list) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}