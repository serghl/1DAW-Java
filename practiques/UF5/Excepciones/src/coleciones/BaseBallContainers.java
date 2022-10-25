package coleciones;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class BaseBallContainers {

	public BaseBallContainers() {
	}

	public static void fillAL(java.util.Collection<java.lang.String> collection) {
		/* MANERA ANTIGUA
		   LinkedList<String> playersAL = new ArrayList<String>();
		   Collections.addAll(playersAL, collection );
		   System.out.println(playersAL);
		 * 
		 * Es asi de simple??
		*/
		Collections.addAll(collection, DataPlayerAL.DATA);
	}

	public static void fillNL(java.util.Collection<java.lang.String> collection) {
		/*
		LinkedList playersAL = new LinkedList<String>();
		Collections.addAll(playersAL, collection );
		System.out.println(playersAL);
		*/
		Collections.addAll(collection, DataPlayerNL.DATA);
	}
}


//Aqui trampeamos un poco, creando un nuevo objeto de tipo coleccion para hacer
		// la comparación

/*
		if (playersAL.getClass().equals((new java.util.ArrayList()).getClass())) {
			Collections.sort((ArrayList<Player>) playersAL);
		} else if (playersAL.getClass().equals((new java.util.LinkedList()).getClass())) {
			Collections.sort((LinkedList<Player>) playersAL);
		}
		// Echar un ojo al concepto de "Reflection", que nos ayudaría a solucionar esto
*/