class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxsum=0;
        double windowavg=0;
        for(int i=0;i<k;i++)
        {
            windowavg+=nums[i];
        }
            maxsum=windowavg;
        for(int i=k;i<nums.length;i++)
        {
            windowavg+=nums[i]-nums[i-k];
            maxsum=Math.max(windowavg,maxsum);
        }
        return maxsum/k;
    }
}