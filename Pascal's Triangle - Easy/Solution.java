import java.util.*;
class Solution {

    static List<List<Integer>> generate(int numRows) {
        int len = 1;

        List<List<Integer>> ret = new ArrayList<>();

        List<Integer> last = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {
            List<Integer> step = new ArrayList<>();

            for (int m = 0; m < len; m++) {
                step.add(1);
            }

            for(int j = 1; j < len-1 ; j++) {
                int t1 = last.get(j);
                int t2 = last.get(j-1);

                step.set(j,t1+t2);
            }

            ret.add(step);

            last = new ArrayList<>(step);

            len+=1;
        }

        return ret;
    }
    
}