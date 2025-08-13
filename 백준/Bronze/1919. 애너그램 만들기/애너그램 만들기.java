import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int[] first = new int[26];
        int[] second = new int[26];
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            first[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            second[b.charAt(i) - 'a']++;
        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] > second[i]) {
                count += first[i] - second[i];
            } else if (first[i] < second[i]) {
                count += second[i] - first[i];
            }
        }

        System.out.println(count);
    }
}