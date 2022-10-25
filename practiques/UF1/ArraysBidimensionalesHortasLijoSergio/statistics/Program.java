/*
 * Program.java        25/1/22
 *
 * Calcula y muestra las estadisticas de estudio de un alumno
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Arrays;

public class Program {
    
    /**
     * 
     * @param meses[] an array of Strings
     * @param asignaturas[] an array of Strings
     * @param horasEstudio[][] an 2Darray of int
     *
     */
    
    public void statistics(String[]meses, String[]asignaturas, int[][]horasEstudio) {
        int[] totalHorasAsignatura = new int [6];
        int[] totalHorasMensuales = new int[12];
        int totalHorasTodo = 0;
        System.out.print("\n\n --- STATISTICS --- \n\n");                
        // Imprimo un espacio para cuadrarlo
        System.out.printf("      ");
        // Imprimimos el indice de los meses
        for ( int i = 0; i < meses.length; i ++) {
            System.out.printf("| %s ",meses[i]);
        }
        // No sé como meterle el total al final, hago la trampa del "Mes" - System.out.print("| TOTAL");
        // SEPARADOR
        System.out.print("------------------------------------------------------");                
        System.out.print("------------------------------------------------------");                
        System.out.println("-------------------------------------------------------------"); 
        // Imprimimos las filas correspondientes a cada asignatura
        for ( int i = 0; i < horasEstudio.length; i ++) {
            // Un alineamiento a la derecha, para encuadrar
            System.out.printf("%4s  |",asignaturas[i]);
            // Aqui printamos las horas dedicadas a cada asignatura,cada columna corresponde a un mes
            for (int j = 0; j < 12; j++) {
                System.out.printf("      %s     |",horasEstudio[i][j]);            
                // Sumamos las horas de esta asignatura al total de la asignatura(fila)
                totalHorasAsignatura[i] += horasEstudio[i][j];
                // Lo mismo pero al total mensual(columna)
                totalHorasMensuales[j] += horasEstudio[i][j];
            }
            // Aqui printamos el total anual de horas de cada asignatura
            System.out.printf("   %d",totalHorasAsignatura[i]);  
            System.out.print("\n");  
        }
        // SEPARADOR
        System.out.print("------------------------------------------------------");                
        System.out.print("------------------------------------------------------");                
        System.out.println("-------------------------------------------------------------"); 
        
        // Imprimimos las horas mensuales
        System.out.printf("TOTAL |");
        for (int i = 0; i < 12; i++) {
            System.out.printf("     %d     |",totalHorasMensuales[i]);
            totalHorasTodo += totalHorasMensuales[i];
        }
        System.out.printf("  %d\n",totalHorasTodo);
    }
        
        public static void main(String[]args) {
            Program p = new Program();
            // Definimos los Strings de asignaturas y meses
            String[]meses = {"   Enero  ","  Febrero ","   Marzo  ","   Abril  ","   Mayo   ","   Junio  ","  Julio   ",
                "  Agosto  ","Septiembre","  Octubre "," Noviembre"," Diciembre"};
            String[]asignaturas = {"SO","PROG","BBDD","XML","FOL","EMP"};
            // Aqui en un array bidimensional, definimos las horas de estudio, cada fila es una asignatura
            int[][] horasEstudio = {
                {3,6,2,5,4,7,8,7,5,4,9,3},
                {3,5,2,7,5,6,7,8,3,4,2,4},
                {8,5,4,3,6,4,5,3,5,4,2,5},
                {1,3,4,0,6,7,4,0,5,2,4,3},
                {2,4,3,6,7,3,0,2,3,1,4,2},
                {3,1,5,3,8,0,9,3,2,1,3,2}
            };
            p.statistics(meses,asignaturas,horasEstudio);
        }
    }
    
    
