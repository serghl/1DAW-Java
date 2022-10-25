/*
 * Program.java        22/10/21
 *
 * Calcula el tiempo de vuelo de un avión, en horas y minutos a partir de la distancia y la velocidad
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.Scanner;

public class ProgramTUI {
    public String rotationPeriod(double dist) {
       double period;
    }
    public static void main(String[] args) {
        int dist;
        int period;
        ProgramTUI p = new ProgramTUI();
        // Inicializamos el scanner
        Scanner s = new Scanner(System.in);
        // Introducimos la distancia
        System.out.println("¿A qué distancia se encuentra el satélite?");
        dist = s.nextInt();
        // Procesamos con el método
        period = p.rotationPeriod(dist);
        System.out.printf("El satélite tendrá un período de rotación de %s",period);
    }
}