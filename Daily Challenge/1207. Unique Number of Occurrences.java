class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> occurrences = new HashSet<>();

        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (!occurrences.add(count)) {
                    return false;
                }
                count = 1;
            }
        }
        return occurrences.add(count);
    }
};
