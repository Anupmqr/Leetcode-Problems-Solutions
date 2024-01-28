class Solution {
    public int subarraySum(int[] arr, int target){
        int sum = 0;
        int ans = 0;
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(sum == target)
                ans++;
            
            if(mp.containsKey(sum-target)){
                ans += mp.get(sum-target);
            }

            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int count = 0;
        for(int i=0; i<matrix.length; i++){
            int[] arr = new int[matrix[0].length];

            for(int j=i; j<matrix.length; j++){
                for(int k=0; k<matrix[0].length; k++){
                    arr[k] += matrix[j][k];
                }
            count += subarraySum(arr, target);
            }
        }
        return count;
    }
}
