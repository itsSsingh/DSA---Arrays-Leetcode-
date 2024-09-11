Convert Sorted Arrays Problem

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length== 0 || nums == null){ // edge case
            return null;
        }

        return f(nums, 0, nums.length-1); // reccursive call
    }

    public TreeNode f(int[] nums, int left, int right){ // helper recurrsive function for divide and conquer
        if(left > right){ // base case
            return null;
        }

        int mid= left + (right - left) / 2; // cal mid
        TreeNode root= new TreeNode(nums[mid]); // assign mid to root

        root.left= f(nums, left, mid-1); // attach the left of root to root.left
        root.right= f(nums, mid+1, right); // attach the right of root to root.right
        return root;
    }
}
