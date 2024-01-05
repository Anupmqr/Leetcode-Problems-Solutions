class Solution {
    public int[][] imageSmoother(int[][] img) {
        int rows = img.length;
        int cols = img[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                int count = 0;

                // Iterate over the neighboring cells
                for (int ni = i - 1; ni <= i + 1; ni++) {
                    for (int nj = j - 1; nj <= j + 1; nj++) {
                        if (ni >= 0 && ni < rows && nj >= 0 && nj < cols) {
                            sum += img[ni][nj];
                            count++;
                        }
                    }
                }

                // Calculate the average and update the result matrix
                result[i][j] = sum / count;
            }
        }

        return result;
    }
}
