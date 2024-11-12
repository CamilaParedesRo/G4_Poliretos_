package Poli_retos.Figura;

public class Figura_13 {
    /**
     *muestra la figura F13:	
        1
        12
        123
        1234
        12345               
        123456
        1234567
        12345678
        123456789
        ...
     */  
    public void G4_Figuras_13(int extension) {
        System.out.println("Figura 13"); 

        for(int i=0; i<=extension; i++){
        
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
