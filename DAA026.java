import java.util.*;

public class DAA026 {
    static boolean visited[][];  // Que nos ja foram visitados?
    static int count;
    static int rows; //linhas
    static int cols;
    static char m[][]; //matriz com os elementos o mesmo que a matriz de adjacencias
    static void dfs(int y, int x) {
        if(!(y>=0 && y<rows && x>=0 && x<cols)) return;

        if(visited[y][x] || m[y][x] != '#') return;

        visited[y][x] = true;
        count ++;
        dfs(y-1,x);
        dfs(y+1,x);
        dfs(y,x+1);
        dfs(y,x-1);
        dfs(y-1,x-1);
        dfs(y-1,x+1);
        dfs(y+1,x-1);
        dfs(y+1,x+1);


    }
    
    public static void main(String args[]) {

	Scanner stdin = new Scanner(System.in);
    
    int trab = stdin.nextInt();

    for(int k=0;k<trab;k++){

        rows = stdin.nextInt();
        cols = stdin.nextInt();
        stdin.nextLine();

        int max = 0;
        count = 0;
        visited = new boolean[rows+1][cols+1];
        m = new char[rows+1][cols+1];

            for(int i=0; i<rows;i++)
                m[i] = stdin.nextLine().toCharArray();
            
            for(int i=0; i<rows; i++){
                for(int j=0; j<cols; j++){
                    if(m[i][j]=='#' && !visited[i][j]){
                        dfs(i,j);
                        if(count > max) max = count;
                        count = 0;
                    }
                }
            }

            System.out.println(max);

        }
    }
}