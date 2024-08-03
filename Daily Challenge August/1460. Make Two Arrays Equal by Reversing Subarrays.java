// T.C -> O(NLogN):
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i=0; i<target.length; i++){
            if(target[i] != arr[i])
                return false;
        }

        return true;
    }
}

// T.C -> O(N):
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int []help = new int[1001];
        int n = target.length;
        for(int i = 0; i < n; i++){
            help[target[i]]++;
            help[arr[i]]--;
        }
        
        for(int i = 0; i < 1001; i++)
            if(help[i] != 0)
                return false;
        return true;
    }
}
