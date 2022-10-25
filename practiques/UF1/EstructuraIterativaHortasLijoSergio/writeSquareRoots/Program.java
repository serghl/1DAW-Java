/*
 * Program.java        7/11/21
 *
 *  Escribe una secuencia de raices cuadradas entre n1 y n2
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     *  
     * @param n1 an int 
     * @param n2 an int 
     */ 
    public void writeSquareRoots(int n1, int n2) {  
        for  (int i = n1; i<= n2; i++) { 
            System.out.println( " Raiz Cuadrada de "+ i +" = " + Math.sqrt(i)); 
        }
    } 
}