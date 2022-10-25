/*
 * Program.java        29/11/21
 *
 * Clasifica notas de unos alumnos en diferentes grados
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Scanner;

public class ProgramTUI {
    
    /**
     * 
     * @param args not used
     * 
     */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nota = 0;
        int md = 0;
        int ins = 0;
        int suf = 0;
        int b = 0; 
        int n = 0;
        int ex = 0 ;
        System.out.printf("\n\nGRADES\n\n");        
        // Solicitamos la nota y la asignamos a la lista correspondiente   
        System.out.print("Cual es la nota Obtenida?");
            nota = s.nextInt();
        while (nota != -1){                        
            // Dependiendo de la nota obtenida, sumamos al contador correspondiente
            if (nota >= 0 && nota < 3) {
                md++;                
            } else if (nota >= 3 && nota < 5) {
                ins++;                
            } else if (nota >= 5 && nota < 6) {
                suf++;                
            } else if (nota >= 6 && nota < 7) {
                b++;
            } else if (nota >= 7 && nota < 9) {
                n++;
            } else if (nota >= 9 && nota <= 10) {
                ex++;
            }
            System.out.print("Siguiente nota?");
            nota = s.nextInt();
        }
        // Imprimimos los resultados
        System.out.printf("\nRESUMEN DE NOTAS OBTENIDAS:\n");
        System.out.printf("Calificaciones MD --> %d\n",md);
        System.out.printf("Calificaciones I --> %d\n",ins);
        System.out.printf("Calificaciones S --> %d\n",suf);
        System.out.printf("Calificaciones B --> %d\n",b);
        System.out.printf("Calificaciones N --> %d\n",n);
        System.out.printf("Calificaciones EX --> %d\n",ex);
    }
}