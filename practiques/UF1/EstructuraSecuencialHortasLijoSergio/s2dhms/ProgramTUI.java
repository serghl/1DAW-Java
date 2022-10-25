/*
 * Program.java        20/10/21
 *
 * Traduce a un formato de D:H:M:S , un total de segundos introducidos
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
    public String s2dhms(int segIni) {
        int day;
        int hour;
        int min;
        int seg;
        day = segIni / 3600 / 24;
        hour = segIni / 3600 % 24;
        min = segIni % 3600 / 60;
        seg = segIni % 3600 % 60; 
        return +segIni+" segundos, serán : "+day+" días ,"+hour+" horas,"+min+" minutos y "+seg+ " segundos.";
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
        trad = p.s2dhms(segIni);
        System.out.printf(trad);
    }
}