package Poli_retos.SerieDeCaracteres;

public class SerieDeCaracter_08 {
    public  void G4_SerieDeCaracter08(int extension) {
        System.out.println("Serie de Caracteres S8");

        char letra = 'a'; 
         int repeticiones = 1; 
        int contador = 0; 
        while (contador < extension && letra <= 'z') { 
            for (int i = 0; i < repeticiones; i++) {
                System.out.print(letra); // 
            }
            System.out.print(" ");
            
            letra++; 
            repeticiones += 2; 
            contador++; 
        }
    }
}

