import java.util.Arrays;
public class Day5Arrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        if(nums[0] == 2 || nums[1] == 3){
            nums[1] = 0;
            System.out.println(true);
        } else if(nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
