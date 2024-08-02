class Solution {
    public int countSeniors(String[] details) {
        int arr[] = new int[details.length];

        for(int i=0; i<details.length; i++){
            arr[i] = ((details[i].charAt(11)-'0')*10) + (details[i].charAt(12)-'0');
        }

        int ans=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>60) ans++;
        }
        return ans;
    }
}
