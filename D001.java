import java.util.Scanner;

public class D001 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int count=0;
      int n = in.nextInt();
      for(int i=0; i<n; i++){
        int s = in.nextInt();
          if(s==42)
            count++;
      }
      System.out.println(count);
    }
}
