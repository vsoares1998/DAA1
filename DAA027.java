import java.util.*;

class DAA027{
    static int n;              // Numero de nos do grafo
    static boolean adj[][];    // Matriz de adjacencias
    static boolean visited[];  // Que nos ja foram visitados?
    static int color[];
    static int[] cor = {-1, 1};
    static int cor1;

    static void dfs(int v, int cor) {
        visited[v] = true;
        color[v] = cor;
        for(int i=1; i<=n;i++){
            if(adj[v][i] && !visited[i]){
                if(color[v] != color[i]){
                    dfs(i,-cor);
                }
            }
            else if(adj[v][i] && visited[i]){
                if(color[v] == color[i]){
                    cor1=1;
                    return;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int casos = stdin.nextInt();

        for(int k=0;k<casos;k++){
            n = stdin.nextInt();

            adj = new boolean[n+1][n+1];
            visited = new boolean[n+1];
            color = new int[n+1];

            int edges = stdin.nextInt();

            for(int i=0; i<edges; i++){
                int a = stdin.nextInt();
                int b = stdin.nextInt();
                adj[a][b] = adj[b][a] = true;
            }

            int nuno=0;

            for(int i=1; i<=n; i++){
                if(visited[i] != true ){
                    dfs(i,1);
                    if(cor1==1){
                        System.out.println("nao");
                        nuno=1;
                        break;
                    }
                }
            }

            cor1=0;

            if(nuno==0)
                System.out.println("sim");



        }
    }
}