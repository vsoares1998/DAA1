import java.io.*;
import java.util.*;

class Ponto implements Comparable<Ponto> {
    int x, y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Ponto p) {
        if (x < p.x)
            return -1;
        if (x > p.x)
            return +1;
        if (x == p.x)
            if (y < p.y)
                return +1;
            else if (y > p.y)
                return -1;

        return 0;
    }
}


public class DAA013{
  public static void main(String[] args){
    FastScanner stdin = new FastScanner(System.in);

    int m = stdin.nextInt();

    int n = stdin.nextInt();

    Ponto[] ponto = new Ponto[n];


    for(int i=0;i<n;i++){
      ponto[i] = new Ponto(stdin.nextInt(),stdin.nextInt());
    }

    Arrays.sort(ponto);

    int aux = golosa(ponto,n,m);

    System.out.println(""+aux);

  }

public static int golosa(Ponto[] ponto,int n,int m){

  int aux=0;
  int conta=0;

    while(aux < m){
          int aux1 = maior(ponto,aux,n);
          conta++;
          aux=ponto[aux1].y;
          //System.out.println(""+ ponto[aux1].x + " - " + ponto[aux1].y);
    }
    return conta;
  }

public static int maior(Ponto[] ponto,int aux,int n){

  int tamanho = 0;
  int aux1 = 0 ;
  //System.out.println("tamanho: " + tamanho);
  for(int i=0;i<n;i++){
    if(ponto[i].x<=aux && ponto[i].y>aux){
      if((ponto[i].y - aux) > tamanho){
        tamanho = ponto[i].y - aux;
        aux1=i;
        //System.out.println("entrou -> " + ponto[i].x +"" + ponto[i].y);
      }
    }
  }
  //System.out.println("aux1  ->   "+ponto[aux1].x + "  -  " +ponto[aux1].y);
  return aux1;

}


}
