/*
 * Program.java        23/11/21
 *
 * A partir de un dividendo y su divisor, calcula el cociente y el residuo
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     * @n1 an int to be add
     *  
     */ 
    public String divide(int n1, int n2) {
        // Asignamos variables, importante un tempo para n1 si queremos el residuo
        int residuo = 0;
        int cociente = 0;
        int temp = n1;
        // Restamos con un bucle hasta que el residuo sea menor o igual que el dividendo
            while (temp >= n2) {
            temp = temp - n2;
            cociente++;   
        }
        residuo = n1 - n2 * cociente;
       
        return "El cociente es "+ cociente +" y el residuo es "+residuo;    
    }
}




