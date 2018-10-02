package persona;

import java.util.Scanner;

/**
 *
 * @author Misael
 */
public class IMC {
    public static void main(String[] args) {
      double imc;
        //int peso;
      //double altura;
      Scanner masa = new Scanner(System.in);
      double b;
      System.out.println("ingrese tu estatura: ");
      b = masa.nextInt();
      
      Scanner estatura = new Scanner(System.in);
      double a;
      System.out.println("ingrese tu peso: ");
      a = estatura.nextInt();
      imc= b*b/a;
      
      System.out.println("Tu IMC es "+imc);
    
      //imc=peso*altura/2;
}
}
