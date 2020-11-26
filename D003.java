import java.util.Scanner;

public class D003{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);

      int aux1=0;
      int aux2=0;
      int aux3=0;

      long distancia = 0L;

      int n = in.nextInt();

      String Matricula = new String();

      Matricula = in.next();

      char parx1 = Matricula.charAt(0);
      char parx2 = Matricula.charAt(1);

      if(Character.isLetter(parx1))
        aux1=1;

      char pary1 = Matricula.charAt(3);
      char pary2 = Matricula.charAt(4);

      if(Character.isLetter(pary1))
        aux2=1;

      char parz1 = Matricula.charAt(6);
      char parz2 = Matricula.charAt(7);

      if(Character.isLetter(parz1))
        aux3=1;

      if(aux1==1 && aux3==0 ){
        int x1 = Integer.parseInt(String.valueOf(Matricula.charAt(3)));
        int x2 = Integer.parseInt(String.valueOf(Matricula.charAt(4)));
        //x1 = x1*9;
        //x2= x2*9;

        char y1 = Matricula.charAt(0);
        int pos1 = y1 - 'A';
        System.out.println("pos1:" + pos1);
        char y2 = Matricula.charAt(1);
        int pos2 = y2 - 'A';
        //pos1 = pos1*25;
        //pos2 = pos2*25;




        int z1 = Integer.parseInt(String.valueOf(Matricula.charAt(6)));
        int z2 = Integer.parseInt(String.valueOf(Matricula.charAt(7)));
        //z1=z1*9;
        //z2=z2*9;


        int total = z2 + z1*10 + x2*100 + x1*1000 + pos2* 10000 +  pos1* 100000;





        distancia = total;

        System.out.println(distancia);
      }

      if(aux2==1){
        distancia = distancia + 10580000;
        int x1 = Integer.parseInt(String.valueOf(Matricula.charAt(0)));
        int x2 = Integer.parseInt(String.valueOf(Matricula.charAt(1)));
        //x1 = x1 * 10;
        //long x = x1 + x2;
      //  x = x * 100;
        //if(x==0)
          //x=1;
        //System.out.println("x:" + x);

        char y1 = Matricula.charAt(3);
        int pos1 = y1 - 'A';
        char y2 = Matricula.charAt(4);
        int pos2 = y2 - 'A';
        //pos2 = pos2 * 23;
        //long pos = pos2 + pos1;
        //pos = pos * 10000;
        //if(pos==0)
          //pos=1;
        //System.out.println("pos:" + pos);


        int z1 = Integer.parseInt(String.valueOf(Matricula.charAt(6)));
        int z2 = Integer.parseInt(String.valueOf(Matricula.charAt(7)));
        //z1 = z1 * 10;
        //long z = z2 + z1;
        //if(z==0)
          //z=1;
        //System.out.println("z:" + z);

        //long soma1 = 0L;
        //soma1 = x*pos;
        //System.out.println("soma1: " +soma1);
        //long soma2 = 0L;
        //soma2 = soma1 * z;
        //System.out.println("soma2:" +soma2);



        int total = z2 + z1*10 + x2*100 + x1*1000 + pos2* 10000 +  pos1* 100000;


        distancia = distancia + total;

        System.out.println(distancia);
      }
      if(aux3==1 && aux1==0){
        distancia = distancia + 5290000 ;
        int x1 = Integer.parseInt(String.valueOf(Matricula.charAt(0)));
        int x2 = Integer.parseInt(String.valueOf(Matricula.charAt(1)));
//        x1 = x1 * 10;
  //      int x = x1 + x2;
        //x = x * 100;
    //    if(x==0)
      //    x=1;

        char y1 = Matricula.charAt(6);
        int pos1 = y1 - 'A';

        //System.out.println("pos1:"+pos1);
        char y2 = Matricula.charAt(7);
        int pos2 = y2 - 'A';
        //System.out.println("pos2:"+pos2);
        //pos2 = pos2 * 23;
        //int pos = pos2 + pos1;
        //pos = pos * 10000;
        //if(pos==0)
          //pos=1;


        int z1 = Integer.parseInt(String.valueOf(Matricula.charAt(3)));
        int z2 = Integer.parseInt(String.valueOf(Matricula.charAt(4)));
        //z1 = z1 * 10;
        //int z = z2 + z1;
        //if(z==0)
          //z=1;

        //int soma1 = 0;
        //soma1 = x*pos;
        //System.out.println("soma1: " +soma1);
        //int soma2 = 0;
        //soma2 = soma1 * z;
        //System.out.println("soma2:" +soma2);

        int total = z2 + z1*10 + x2*100 + x1*1000 + pos2* 10000 +  pos1* 100000;


        distancia = distancia + total;
        System.out.println(distancia);
      }

      if(aux3==1 && aux1==1){
        distancia = distancia + 15870000;

        char x1 = Matricula.charAt(6);
        int posx1 = x1 - 'A';
        char x2 = Matricula.charAt(7);
        int posx2 = x2 - 'A';
        //posx2 = posx2 * 23;
        //long posx = posx2 + posx1;
        //posx = posx * 100;
        //if(posx==0)
          //posx=1;

        char y1 = Matricula.charAt(0);
        int pos1 = y1 - 'A';
        char y2 = Matricula.charAt(1);
        int pos2 = y2 - 'A';
        //pos2 = pos2 * 23;
        //long pos = pos2 + pos1;
        //pos = pos * 10000;
        //if(pos==0)
          //pos=1;


        int z1 = Integer.parseInt(String.valueOf(Matricula.charAt(3)));
        int z2 = Integer.parseInt(String.valueOf(Matricula.charAt(4)));


        //z1 = z1 * 10;
        //long z = z2 + z1;
        //if(z==0)
          //z=1;

        //long soma1 = 0L;
        //soma1 = posx*pos;
        //System.out.println("soma1: " +soma1);
        //long soma2 = 0L;
        //soma2 = soma1 * z;
        //System.out.println("soma2:" +soma2);


        int total = z2 + z1*10 + posx2*100 + posx1*1000 + pos2* 10000 +  pos1* 100000;

        distancia = distancia + total;

        System.out.println(distancia);
      }


    }
}
