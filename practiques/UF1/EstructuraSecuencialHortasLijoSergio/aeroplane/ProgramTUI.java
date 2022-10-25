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
    public String flighTime(double dist, double speed) {
        double time;
        double timeSeg;
        int hour;
        int min;
        time = dist / speed * 3600;
        hour = (int)time / 3600;
        min = (int)time % 3600 / 60 ;
        return   hour +" Horas y " + min +" minutos" ;
    }
    public static void main(String[] args) {
        double dist;
        double speed;
        String flighTime;
        ProgramTUI p = new ProgramTUI();
        // Inicializamos el scanner
        Scanner s = new Scanner(System.in);
        // Introducimos los kilometros
        System.out.println("¿Cuántos kilómetros recorre el avión?");
        dist = s.nextDouble();
        // Introducimos la velocidad
        System.out.println("¿A qué velocidad va el avión (KMh) ?");
        speed = s.nextDouble();
        // Procesamos con el método
        flighTime = p.flighTime(dist,speed);
        System.out.printf("El avión tardará %s en realizar el vuelo",flighTime);
    }
}