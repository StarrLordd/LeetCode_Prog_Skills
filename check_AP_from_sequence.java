class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Set<Integer> set=new HashSet();
        
        for(int num:arr){
            max=Math.max(num,max);
            min=Math.min(num,min);
            set.add(num);
        }
        
        int n=arr.length;
        int d=max-min;
        if(d%(n-1)!=0) return false;
        d/=(n-1);
        int i=0;
        while(i<n){
            if(!set.contains(min)) return false;
            min+=d;
            i++;
        }
        return true;
    }
}