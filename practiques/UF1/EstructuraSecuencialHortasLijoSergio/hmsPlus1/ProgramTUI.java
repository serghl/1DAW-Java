/*
 * Program.java        22/10/21
 *
 * A partir de 3 enteros(H:M:S), suma un segundo y muestra el resultado
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
     * @param hour an int number
     * @param min an int number
     * @param se an int number
     * @return an String
     */
    public String hmsPlus1(int hour, int min, int seg) {
        int resultado;
        int hourN;
        int minN;
        int segN;
        int segTotal;
        segTotal =  seg + ( min * 60) + (hour *3600);
        segTotal++;
        hourN = segTotal / 3600;
        minN = segTotal % 3600 / 60;
        segN = segTotal % 3600 % 60;
        return hourN + ":h " + minN + ":m "+ segN + ":s";
    }
    public static void main(String[] args) {
        String plus1;
        int hour;
        int min;
        int seg;
        ProgramTUI p = new ProgramTUI();
        // Inicializamos el scanner
        Scanner s = new Scanner(System.in);
        // Introducimos los segundos
        System.out.println("¿Cuántas horas?");
        hour = s.nextInt();
        System.out.println("¿Cuántos minutos?");
        min = s.nextInt();
        System.out.println("¿Cuántos segundos?");
        seg = s.nextInt();
        // Procesamos con los métodos
        plus1 = p.hmsPlus1(hour,min,seg);
        System.out.printf("El resultado final es de %s",plus1);
    }
}