class Solution {
    public int maximumWealth(int[][] accounts) {
        int []arr=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[0].length;j++){
                sum+=accounts[i][j];
            }
            arr[i]=sum;
        }
        return Arrays.stream(arr).max().getAsInt();
         
        
    }
}