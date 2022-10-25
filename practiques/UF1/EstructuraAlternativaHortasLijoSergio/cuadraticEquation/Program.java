/*
 * Program.java        28/10/21
 *
 *  Determina el tipo de triangulo
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    /**
     * Calculates the solutions of a quadratic equiation. 
     * 
     * @param a the first parameter of the equation
     * @param b the first parameter of the equation
     * @param c the first parameter of the equation
     * 
     * @return "No té solució" if there are no solutionas, "x = sol1", where sol1 
     * is the solution, if there is only one solution and "x1 = sol1, x2 = sol2", 
     * where sol1 and sol2 are the solution, if there are two solutions
     * 
     */
    
    public int numberOfSolutions(double a,double b, double c) {
        // Si el discriminante es negativo, no hay solucion
        // Si el discriminante es 0, solo hay una solucion
        // Si el discriminante es mas de cero y no negativo, hay dos
        // El discriminante es lo que va dentro de la raiz
        double disc = b * b - 4 * a * c;
        int x ;
        if (disc == 0) {
            x = 1;
        } else if ( disc > 0) {
            x = 2;
        } else {
            x = 0;
        }   
        return x;
    }
    
    public String calculateSolution(double a,double b, double c) {
        // Si el discriminante es negativo, no hay solucion
        // Si el discriminante es 0, solo hay una solucion
        // Si el discriminante es mas de cero y no negativo, hay dos
        // El discriminante es lo que va dentro de la raiz
        double x1, x2;
        double disc = b * b - 4 * a * c;
        String resultado;
        if (numberOfSolutions(a,b,c) == 0) {
            resultado = "No hay solucion";
        } else if (numberOfSolutions(a,b,c) == 1) {
            x1 = -b / (2 + a);
            resultado = "X = 2" + x1;
        } else {
            x1 = (-b + Math.sqrt(disc)) / (2 * a);
            x2 = (-b - Math.sqrt(disc)) / (2 * a);
            resultado = "x1 =" + x1 + " x2 = " +x2;
        } 
        return resultado;
    }
}


