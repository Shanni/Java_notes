
public class Solution {
    public int removeElement(int[] nums, int val) {
        int shift=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==val){
                shift++;
            }else{
                nums[i-shift]=nums[i];
            }
        }
         int len=nums.length;
        // while(shift>0){
        //     nums[len-shift]=0;
        // }
        return len-shift;
    }
}
