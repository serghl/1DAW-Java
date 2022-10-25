/*
 * Gat.java 		
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

package animals;

/**
 * Classe que simula un gat.
 * 
 * @author Mònica Ramírez Arceda
 * @version 14/04/2010
 * 
 */
public class Gat extends Animal {

    public Gat(String nom, int edat) {
        super(nom, edat);
    }

    @Override
    public String parla() {
        return "meu meu";
    }

    public String ronroneja() {
        return "rrrrrrr";
    }

}
