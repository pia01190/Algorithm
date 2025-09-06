import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        // 걸그룹 정보 저장
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String groupName = br.readLine();
            map.putIfAbsent(groupName, new ArrayList<>());

            int count = Integer.parseInt(br.readLine());
            for (int j = 0; j < count; j++) {
                map.get(groupName).add(br.readLine());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String name = br.readLine();
            int type = Integer.parseInt(br.readLine());

            if (type == 0) {
                List<String> nameList = map.get(name);
                Collections.sort(nameList);
                for (String memberName : nameList) {
                    sb.append(memberName + "\n");
                }
            } else {
                for (String group : map.keySet()) {
                    if (map.get(group).contains(name)) {
                        sb.append(group + "\n");
                        break;
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}