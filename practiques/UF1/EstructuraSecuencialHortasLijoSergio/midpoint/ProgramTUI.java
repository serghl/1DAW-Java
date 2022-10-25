/*
 * Program.java        19/10/21
 *
 * Calcula el punto medio de dos puntos introducidos por teclado, a partir de sus coordenadas
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
     * @param x1 an double number
     * @param x2 an double number
     * @param y1 an double number
     * @param y2 an double number
     * @returns two double number
     */
    public double average2(double primCor, double segCor) {
        double midpoint;
        // Calculamos la media
        midpoint = (primCor + segCor) / 2;
        return midpoint;
    }
    public static void main(String[] args) {
        // Iniciamos las variables de este método
        double x1;
        double y1;
        double x2;
        double y2;
        double primCor;
        double segCor;
        ProgramTUI p = new ProgramTUI();
        // Inicializamos el scanner
        Scanner s = new Scanner(System.in);
        // Introducimos los valores
        System.out.println("Valor de la coordenada x1?");
        x1 = s.nextDouble();
        System.out.println("Valor de la coordenada y1?");
        y1 = s.nextDouble();
        System.out.println("Valor de la coordenada x2?");
        x2 = s.nextDouble();
        System.out.println("Valor de la coordenada y2?");
        y2 = s.nextDouble();
        // Procesamos con el average2
        primCor = p.average2(x1, x2);
        segCor = p.average2(y1, y2);
        System.out.printf("El punto medio de las coordenadas introducidas es :\n\n %18.2f - %2.2f\n", primCor, segCor);
    }
}