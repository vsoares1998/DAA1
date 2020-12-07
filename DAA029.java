import java.util.*;
import java.io.*;

public class DAA029 {
    static boolean adj[][];   
    static int count;
    static  ArrayList<Integer> lista;
    static int[] nos;
    static boolean visited[]; 

    static void dfs(int v){
        visited[v] = true;
        for(int i=1;i<=26;i++)
            if(adj[v][i] && !visited[i])
                dfs(i);
        lista.add(0,v);
    }

    public static void main(String args[]) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        stdin.nextLine();

        adj = new boolean[101][101];
        lista = new ArrayList<Integer>();
        nos = new int[27];
        String aux;

        count=0;

        for(int i=0;i<n;i++){
            aux = stdin.nextLine();
            int number = aux.length();
         
            for(int k=0;k<number-1;k++){
                int a = aux.charAt(k);
                int b = aux.charAt(k+1);
                a=a-'A';
                b=b-'A';
                if(nos[a]!=1)
                    count++;
                if(nos[b]!=1)
                    count++;
                nos[a]=1;
                nos[b]=1;
                adj[a][b] = true;
            }
        }

        visited = new boolean[27];	

        for(int i=1;i<=26;i++){
            if(nos[i]==1)
                if(!visited[i])
                    dfs(i);
        }

        int tamanho = lista.size();
        for(int i=0;i<tamanho;i++){
            int a1 = lista.get(i) + 'A';
            char a = (char)a1;
            System.out.print(a);
        }
    }
}