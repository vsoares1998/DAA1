
import java.util.*;

/*tetset*/
public class DAA021{
  public static void main(String[] args){
    FastScanner stdin = new FastScanner(System.in);
    TreeMap<Integer, Integer> map = new TreeMap<>();

    int a = stdin.nextInt();
    int r = stdin.nextInt();

    for(int i=0;i<a+r;i++){
      String aux = stdin.nextLine();
      if(aux.charAt(0)=='B'){
        int power = Integer.parseInt(aux.split(" ",0)[1]);
        if(map.containsKey(power)) map.put(power,map.get(power)+1);
        else map.put(power,1);
      }
      else {
        Map.Entry<Integer,Integer> aux1;
        if(aux.charAt(1)=='I'){
          aux1 = map.firstEntry();
          System.out.println(aux1.getKey());
        }
        else{
          aux1 = map.lastEntry();
          System.out.println(aux1.getKey());
        }
        if(aux1.getValue()==1) map.remove(aux1.getKey());
        else map.put(aux1.getKey(),aux1.getValue()-1);
      }
    }
  }
}
