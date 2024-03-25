class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[nums.length+1];
        for(int x : nums){
            arr[x]++;
        }

        for(int i=1; i<=nums.length; i++){
            if(arr[i]==2)
                res.add(i);
        }
        return res;
    }
}
