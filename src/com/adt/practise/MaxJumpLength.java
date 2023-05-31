package com.adt.practise;

public class MaxJumpLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] nums = { 2, 3, 1, 1, 4, 1, 4, 6, 0 };
		//int[] nums = {0};
		//int[] nums = {2,0};
		
		int[] nums = {0,2,0,1,1,2,5,0};
		boolean lastIndexReached = MaxJumpLength.max_jump(nums);
		System.out.println(lastIndexReached);
	}

	private static boolean max_jump(int[] nums) {

		if (nums == null || nums.length < 0) {
			return false;
		}
		if (nums.length == 1) {
			if (nums[0] == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			// { 2, 3, 1, 1, 4 }; ///5
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 0) {
					return false;

				} else {
					int j = nums[i];
					i = i + j;

					if (i > nums.length) {
						return false;
					} else if (i == nums.length - 1) {
						return true;
					}
				}
				--i;
			}
		}
		return false;
	}

}
