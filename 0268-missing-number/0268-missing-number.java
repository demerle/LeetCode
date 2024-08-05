class Solution {
    public int missingNumber(int[] nums) {
        int wouldBeTotal = 0;
        int arrayTotal = 0;
        int answer;
        for (int i=1;i<=nums.length;i++){
            wouldBeTotal += i;
        }
        for (int i=0;i<nums.length;i++){
            arrayTotal += nums[i];
        }
        answer = wouldBeTotal-arrayTotal;
        return answer;
    }
}