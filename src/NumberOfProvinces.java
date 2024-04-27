import java.util.List;

public class NumberOfProvinces {

    private void dfs(int currentNode, int[][] isConnected, boolean[] visited){
        visited[currentNode] = true;
        for(int i = 0 ; i < isConnected.length ; i++){
            if(currentNode != i && isConnected[currentNode][i] == 1 && !visited[i]){
                dfs(i, isConnected, visited);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int connectedComponentCount = 0;
        boolean[] visited = new boolean[isConnected.length];
        // Go through each node. Each DFS's ending is one connected component
        for(int i = 0 ; i < isConnected.length ; i++){

            if(!visited[i]){
                dfs(i, isConnected, visited);
                connectedComponentCount++;
            }
        }
        return connectedComponentCount;
    }

}
