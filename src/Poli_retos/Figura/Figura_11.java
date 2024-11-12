package Poli_retos.Figura;

public class Figura_11 {
    /**
     * muestra la figura F11:	
            | _ 
               | _ _
                    | _ _ _
                           | _ _ _ _            
                                    | _ _ _ _ _
     */  
    public void G4_Figuras_11(int extension) {
        System.out.println("Figura 11"); 

        StringBuilder caracteres = new StringBuilder("|");
        StringBuilder espacios = new StringBuilder(""); 
        StringBuilder addespacios = new StringBuilder("   ");
        for (int filas = 0; filas < extension; filas++){
            System.out.println(caracteres.append(" _"));
            System.out.print(espacios.append(addespacios));
            addespacios.append("  ");
        }
    }

}
