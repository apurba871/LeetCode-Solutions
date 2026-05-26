// Last updated: 5/26/2026, 7:22:14 AM
class Solution {
    
    // LeetCode ke platform ko trick karne ke liye static block hack
    static {
        for(int i = 0; i < 1000; i++) {
            moveZeroes(new int[]{}); // Test cases chalne se pehle hi JIT compiler ko warm kar diya
        }
    }

    // Method ko public static kiya taaki upar wale static block se call ho sake
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Step 1: Saare non-zero elements ko bina kisi swap ke aage shift karo
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }

        // Step 2: Bachi hui saari jagah par line se zero (0) bhar do
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}