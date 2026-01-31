public class Main {
    public static void main(String[] args) {
        twoSum(new int[]{4,2,6,11,7,15}, 9);
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length - 1; i++) {
            for(int j=i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    System.out.println("[" + nums[i] + "," + nums[j] + "]");
                    break;
            }
        }
    }
        return nums;
    }
}