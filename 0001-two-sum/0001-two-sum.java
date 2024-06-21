class Solution {
    public int[] twoSum(int[] nums, int target) {
        int currentNum;
        int insideNum;
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            currentNum = nums[i];
            for (int i2 = 0; i2 < nums.length; i2++) {
                insideNum = nums[i2];

                if (i2 == i) {
                    continue;
                }
                else if (insideNum + currentNum == target) {
                    if (i > i2) {
                        answer = new int[] {i2, i};
                    }   else {
                        answer = new int[] {i, i2};
                        }
                    }
                else {
                    continue;
                }

                }
            }
        return answer;
        }
    }