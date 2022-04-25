public class MaximumSubarray {

  public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));
  }

  public static int maxSubArray(int[] nums) {
    int max = 0;
    int maxBuf = nums[0];

    for (int num : nums) {
      max += num;
      if (max < num) {
        max = num;
      }
      maxBuf = Math.max(maxBuf, max);
    }
    return maxBuf;
  }
}
