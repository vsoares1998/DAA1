import java.util.Scanner;

public class D002 {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = 0;
    int total = 0;
    for(int i=0;i<n;i++){
      a=0;
      int numero = in.nextInt();
      int igualdade = in.nextInt();
       while(a==0){
         numero = numero + 1;
         String leitura = String.valueOf(numero);
         int tamanho = leitura.length();
         total = 0;
           for(int j=0;j<tamanho;j++){
             int aux = Integer.parseInt(String.valueOf(leitura.charAt(j)));
             total = total + aux;
           }
         if(total == igualdade){
          System.out.println(leitura);
          a=1;
        }
      }
    }
  }
}
