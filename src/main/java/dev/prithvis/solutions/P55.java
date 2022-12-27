package dev.prithvis.solutions;

import java.util.Arrays;

public class P55 {
    private SolutionState[] jumpState;
    private void canJumpUtil(int[] nums,int index){
        if(nums[index]==0){
            jumpState[index]=SolutionState.NO;
            return;
        }
        int remainingLength=nums.length-1-index;
        if(nums[index] >= remainingLength){
            jumpState[index]=SolutionState.YES;
            return;
        }
        for(int i=1;i<=nums[index];i++){
            if(jumpState[index+i]==SolutionState.UNSOLVED){
                canJumpUtil(nums,index+i);
            }
            if(jumpState[index+i]==SolutionState.YES){
                jumpState[index]=SolutionState.YES;
                return;
            }
        }
        jumpState[index]=SolutionState.NO;
    }
    public boolean canJump(int[] nums){
        jumpState=new SolutionState[nums.length];
        Arrays.fill(jumpState,SolutionState.UNSOLVED);
        canJumpUtil(nums, 0);
        return jumpState[0]==SolutionState.YES;
    }
}

enum SolutionState{
    UNSOLVED, YES, NO
}
