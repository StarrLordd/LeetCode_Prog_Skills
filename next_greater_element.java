class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums2.length; i++)
            map1.put(nums2[i],i);
        for(int j = 0; j < nums1.length; j++) {
            int idx = map1.get(nums1[j]);
            result[j] = -1;
            for(int k = idx+1; k<nums2.length; k++) {
                if(nums2[k] > nums1[j]) {
                    result[j] = nums2[k];
                    break;
                } 
            }
        }
        return result;
    }
}