
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
       // return 0;

       int max1 = Integer.MIN_VALUE;
    int max2 = Integer.MIN_VALUE;
    int countMax1 = 0;
    
    for (Integer num : nums) {
        if (num > max1) {
            
            max2 = max1;
            max1 = num;
            countMax1 = 1;
        } else if (num == max1) {
            
            countMax1++;
        } else if (num > max2) {
            
            max2 = num;
        }
    }
    
   
    if (countMax1 >= 2) {
        return max1 + max1;
    } else {
        return max1 + max2;
    }
    }
}