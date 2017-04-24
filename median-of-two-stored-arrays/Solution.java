import java.util.*;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //TODO           
        int nums1Len = nums1.size();
        int nums2Len = nums2.size();
        int minIndex = nums1Len < nums2Len ? nums1Len : nums2Len;
        int [] result = [nums1Len + nums2Len];
        int i = 0, j = 0, k = 0;

        while(i < minIndex && j < minIndex) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums1[j++];
            }
        }

        if (i < nums1Len - 1) {
            result.concat(Arrays.copyOfRange(nums1, i, nums1Len - 1));
        }

        if (j < nums2Len - 1) {
            result.concat(Arrays.copyOfRange(nums2, j, nums2Len - 1));
        } 

    }
}
