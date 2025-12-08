class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hMap = new HashMap<Integer, Integer>();
        int iCnt = 0;
        int iDiff = 0;
        for(iCnt = 0; iCnt < nums.length; iCnt++)
        {
            iDiff = target - nums[iCnt];

            if(hMap.containsKey(iDiff))
            {
                return new int[] { hMap.get(iDiff), iCnt};
            }

            hMap.put(nums[iCnt],iCnt);
        }

        return new int[]{};
    }
}