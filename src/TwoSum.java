import java.util.Arrays;

public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Arrays.sort(nums);
		int s = 0, e = nums.length - 1;
		while (s > e) {
			int sum = nums[s] + nums[e];
			if (sum == target) {
				result[0] = s;
				result[1] = e;
				break;
			} else if (sum < target) {
				s++;
			}  else if (sum > target)  {
				e--;
			}else {
				return new int[] {-1,-1};
			}
		}
		return result;
	}
		

	public static void main(String[] args) {
		int a[] = { 2, 7, 11, 15 };
		int x[]= twoSum(a, 9);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
