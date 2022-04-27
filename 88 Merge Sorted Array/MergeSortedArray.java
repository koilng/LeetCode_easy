import java.util.Arrays;

public class MergeSortedArray {

  public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0};
    int[] nums2 = {2,5,6};
    merge(nums1, 3, nums2, 3);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int i = m; i < nums1.length; i++) {
      nums1[i] = nums2[i - m];
    }
    for (int j = 0; j < m; j++) {
      for (int i = 0; i < nums1.length - 1; i++) {
        if (nums1[i] > nums1[i + 1]) {
          nums1[i] += nums1[i + 1];
          nums1[i + 1] = nums1[i] - nums1[i + 1];
          nums1[i] -= nums1[i + 1];
        }
      }
    }
    System.out.println(Arrays.toString(nums1));
  }
}
