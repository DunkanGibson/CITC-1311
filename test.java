public class test {
    public static void main(String[] args) {


        int[] nums = new int[] {1, 2, 3, 7};
        int previous = nums[0];
        int[] array = new int[2];
        int target = 5;

        for(int i = nums[0]; i < nums.length - 1; i++){
            
            if(nums[i] + previous == target){
                array[0] = nums[i - 1];
                array[1] = nums[i]; 
                break;
            }

          previous = nums[i]; 
     
            
        }

        System.out.println(array);
    }
}



