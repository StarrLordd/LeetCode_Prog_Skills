class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> myMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(myMap.containsKey(nums[i])){
                return true;
            }
            else{
                myMap.put(nums[i],0);
            }
        }
        return false;
    }
}