package Poli_retos.SerieDeCaracteres;


public class SerieDeCaracter_05{
 //muestra la serie S5:  \  |  /    -   |   \  |  /    -   |    \  |  /    -   |  ....
    public void G4_SeriesDeCaracteres_SC5(int extension) {
        System.out.println("Serie de caractes 05");
        String [] patron;
        patron = new String[] {"\\","|","/"," -"," | "};
        System.out.println();
        for (int i = 0; i < extension; i++) {
            System.out.print(patron[i%5] + " ");
        }
       
    }
}
