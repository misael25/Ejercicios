import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Misael
 */
public class area {

  public static void main(String[] args) {
      int area;
      int perimetro;
      Scanner base = new Scanner(System.in);
      int b;
      System.out.println("ingrese la base: ");
      b = base.nextInt();
      
      
      Scanner dato = new Scanner(System.in);
      int a;
      System.out.println("ingrese la altura: ");
      a = dato.nextInt();
      
      area=b*a/2;
      perimetro=b+a; 
      
       System.out.println("El perimetro es " + perimetro +"El area es "+ area);
      
    
} 
    
}
