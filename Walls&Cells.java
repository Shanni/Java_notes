public class Solution {
    public void dfs(int[][] rooms, int i, int j){
        
       // System.out.println(rooms[i][j]);
        if(i-1>=0 && rooms[i-1][j]>rooms[i][j]+1){
            rooms[i-1][j]=rooms[i][j]+1;
            dfs(rooms,i-1,j);
        }
        if(j-1>=0 && rooms[i][j-1]>rooms[i][j]+1){
            rooms[i][j-1]=rooms[i][j]+1;
            dfs(rooms,i,j-1);
        }
        if(i+1<rooms.length && rooms[i+1][j]>rooms[i][j]+1){
            rooms[i+1][j]=rooms[i][j]+1;
            dfs(rooms,i+1,j);
        }
        if(j+1<rooms[0].length && rooms[i][j+1]>rooms[i][j]+1){
            rooms[i][j+1]=rooms[i][j]+1;
            dfs(rooms,i,j+1);
        }
            
    }
    public void wallsAndGates(int[][] rooms) {
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[0].length;j++){
                if(rooms[i][j]==0){
                    dfs(rooms,i,j);
                }
            }
        }
    }
}
