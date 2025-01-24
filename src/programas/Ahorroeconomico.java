package programas;
import java.util.Scanner;
public class Ahorroeconomico {
  //método de la clase  
  public static void main(String[] args){
     //declarar variables
     String empleado;
     double horastrabajadas,tarifahora,sueldobruto,descuento,sueldoneto;
     //crear un objeto de lectura de datos
     Scanner entrada = new Scanner(System.in);
     //entrada de datos
     System.out.print("Ingresar nombre del empleado:");
     empleado=entrada.next();
     System.out.print("Ingreso las horas trabajadas");
     horastrabajadas=entrada.nextDouble();
     System.out.print("Ingreso las Tarifas hora");
     tarifahora=entrada.nextDouble();
     
     sueldobruto = horastrabajadas * tarifahora;
     descuento = sueldobruto * 0.13;
     sueldoneto = sueldobruto - descuento;
     
     System.out.println("Detalle del empleado");
     System.out.println("Nombre: " + empleado);
     System.out.println("Suledo Bruto: " + sueldobruto);
     System.out.println("Descuento (13%): " + descuento);
     System.out.println("Sueldo Neto: " + sueldoneto);
            
  }  
}
