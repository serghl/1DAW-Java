/*
 * Program.java        12/12/21
 *
 *  Suma y escribe unos elementos determinados de un array
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
    public void sumFirstElements (int[]a, int x) {
        int resultado = 0;
        int i = 0;
        System.out.print("\n\n SUMFIRSTELEMENTS  \n\n");        
        // Iniciamos el bucle con la longitud del array
        while (i < x) {      
            // Printamos cada numero del array hasta llegar al tope de x
            System.out.println(a[i]);
            System.out.printf("---\n");
           // Lo sumamos al resultado final
            resultado = resultado + a[i];
           // Y avanzamos en el ciclo 
            i++;
        }   
        // Printamos la suma final
        System.out.printf("El resultado de la suma es %d \n",resultado);
    }
}

