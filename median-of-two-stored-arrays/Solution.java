import java.util.*;

public class Solution {
    private double getMedianFromArray(int[] nums) {
        int mid = nums.length / 2;
        if (nums.length % 2 == 0) {
            return (nums[mid - 1] + nums[mid]) / 2.0;
        } else {
            return nums[mid];
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //TODO           
        int nums1Len = nums1.length;
        int nums2Len = nums2.length;
        
        if (nums1Len == 0) {
            return getMedianFromArray(nums2);
        }

        if (nums2Len == 0) {
            return getMedianFromArray(nums1);
        }

        double [] result = new double [nums1Len + nums2Len];
        int i = 0, j = 0, k = 0;

        while(i < nums1Len && j < nums2Len) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < nums1Len) {
            result[k++] = nums1[i++];    
        }

        while (j < nums2Len) {
            result[k++] = nums2[j++];    
        }
        
        double median = 0;
        int mid = result.length / 2;
        if (result.length % 2 == 0) {
            median = (result[mid - 1] + result[mid]) / 2.0;
        } else {
            median = result[mid];
        }

        return median;
    }

    public static void main(String args[]) {
        Solution so = new Solution();
        int [] nums1 = {2, 3};
        int [] nums2 = {};
        //so.findMedianSortedArrays(nums1, nums2);
        System.out.println(so.findMedianSortedArrays(nums1, nums2));
    }
}
