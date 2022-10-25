/*
 * Program.java        15/12/21
 *
 * Un programa que demanda y clasifica las notas de 35 alumnos de una clase
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.Arrays; 

import java.util.Scanner;

public class ProgramTUI {
    
    /**
     * 
     * @param args not used
     * 
     */
    
    public static void main(String[] args) {
        int nota;
        int[] insuficiente; 
        insuficiente = new int[34];
        int contadorInsuficiente = 1;
        int[] aprobado;
        aprobado = new int[34];
        int contadorAprobado = 1;
        int[] bien;
        bien = new int[34];
        int contadorBien = 1;
        int[] notable;
        notable = new int[34];
        int contadorNotable = 1;
        int[] excelente;
        excelente = new int[34];
        int contadorExcelente = 1;
        
        Scanner s = new Scanner(System.in);
        System.out.print("\n\n GRADES \n\n");        
        // Empezamos con la lista de alumnos
        for (int i = 1; i <= 35; i++) {
            // Preguntamos por las alumno y las vamos almacenando en el array
            System.out.printf("¿Nota del alumno %d?", i);
            nota = s.nextInt();
            // A su vez las clasificamos, añadimos el numero del alumno en cada array de calificaciones
            // Con el contador, definimos la posicion del array que rellenamos
            if (nota >= 0 && nota < 5) {
                insuficiente[contadorInsuficiente] = i;
                contadorInsuficiente++;
            } else if (nota >= 5 && nota < 6) {
                aprobado[contadorAprobado] = i;
                contadorAprobado++;
            } else if (nota >= 6 && nota < 7) {
                bien[contadorBien] = i;
                contadorBien++;
            } else if (nota >= 7 && nota < 9) {
                notable[contadorNotable] = i;
                contadorNotable++;
            } else {
                excelente[contadorExcelente] = i;
                contadorExcelente++;;
            }
        }
        // Finalmente printamos las notas en cada categoria, creando un bucle para recorrer cada posicion
        // del array NO VACIA
        System.out.printf("\n------ CLASIFICACIÓN DE NOTAS -------\n");
        
        System.out.printf("\nLos alumnos que tienen un Insuficiente son : ");
        for (int i = 1; i < contadorInsuficiente; i++) {
            System.out.printf("%d - ",insuficiente[i]);
        }
        System.out.printf("\nLos alumnos que tienen un Aprobado son : ");
        for (int i = 1; i < contadorAprobado; i++) {    
            System.out.printf("%d - ",aprobado[i]);
        }
        System.out.printf("\nLos alumnos que tienen un Bien son : ");
        for (int i = 1; i < contadorBien; i++) {    
            System.out.printf("%d - ",bien[i]);
        }
        System.out.printf("\nLos alumnos que tienen un Notable son : ");
        for (int i = 1; i < contadorNotable; i++) {    
            System.out.printf("%d - ",notable[i]);
        }
        System.out.printf("\nLos alumnos que tienen un Excelente son : ");
        for (int i = 1; i < contadorExcelente; i++) {    
            System.out.printf("%d - ",excelente[i]);
        }
    }
}

