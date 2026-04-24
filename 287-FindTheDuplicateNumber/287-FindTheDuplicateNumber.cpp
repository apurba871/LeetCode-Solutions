// Last updated: 4/24/2026, 8:14:34 AM
class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        // Naive Approach using sorting
        // Time Complexity: O(n log n)
        // Space Complexity: O(1)
        // int item;
        // sort(nums.begin(), nums.end());
        // for (int i = 0; i < nums.size(); ++i) {
        //     if (nums[i] - nums[i + 1] == 0) {
        //         item = nums[i];
        //         break;
        //     }
        // }
        // return item;
        
        
        // Better Approach using Hashing
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        // vector<int> hash(nums.size(), 0);
        // int dup;
        // for (int item : nums) {
        //     if (hash[item] == 0)
        //         hash[item]++;
        //     else {
        //         dup = item;
        //         break;
        //     }
        // }
        // return dup;
        
        
        // Best Approach using Cycle Detection Algorithm
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        int slow_ptr = nums[0];
        int fast_ptr = nums[0];
        do {
            slow_ptr = nums[slow_ptr];
            fast_ptr = nums[nums[fast_ptr]];
        } while (slow_ptr != fast_ptr);
        fast_ptr = nums[0];
        while (slow_ptr != fast_ptr) {
            slow_ptr = nums[slow_ptr];
            fast_ptr = nums[fast_ptr];
        }
        return slow_ptr;
    }
};