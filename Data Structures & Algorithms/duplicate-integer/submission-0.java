class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> num = new HashSet<>();

        for (int n : nums){
            num.add(n);
        }
        
        if (nums.length == num.size()){
            return false;
        }
        return true;
    }
}