/*
 * Program.java        8/10/21
 *
 * Calcula el precio final de un producto, teniendo en cuenta el IVA (21%), y el descuento (en %) aplicados
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param precio an int
     * @param descuento an int
     * @return the final price
     */
    public double price (double precio, int descuento) {
        // Declaramos las variable de precio inicial con iva y del precio final
        double precioInicial;
        double precioFinal;
        double descuentoFinal;
        // Calculamos el precio inicial, con el iva aplicado
        precioInicial = precio + (precio * 0.21);
        // Calculamos total del descuento.
        descuentoFinal = precioInicial * descuento/100;
        // Aplicamos el descuento
        precioFinal = precioInicial - descuentoFinal;
        return precioFinal;
    }
}