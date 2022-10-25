/*
 * Program.java        7/11/21
 *
 *  Escribe una secuencia ascendente del codigo ASCII
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     *  Escribe una secuencia descendente del codigo ASCII
     *  
     * @param args not used 
     */ 
    public void writeASCII() { 
        int i = 0;
         while (i < 256) { 
            System.out.printf("%d -- %c\n",i, i); 
            i++; 
        }
    } 
    public void writeASCII2() { 
        int i; 
        for (i = 1; i <= 255; i++) { 
            System.out.printf("%d -- %c\n",i, i); 
        }
    } 
    
    
}