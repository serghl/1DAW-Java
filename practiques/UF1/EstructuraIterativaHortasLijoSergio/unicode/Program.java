/*
 * Program.java        12/11/21
 *
 *  Escribe una secuencia ascendiente del codigo UNIcode
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
    public void writeUnicode(int n1, int n2) { 
        int i = n1;
        while (i < n2) { 
            System.out.printf("unicode %d ---> %c\n",i ,(char)i); 
            i++; 
        }
    }
    public void writeUnicode2(int n1, int n2) { 
        for (int i = n1; i <= n2 ; i++) { 
            System.out.printf("unicode %d ---> %c\n",i ,(char)i);  
        }
    }
}