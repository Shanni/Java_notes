public class Solution {
    public int maxArea(int[] height) {
        int lo=0, hi=height.length-1;
        int max=0, water=0;
        while(lo<hi){
            int level=Math.min(height[lo],height[hi]);
            water=(hi-lo)*(level);
            max=Math.max(water,max);
            while(lo<hi && height[lo]<=level)
                lo++;
            while(hi>lo && height[hi]<=level)
                hi--;
        }
        return max;
    }
}
