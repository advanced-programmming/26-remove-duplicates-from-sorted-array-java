import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] nums = getCases();
        System.out.println(removeDuplicates(nums));
    }

    //in the same structure
    private static Integer removeDuplicates(int[] nums) {
        int aux = 1;

        // Only if the next is different count. because is ordered.
        for (int i = 0; i < (nums.length - 1); i++){
            if(nums[i] != nums[i + 1]){
                nums[aux] = nums[i + 1];
                aux++;
            }
        }

        return aux;
    }

    //Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
    private static Integer removeDuplicates1(int[] nums) {
        return IntStream.of(nums).boxed().distinct().toArray().length;
    }

    private static int[] getCases() {
       return new int[]{1,1,2};
       //return new int[]{0,0,1,1,1,2,2,3,3,4};
    }
}