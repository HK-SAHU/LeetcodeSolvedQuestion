class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int m= matrix.length;
        int n= matrix[0].length;
        int top=0, bottom= m-1, right= n-1, left=0;
        int totalEle=0;
        while(totalEle<m*n){
            
            //topRow -> left to right
            for(int j=left; j <=right && totalEle<m*n ;j++){
                list.add(matrix[top][j]);
                totalEle++;
            }
            top++;
            //leftCol -> 
            for(int i=top; i <=bottom && totalEle<m*n ;i++){
                list.add(matrix[i][right]);
                totalEle++;
            }
            right--;
            
            //bottomRow  -> right to left
            for(int j=right; j >=left && totalEle<m*n ;j--){
                list.add(matrix[bottom][j]);
                totalEle++;
            }
            bottom--;
            
            //leftCol   ->  bottom to top
            
            for(int i=bottom; i >=top && totalEle<m*n ;i--){
                list.add(matrix[i][left]);
                totalEle++;
            }
            left++;
        }
        return list;
    }
}