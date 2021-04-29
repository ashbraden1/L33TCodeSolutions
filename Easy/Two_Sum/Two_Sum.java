import java.util.Map;
import java.util.HashMap;
public class Two_Sum {
    public int[] twoSumBrute(int[] nums, int target) {
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

    public int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> mapNums = new HashMap<>();
        int[] addends = new int[2];
        int complement;

        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];

            if(mapNums.containsKey(complement)){
                addends[0] = mapNums.get(complement);
                addends[1] = i;
            }
            mapNums.put(nums[i], i);

        }
        return addends;
    }
}