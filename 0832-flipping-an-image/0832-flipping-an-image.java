class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row : image) {
            int start = 0;
            int end = n - 1;
            while (start <= end) {
                // Swap elements and invert them at the same time using XOR 1
                int temp = row[start];
                row[start] = row[end] ^ 1;
                row[end] = temp ^ 1;
                start++;
                end--;
            }
        }
        return image;
    }
}
