import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        List<double[]> fail = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            int stageCount = 0;
            int failCount = 0;
            
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] >= i) {
                    stageCount++;
                    
                    if (stages[j] == i) {
                        failCount++;
                    }
                }
            }
            
            double failRate = (failCount == 0) ? 0 : (double) failCount / stageCount;
            fail.add(new double[] {i, failRate});
        }
        
        fail.sort((a, b) -> {
            if (a[1] == b[1]) return Double.compare(a[0], b[0]);
            return Double.compare(b[1], a[1]);
        });
        
        int[] result = new int[N];
        for (int i = 0; i < fail.size(); i++) {
            result[i] = (int) fail.get(i)[0];
        }
        
        return result;
    }
}