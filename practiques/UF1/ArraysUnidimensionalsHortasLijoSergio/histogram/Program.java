/*
 * Program.java        21/1/22
 *
 *  Crea un histograma de pesos
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
    public String histogram (int[]pesos) {
        String resultado = "PES  | NUMERO DE PERSONAS \n";
        // Creamos un array donde almacenar los pesos
        int[]personas = new int[100];
        System.out.println("------ HISTOGRAM ------\n");
        // Ahora sumamos en cada posicion del array
        for (int i = 0; i < pesos.length; i++) {
            personas[pesos[i]]++;
        }
        // Printa el menú y los pesos != a 0
        for (int i = 0 ; i < personas.length ; i++) {
            if (personas[i] != 0) {
        // Aqui creamos un String cada vez que el numero es diferente a 0
                String cantidad = ""; 
                for (int j = 0; j < personas[i]; j++) {
        // Y le sumamos un asterisco por cada ocurrencia en ese peso
                    cantidad += "*";
                }
                resultado += "" + i +  "    | " + cantidad + "\n";
            }
        }
        return resultado;
    }
}
