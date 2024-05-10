public class NearestExitFromEntranceInMaze {

    private boolean isExit(int row, int col){
        return row == 0 || col == 0;
    }

    private int dfs(int x, int y, boolean[][] visited, char[][] maze,int rows, int cols){
        if(isExit(x,y)){
            return 0;
        }
        visited[x][y] = true;
        int[][] moves = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        int max = Integer.MAX_VALUE;
        for(int[] move : moves){
            int nextX = x + move[0];
            int nextY = y + move[1];
            int currentMax = 0;
            if(nextX >= 0 && nextX < rows && nextY >= 0 && nextY < cols && maze[nextX][nextY] == '.' && !visited[nextX][nextY]){
                currentMax = 1 + dfs(nextX, nextY, visited,maze, rows, cols);
            }
            if(currentMax < max){
                max = currentMax;
            }
        }
        //visited[x][y] = false;
        return max;
    }

    public int nearestExit(char[][] maze, int[] entrance) {

        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int result = Integer.MAX_VALUE;
        if(maze[entrance[0]][entrance[1]] == '.') {
            result = dfs(entrance[0], entrance[1], visited, maze, rows, cols);
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public static void main(String[] args) {
        NearestExitFromEntranceInMaze obj = new NearestExitFromEntranceInMaze();
        /*
        {{"+","+",".","+"},{".",".",".","+"},{"+","+","+","."}}
        [1,2]
         */
        char[][] maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int[] entrance = {1,2};
        obj.nearestExit(maze, entrance);
    }

}
