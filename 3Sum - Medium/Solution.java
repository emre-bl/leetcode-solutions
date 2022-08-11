class Solution {
    static boolean isNotIn(List<List<Integer>> main, int i1, int i2, int i3) {

        for(List<Integer> l: main) {
            ArrayList<Integer> tl = new ArrayList<Integer>();
            for(Integer i: l) tl.add(i);

            if(tl.indexOf(i1) != -1) {
                tl.remove(tl.indexOf(i1));
                if(tl.indexOf(i2) != -1) {
                    tl.remove(tl.indexOf(i2));
                    if(tl.indexOf(i3) != -1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> n = new ArrayList<>();

        for(int i : nums) n.add(Integer.valueOf(i));

        List<List<Integer>> ret = new ArrayList<List<Integer>>();

        for(int i = 0; i < n.size(); i++) {
            for(int j = i+1; j < n.size(); j++) {
                
                int need = -(n.get(i)+n.get(j));

                if(n.lastIndexOf(need) > j) {
                    List<Integer> al = new ArrayList<Integer>();
                    al.add(n.get(i)); al.add(n.get(j)); al.add(need);
                    if(isNotIn(ret,n.get(i), n.get(j), need)) ret.add(al);
                }
            }
        }
        return ret;
    }
}