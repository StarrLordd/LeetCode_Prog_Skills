class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c) return mat;
        int [][]mymat=new int[r][c];
        int nr=0,nc=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(nc==c){
                    nr++;
                    nc=0;
                }
                mymat[nr][nc]=mat[i][j];
                nc++;
            }
        }
        return mymat;
    }
}