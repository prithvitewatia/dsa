package dev.prithvis.solutions;

public class P26 {
    public int removeDuplicates(int[] nums){
        int count=0;
        for(int i=1; i<nums.length;i++){
            if(nums[i]!=nums[count]){
                nums[count+1]=nums[i];
                count++;
            }
        }
        return count;
    }
}
