import java.util.Scanner;

class Solution{

// Method to find the single number using XOR
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR operation
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();

        if(n<=0){
            System.out.println("Array must contain atleast one element.");
            scanner.close();
            return;
        }
        
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        Solution solution = new Solution();
        int singleNumber = solution.singleNumber(nums);
        
        System.out.println("The single number is: " + singleNumber);
        
        scanner.close();
    }
}
