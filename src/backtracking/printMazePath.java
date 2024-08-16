package backtracking;

public class printMazePath {
    boolean[][]maze=new boolean[4][4];

    public printMazePath() {
        maze = new boolean[4][4];
        maze[2][2] = true;
        maze[3][1] = true;
    }
    public static void printPath(String p,int r,int c){
        if(r==3 && c==3){
            System.out.println(p);
           return;
        }
         int count=0;
        if(c!=3)
        printPath(p+"r",r, c+1);
        if(r!=3)
        printPath(p+"d",r+1, c);
        return;
    }

    public static void printIncludeDiagonalPath(String p,int r,int c){
        if(r==2 && c==2){
            System.out.println(p);
            return ;
        }
        int count=0;
       if(c<2)
       printIncludeDiagonalPath(p+"r",r, c+1);
       if(r<2)
       printIncludeDiagonalPath(p+"d",r+1, c);
       if(r<2 && c<2)
       printIncludeDiagonalPath(p+"c",r+1,c+1);
       return;
    }

    public static void printPathWithObstructions(String p,boolean [][]maze,int r,int c){
        if(r==maze.length-1 && c==maze.length-1){
             System.out.println(p);
             return;
        }
        if(maze[r][c])
        return;
        int count=0;
        if(c<maze.length-1)
        printPathWithObstructions(p+"r",maze,r, c+1);
        if(r<maze.length-1)
        printPathWithObstructions(p+"d",maze,r+1, c);
        return ;
  }
    public static void main(String[] args) {
        printMazePath p=new printMazePath();
        printPath("", 0, 0);
        System.out.println("---------------");
        printIncludeDiagonalPath("", 0, 0);
        System.out.println("++++++++++++++++++");
        printPathWithObstructions("",p.maze,0,0);
    }
}
