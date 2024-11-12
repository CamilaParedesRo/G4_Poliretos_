package Poli_retos.Figura;

public class Figura_08 {

    public void G4_Figuras_8(int extension) {
        System.out.println("Figura 8: ");
        
        int numeroColumna = (2 * extension) - 1;

        for (int fila = 0; fila < extension; fila++) {
            
            for (int columna = 1; columna <= numeroColumna; columna++) {
                
                if (fila == 0 && columna == extension) {
                    System.out.print("__");
                }
                
                else if (fila > 0 && columna == (extension - fila)) {
                    System.out.print("__|");
                }
                
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
