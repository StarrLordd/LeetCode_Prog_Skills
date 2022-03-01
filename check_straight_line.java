class Solution {
    public boolean checkStraightLine(int[][] cords) {
        int points=cords.length;
        int xdif=cords[1][0]-cords[0][0];
        int ydif=cords[1][1]-cords[0][1];
        
        int cur_xdif,cur_ydif;
        for(int i=2;i<points;i++){
            cur_xdif=cords[i][0]-cords[i-1][0];
            cur_ydif=cords[i][1]-cords[i-1][1];
            if(xdif*cur_ydif!=ydif*cur_xdif) return false; 
        }
        return true;
    }
}