package coleciones;

import java.util.*;

public class BaseBallSet {

	public Collection<Player> players;

	public BaseBallSet() {

	}

	public static void main(String[] args) {

		// Creo la colección de Strings y se la paso al baseballContainer, para que me
		// la transforme en lo que necesite
		Collection<String> listStrings = new LinkedList<String>();
		LinkedList<Player> players = new LinkedList<Player>();
		try {
			// Aqui lo llenamos con el otro método
			BaseBallContainers.fillAL(listStrings);
			// Llenamos el array de players?
			for (int i = 0; i < listStrings.size(); i++) {
				String parametros[] = ((LinkedList<String>) listStrings).get(i).split("\\t+");
				Player p = new Player(parametros[0], parametros[1], parametros[2], Integer.parseInt(parametros[3]));
				players.add(p);
			}
			// Lo ordenamos
			Collections.sort(players);
			// Lo printamos
			for (Player p : players) {
				System.out.println(
						p.getTeam() + " " + p.getName() + " hit " + p.getHr() + " home runs in " + p.getYear());
			}

		} catch (NumberFormatException e) {
			System.out.println("Problemas con el formato de DATA");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Problemas con un nulo?");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problemas con la legibilidad del archivo");
			e.printStackTrace();
		}
	}

	/*
	 * public void arrayPlayersAL(String[] data) {
	 * 
	 * System.out.println("------ARRAY LIST--------"); for (int i = 0; i <
	 * data.length; i++) { // TODO El puto galarraga, como le meto el
	 * "más de un espacio"?? el \\s{2,} no // funciona, algo asi? [\t| {2,}] String
	 * parametros[] = data[i].split("\\t+");
	 * 
	 * Player p = new Player(parametros[0], parametros[1], parametros[2],
	 * Integer.parseInt(parametros[3])); playersAL.add(p); }
	 * 
	 * 
	 * System.out.
	 * println("-----------Lista ArrayList ordenada por nombre (Compare.to) ---------"
	 * ); for (Player player : playersAL) { System.out.println(player.toString()); }
	 * }
	 * 
	 * public void arrayPlayersLL(String[] data) {
	 * 
	 * System.out.println("------LINKED LIST--------"); for (int i = 0; i <
	 * data.length; i++) { String parametros[] = data[i].split("\\t+"); Player p =
	 * new Player(parametros[0], parametros[1], parametros[2],
	 * Integer.parseInt(parametros[3])); // System.out.println(p.toString());
	 * playersLL.add(p); } System.out.println("--->" + playersLL.getClass()); //
	 * Aqui trampeamos un poco, creando un nuevo objeto de tipo coleccion para hacer
	 * // la comparación if (playersAL.getClass().equals((new
	 * java.util.ArrayList()).getClass())) { Collections.sort((ArrayList<Player>)
	 * playersAL); } else if (playersAL.getClass().equals((new
	 * java.util.LinkedList()).getClass())) { Collections.sort((LinkedList<Player>)
	 * playersAL); }
	 * 
	 * System.out.
	 * println("-----------Lista ArrayList ordenada por nombre (Compare.to) ---------"
	 * ); for (Player player : playersAL) { System.out.println(player.toString()); }
	 * }
	 */
}
