package backtracking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class mazeBackTrackingAllDirections {
    boolean[][]maze=new boolean[3][3];

    public mazeBackTrackingAllDirections() {
        maze = new boolean[3][3];
    }
    public static void printPath(String p,boolean[][]maze,int r,int c,int[][]path,int steps){
        if(r==maze.length-1 && c==maze.length-1){
            System.out.println(p);
            path[r][c]=steps;
            for(int[]a:path)
            System.out.println(Arrays.toString(a));
            path[r][c]=0;
           return;
        }
        if(maze[r][c])
        return; 
        maze[r][c]=true;
        path[r][c]=steps;
        if(r<maze.length-1)
        printPath(p+"d",maze,r+1, c,path,steps+1);
        if(c<maze.length-1)
        printPath(p+"r",maze,r, c+1,path,steps+1);
        if(r>0)
        printPath(p+"u", maze, r-1, c,path,steps+1);
        if(c>0)
        printPath(p+"l", maze, r, c-1,path,steps+1);
        maze[r][c]=false;
        path[r][c]=0;
        return;
    }
    public static void main(String[] args) {
        mazeBackTrackingAllDirections m=new mazeBackTrackingAllDirections();
        int[][]path=new int[3][3];
        printPath("",m.maze, 0, 0,path,1);
    }
}
