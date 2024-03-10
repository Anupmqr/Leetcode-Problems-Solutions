class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        int i=0;
        for(int n1 : nums1){
            temp[n1] = 1;
        }

        int k=0;
        for(int n2: nums2){
            if(temp[n2]==1){
                temp[n2] = 2;
                k++;
            } 
        }

        int[] result =new  int[k];
        for(int x : nums2){
            if(temp[x] == 2){
                result[i++] = x;
                temp[x]=1;
            }
        }
        return result;
    }
}
