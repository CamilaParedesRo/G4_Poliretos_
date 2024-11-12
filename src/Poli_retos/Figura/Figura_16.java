package Poli_retos.Figura;

public class Figura_16 {
     /**
     * muestra la figura F16:
            +				+
                -		-
                    +                       
                -		-
            +				+
            ....
     */
    public void G4_Figuras_16(int extension) {
        System.out.println("Figura 16");  

        for (int i = 0; i < extension; i++) {
            for (int j = 0; j < extension; j++) {
                if (i==j || i==extension-1-j) {
                    if (i%2==0 && j%2==0) {
                        System.out.print("- ");
                    }
                    else
                        System.out.print("+ ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }    
    }

}
