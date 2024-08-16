package backtracking;

public class countMazePath {
    boolean[][]maze=new boolean[4][4];

    public countMazePath() {
        maze = new boolean[4][4];
        maze[2][2] = true;
        maze[3][1] = true;
    }

    public static int countPath(int r,int c){
         if(r==3 && c==3)
         return 1;
         int count=0;
        if(c<3)
        count+=countPath(r, c+1);
        if(r<3)
        count+=countPath(r+1, c);
        return count;
    }

    public static int countIncludeDiagonalPath(int r,int c){
        if(r==3 && c==3)
        return 1;
        int count=0;
       if(c<3)
       count+=countIncludeDiagonalPath(r, c+1);
       if(r<3)
       count+=countIncludeDiagonalPath(r+1, c);
       if(r<3 && c<3)
       count+=countIncludeDiagonalPath(r+1,c+1);
       return count;
    }

    public static int countPathWithObstructions(boolean [][]maze,int r,int c){
          if(r==maze.length-1 && c==maze.length-1)
          return 1;
          if(maze[r][c])
          return 0;
          int count=0;
          if(c<maze.length-1)
          count+=countPathWithObstructions(maze,r, c+1);
          if(r<maze.length-1)
          count+=countPathWithObstructions(maze,r+1, c);
          return count;
    }
    public static void main(String[] args) {
        countMazePath c=new countMazePath();
        System.out.println(countPath(0, 0));
        System.out.println(countIncludeDiagonalPath(0, 0));
        System.out.println(countPathWithObstructions(c.maze, 0, 0));
    }
}
