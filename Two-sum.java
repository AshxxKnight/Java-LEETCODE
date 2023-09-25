class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> Map1 = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i<n ; i++){
            Map1.put(nums[i],i);
        }  

        for(int i = 0; i<n; i++){
            int j = target-nums[i];
            if(Map1.containsKey(j) && Map1.get(j) != i)
                return new int[]{i, Map1.get(j)};

        }
        return new int[] {};
    }
}