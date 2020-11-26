import java.io.*;
import java.util.*;


public class DAA011{
  //public static int n = 0;
  public static void main(String[] args){
    FastScanner stdin = new FastScanner(System.in);

    int n = stdin.nextInt();
    int[] distancias = new int[n];
    int maximo=0;

    for (int i=0;i<n;i++){
      distancias[i]=stdin.nextInt();
      maximo += distancias[i];
    }

    int p = stdin.nextInt();
    int [] arrayk = new int[p];
    for(int j=0 ; j<p ; j++){
        int k = stdin.nextInt();
        int aux = bsearch(1,maximo,k,distancias);
        System.out.println(aux);
    }
  }

  public static int bsearch (int low,int high, int dias, int[] distancias){
    while(low < high){
       int  middle = low + (high - low)/2;
      if(e_possivel(middle,dias,distancias)==true){
        high=middle;
      }
      else{
        low=middle + 1;
      }
    }
    if(e_possivel(low,dias,distancias)==false){
       return low - 1;
     }
    return low;
  }

  public static Boolean e_possivel(int valor, int dias,int[] distancias){
      int divisoes = 0;
      int soma = 0;

      for(int i=0;i<distancias.length;i++){
        soma = soma + distancias[i];
        if(soma>valor){
          divisoes++;
          soma=0;
          i--;
        }
        if(divisoes>=dias) return false;
      }
      return true;
  }
}
