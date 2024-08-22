public class Solution {
    
    // Method to print the solution matrix
    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if x, y is valid index for N*N maze
    public static boolean isSafe(int maze[][], int x, int y) {
        // if (x, y is outside maze) return false
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    // Solves the maze problem using Backtracking. It mainly uses solveMazeUtil()
    // to solve the problem. It returns false if no path is possible, otherwise
    // returns true and prints the path in the form of 1s. 
    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N];

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    // A recursive utility function to solve Maze problem
    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        int N = maze.length;

        // if (x, y is goal) return true
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        // Check if maze[x][y] is valid
        if (isSafe(maze, x, y) == true) {
            // mark x, y as part of solution path
            sol[x][y] = 1;

            // Move forward in x direction
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;

            // If moving in x direction doesn't give solution then move down in y direction
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;

            // If none of the above movements work then BACKTRACK: unmark x, y as part of solution path
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String args[]) {
        int maze[][] = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 }
        };

        solveMaze(maze);
    }
}
