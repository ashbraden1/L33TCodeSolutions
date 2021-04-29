public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] addends = {0,1};
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(target - nums[j] == nums[i]){
                    addends[0] = i;
                    addends[1] = j;
                }
            }
        }
        return addends;
    }
}