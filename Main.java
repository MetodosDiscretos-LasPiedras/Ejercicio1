import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
     System.out.println("Ingrese un número: ");
		 int num=entrada.nextInt();
    int resul=cuadrado(num);
    System.out.println("El cuadrado es: "+resul);
  }
  
 public static int cuadrado(int nro1 ){
   
   return nro1*nro1;
   
 }
}
