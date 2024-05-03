import java.util.List;

public class KeysAndRooms {

    private boolean canVisitAll(boolean[] visited){
        return false;
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        // 0th room can always be visited
        dfs(0, rooms, visited);
        return canVisitAll(visited);
    }

    private void dfs(int currentNode, List<List<Integer>> rooms, boolean[] visited) {
        if(visited[currentNode] == false) {
            visited[currentNode] = true;
            for (int key : rooms.get(currentNode)) {
                visited[key] = true;
                dfs(key, rooms, visited);
            }
        }
    }

}
