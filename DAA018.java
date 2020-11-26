import java.io.*;
import java.util.*;

public class DAA018{

  public static void main(String[] args){
    FastScanner stdin = new FastScanner(System.in);

    int n = stdin.nextInt();

    int[] moedas = new int[n];

    for(int i=0;i<n;i++){
      moedas[i]=stdin.nextInt();
    }

    int p = stdin.nextInt();

    for(int k=0;k<p;k++){
      int valor = stdin.nextInt();

      //funçao moedas
      int[] caminho = new int[valor+1];
      int[] coins = new int[valor+1];
      coins[0]=0;
      caminho[0]=0;

      //este j igual ao i d moedas

      for(int i=1;i<=valor;i++){
        coins[i]=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
          if(moedas[j]<=i && 1 + coins[i-moedas[j]] < coins[i]){
            coins[i] = 1 + coins[i - moedas[j]];
            caminho[i] = moedas[j];
          }
        }
      }


      System.out.print(valor+": ["+ coins[valor] +"]");

      while(caminho[valor]!=0){
        System.out.print(" " + caminho[valor]);
        valor = valor - caminho[valor];
      }
      System.out.println();


    }
  }

/*
  caminho é a primeira moeda a ser tirada depois subtraimos ao valor para saber o proximo passo
  
*/
}
