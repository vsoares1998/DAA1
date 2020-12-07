import java.util.*;
import java.io.*;

public class DAA029 {
    static boolean adj[][];   
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
        String aux2;

        aux = stdin.nextLine();

        for(int i=0;i<n-1;i++){
            aux2 = stdin.nextLine();

            int number = aux.length();
         
            for(int k=0;k<number;k++){
                int a = aux.charAt(k);
                int b = aux2.charAt(k);
                a=a-'A';
                b=b-'A';
                nos[a]=1;
                nos[b]=1;

                if(a!=b){
                    adj[a][b] = true;
                    break;
                }
            }
            aux=aux2;
        }

        visited = new boolean[27];	

        for(int i=0;i<=26;i++){
            if(nos[i]==1){
                if(!visited[i])
                    dfs(i);
            }
        }

        int tamanho = lista.size();
        for(int i=0;i<tamanho;i++){
            int a1 = lista.get(i) + 'A';
            char a = (char)a1;
            System.out.print(a);
        }
        System.out.println();
    }
}