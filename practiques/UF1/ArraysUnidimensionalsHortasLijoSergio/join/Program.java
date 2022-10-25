/*
 * Program.java        19/12/21
 *
 *  Une los valores de dos arrays y añadeselos a un tercero
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Program {
    
    /**
     * 
     * @param int[]a an array of int
     * @param int[]b an array of int
     * 
     * @return the join of both arrays
     */
    public int[] join(int[] a, int[] b) {
        int i = 0;
        int contadorSuma = 0;
        // Creamos un tercer array con la suma de los dos argumentos
        int[] suma;
        suma = new int[a.length + b.length];   
        System.out.print("\n\n JOIN \n\n");        
        // Iniciamos un recorrido del array A y se lo asignamos al array suma
        for (int x : a) {
            suma[contadorSuma] = a[i];
            contadorSuma++;
            i++;
        }
        // Reseteamos i a 0
        i = 0;
        // Iniciamos un recorrido del array B y se lo asignamos al array suma
        for (int x : b) {
            suma[contadorSuma] = b[i];
            contadorSuma++;
            i++;
        }
        return suma;
    }
    
    // Aqui la segunda manera de hacerlo con el metodo System.arraycopy
    
    // SINTAXIS = System.arraycopy(Object src, int srcPos, Object destino, int destposicion, int length)
    
    public int[] join2(int[] a, int[] b) {
        // Creamos un tercer array con la suma de los dos argumentos
        int[] suma;
        suma = new int[a.length + b.length];   
        System.out.print("\n\n JOIN \n\n");        
        // Copiamos con el metodo System.arraycopy
        System.arraycopy(a, 0, suma, 0, a.length);
        // Aqui con el a.length, indicamos que copie a partir del final de a
        System.arraycopy(b, 0, suma, a.length, b.length);
        // Retornamos el array final concatenado
        return suma;
    }
}
