//using 1 hash table O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map1 = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i<n; i++)
        {
            int j = target - nums[i];
            if(map1.containsKey(j)){
                return new int[]{map1.get(j),i};
            }
            map1.put(nums[i],i);
        }
        return new int[] {};
    }
}