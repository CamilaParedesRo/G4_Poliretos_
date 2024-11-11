import java.util.Scanner;

public class App {
       public static void main(String[] args) throws Exception {


    }

    // Validadores
    public static int validarNumeros(){
        Scanner scanner = new Scanner(System.in);
             int extension;
        while (true) {
           System.out.println("Ingrese la extensión de las series: ");
           if (scanner.hasNextInt()) {
               extension = scanner.nextInt();
               if (extension > 0) {
                break; 
            } else {
                System.out.println("Error: Por favor, ingrese un número entero positivo.");
            } 
           } else {
               System.out.println("Error: Por favor, ingrese un número entero válido.");
               scanner.next(); 
           }
        }
        scanner.close();
         return extension;
       } 

   
    
  
    
 }

