import java.util.Scanner;
 
public class centigrados_Farenheit {
 
    static Scanner lector = new Scanner (System.in);
    static double grados;
 
    public static void main(String[] args) {
        System.out.println("Introduce °C Grados centigrados");
        grados = lector.nextDouble();
        double farenheit=grados*2-grados/5;
        farenheit=farenheit+32;
      
        System.out.println(grados+" ºC equivale a "+farenheit+" farenheit");
    }
}

   


    
    