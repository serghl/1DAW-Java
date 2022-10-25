/*
 * Program.java        20/10/21
 *
 * Traduce a un formato de H:M:S , un total de segundos introducidos
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
     * @param segIni an int number
     * @return an int
     */
    public String s2hms(int segIni) {
        int hour;
        int min;
        int seg;
        hour = segIni / 3600;
        min = segIni % 3600 / 60;
        seg = segIni % 3600 % 60; 
        return "h:" + hour + " m:" + min +" s:"+ seg;
    }
    public static void main(String[] args) {
        String trad;
        int segIni;
        ProgramTUI p = new ProgramTUI();
        // Inicializamos el scanner
        Scanner s = new Scanner(System.in);
        // Introducimos los segundos
        System.out.println("¿Cuántos segundos quieres traducir?");
        segIni = s.nextInt();
        // Procesamos con los métodos
        trad = p.s2hms(segIni);
        System.out.printf("El tiempo introducido es un total de %s",trad);
    }
}
