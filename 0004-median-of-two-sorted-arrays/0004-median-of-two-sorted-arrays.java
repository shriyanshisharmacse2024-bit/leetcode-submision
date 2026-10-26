class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        int k = 0;

        for (int n : nums1) {
            arr[k++] = n;
        }

        for (int n : nums2) {
            arr[k++] = n;
        }

        java.util.Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
}