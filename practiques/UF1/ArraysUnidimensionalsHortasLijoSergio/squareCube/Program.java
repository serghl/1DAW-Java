/*
 * Program.java        12/12/21
 *
 *  Eleva al cuadrado y al cubo los elementos de un array
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Program {
    
    /**
     * 
     * @param args not used
     * 
     */
    public void writeSquareCube (double[]a) {
        double resultado = 0;
        int i = 0;
        System.out.print("\n\n Escribe el cuadrado y el cubo de los elementos de un ARRAY  \n\n");        
        // Iniciamos el bucle con la longitud del array
        while (i < a.length) {      
            // Printamos cada numero del array
            System.out.printf("RESULTADOS DE %.2f\n",a[i]);
            System.out.printf("------------------\n");
            // Hacemos un ciclo en cada número para hallar el cuadrado y el cubo
            for (int x = 1; x <= 3; x++) {                
                // Lo elevamos a la potencia correspondida en cada vuelta del ciclo
                resultado = Math.pow(a[i],x);
                System.out.printf("%.2f elevado a %d es igual a %.2f\n",a[i],x,resultado);
            }
            // Sumamos uno a la iteración
            i++;
            System.out.println();
        }        
    }
}

