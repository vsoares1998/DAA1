import java.io.*;
import java.util.*;

public class DAA017{
  public static void main(String[] args){
    FastScanner stdin = new FastScanner(System.in);


    int n = stdin.nextInt(); //numero de andares

    int d = stdin.nextInt(); //numero de pedras detioradas

    int[][] piramide = new int[n+1][n+1];


    for(int i=0;i<d;i++){
      int a = stdin.nextInt();
      int b = stdin.nextInt();
      piramide[n-a][b-1] = -1;//***
    }

    System.out.println(""+caminhos_possiveis(piramide,n));


  }

  public static long caminhos_possiveis(int[][] piramide,int n){

    long[][] count= new long[n+1][n+1];
    count[0][0] = 1;

    for(int i = 1; i<n ;i++){//---
      for(int j=0; j<=i ;j++){//---
        if(piramide[i][j]!=-1){
          if(i-1>=j && piramide[i-1][j] != -1)
            count[i][j] = count[i][j] + count[i-1][j];
          if(j-1>=0 && piramide[i-1][j-1] != -1)
            count[i][j] = count[i][j] + count[i-1][j-1];
          }
      }
    }

    long soma = 0;
		for(int j=0;j<n;j++)
				soma = soma + count[n-1][j];

    return soma;


  }
}
