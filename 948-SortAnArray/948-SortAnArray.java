// Last updated: 4/24/2026, 8:14:14 AM
class Solution {
    public int[] sortArray(int[] nums) {
        //selection sort
        // int n = nums.length;
        // for (int i = 0; i < n; ++i) {
        //     int min = i;
        //     for (int j = i + 1; j < n; ++j) {
        //         if (nums[min] > nums[j]) {
        //             min = j;
        //         }
        //     }
        //     int temp = nums[i];
        //     nums[i] = nums[min];
        //     nums[min] = temp;
        // }
        // return nums;

        //bubble sort
        // int n = nums.length;
        // for (int i = 0; i < n; ++i) {
        //     for (int j = 0; j < (n-i-1); ++j) {
        //         if (nums[j] > nums[j + 1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j + 1];
        //             nums[j + 1] = temp;
        //         }
        //     }
        // }
        // return nums;


        //optimized bubble sort: best case = O(n)
        // int n = nums.length;
        // boolean flag =  false;
        // for (int i = 0; i < n && !flag; ++i) {
        //     flag = true;
        //     for (int j = 0; j < (n-i-1); ++j) {
        //         if (nums[j] > nums[j + 1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j + 1];
        //             nums[j + 1] = temp;
        //             flag = false;
        //         }
        //     }
        // }
        // return nums;


        //insertion sort
        // int n = nums.length;
        // for (int i = 1; i < n; ++i) {
        //     for (int j = i - 1; j >= 0 && nums[j+1] < nums[j]; --j) {
        //         int temp = nums[j+1];
        //         nums[j+1] = nums[j];
        //         nums[j] = temp;
        //     }
        // }
        // return nums;

        //test merge function of two sorted arrays
        // int[] a = {1,1,2,3,4};
        // int[] b = {2,4,5,6};
        // System.out.println(Arrays.toString(merge(a,b)));

        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSort(int[] nums, int low, int high) {
        if (low == high)
            return;
        int mid = (low + high) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }
    public void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int idx = 0;
        int n = (high - low + 1);
        int[] temp = new int[n];
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right])
                temp[idx++] = nums[left++];
            else
                temp[idx++] = nums[right++];
        }
        while (left <= mid) {
            temp[idx++] = nums[left++];
        }
        while (right <= high) {
            temp[idx++] = nums[right++];
        }
        for (int i = low; i <= high; ++i) {
            nums[i] = temp[i - low];
        }
    }
    // public int[] merge(int[] a, int[] b) {
    //     int idx_a = 0, idx_b = 0, idx_c = 0;
    //     int len_a = a.length, len_b = b.length;
    //     int[] c = new int[len_a + len_b];
    //     while (idx_a < len_a && idx_b < len_b) {
    //         if (a[idx_a] <= b[idx_b])
    //             c[idx_c++] = a[idx_a++];
    //         else
    //             c[idx_c++] = b[idx_b++];
    //     }
    //     if (idx_a < len_a) {
    //         while (idx_a < len_a) {
    //             c[idx_c++] = a[idx_a++];
    //         }
    //     } else {
    //         while (idx_b < len_b) {
    //             c[idx_c++] = b[idx_b++];
    //         }
    //     }
    //     return c;
    // }
}