package Poli_retos.Figura;

public class Figura_04 {
public void G4_Figura_4(int extension) {

        System.out.println("Figura 4");
        
        for (int i = 1; i <= extension; i++) {
            for (int j = 1; j <= extension - i; j++) {
                System.out.print("  "); 
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
