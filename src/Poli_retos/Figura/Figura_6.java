package Poli_retos.Figura;

public class Figura_6 {
    /**
     * muestra la figura F6:	
		     *
		    ***
		   *****                    
		  *******
		 ********* 
     */
    public void G4_Figuras_6(int extension) {
        System.out.println("Figura 06");  

        for (int filas = extension; filas > 0; filas--) {
            for (int espacio = 0; espacio < filas; espacio++) {
                System.out.print(" ");
            }
            for (int nroCaracteres = extension; nroCaracteres >= filas; nroCaracteres--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
