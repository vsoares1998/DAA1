
import java.util.*;


class Sapatos implements Comparable<Sapatos> {
  double razao;
  int ordem;

  public Sapatos(int ordem,double razao){

    this.razao = razao;
    this.ordem = ordem;

  }

  @Override
  public int compareTo(Sapatos p) {
      if (razao < p.razao)
          return +1;
      if (razao > p.razao)
          return -1;
      return 0;
  }

}





public class DAA014{
  public static void main(String[] args){
    FastScanner stdin = new FastScanner(System.in);

    int n = stdin.nextInt();

    double[] razao = new double[n+1];
    Sapatos[] sapato = new Sapatos[n];

    for(int i=0; i<n; i++){
      double dia = stdin.nextInt();
      double multa = stdin.nextInt();
      razao[i] = multa/dia;
      sapato[i] = new Sapatos(i,razao[i]);


    }
    Arrays.sort(sapato);
    for(int i=0; i<n; i++){
      int aux = sapato[i].ordem + 1;
      if(i==0)
        System.out.print("" + aux);
      else
        System.out.print(" " + aux);

    }
    System.out.println();
  }
}
