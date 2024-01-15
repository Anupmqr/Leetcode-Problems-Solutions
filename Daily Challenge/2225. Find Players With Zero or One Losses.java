class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] loss = new int[100001];
        int w, l;
        for(int i=0; i<matches.length; i++){
            w = matches[i][0];
            l = matches[i][1];

            if(loss[w] == 0)
                loss[w] = -1;

            if(loss[l]==-1)
                loss[l] = 1;
            else
                loss[l]++;
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        for(int i=0; i<loss.length; i++){
            if(loss[i] == -1)
                zeroLoss.add(i);
            else if(loss[i] == 1)
                oneLoss.add(i);
        }

        List<List<Integer>> ans = new ArrayList<>();

        ans.add(zeroLoss);
        ans.add(oneLoss);

        return ans;
    }
}
