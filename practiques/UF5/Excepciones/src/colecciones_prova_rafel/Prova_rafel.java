/*
* Prova_rafel.java May 26, 2022
*
*
* ©Copyright 2022 Sergio Hortas <1hiaw.hortaslijosergio@gmail.com>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/

package colecciones_prova_rafel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Prova_rafel {

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		List l = new ArrayList();
		List l2 = new LinkedList();
		List l3 = new LinkedList<Poma>();
		LinkedList li4 = new LinkedList<Poma>();
		List l4 = li4;
		Collection<Poma> h3 = new HashSet<>();
		ArrayList a4 = new ArrayList<Poma>();
		Collection collection2 = a4;
		prova(l3);		
		prova(a4);
		prova2(a4);
		prova2(h3);
		//System.out.println(l3.getClass());
	}

	public static void prova(List l){
		if (l.getClass().equals((new java.util.ArrayList()).getClass())) {
			System.out.println("Soy un ArrayList");
		} else if (l.getClass().equals((new java.util.LinkedList()).getClass())) {
			System.out.println("Soy un LinkedList");
		}
	}

	public static void prova2(Collection c) {
		if (c.getClass().equals((new java.util.ArrayList()).getClass())) {
			System.out.println("Soy un ArrayList");
		} else if (c.getClass().equals((new java.util.LinkedList()).getClass())) {
			System.out.println("Soy un LinkedList");
		} else if (c.getClass().equals((new java.util.HashSet()).getClass())) {
			System.out.println("Soy un HashSet");
		}
	}

}
