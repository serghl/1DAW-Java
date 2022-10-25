package part3;

import java.io.File;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import finchRobot.Finch;
import part1.Reader;

public class MazeDriver {

	static File maze1;
	static DFSMazeSolver dfs;
	static Maze maze;
	static Finch finch;

	public static void main(String[] args) throws Exception {
		Maze maze = null;
		Finch f1 = new Finch();
		DFSMazeSolver dfs = null;
		boolean found = false;
		int option = 0;
		String mazeChoice = "";
		System.out.println("---------------------------------------");
		System.out.println("--Bienvenido a FINCH - PART3 - DFS ----");
		while (!found) {
			System.out.println("---------------------------------------");
			System.out.println("-----¿Qué acción quieres ejecutar?-----");
			System.out.println("--------------------------------------");
			System.out.println("- 1 -> Carga laberinto");
			System.out.println("- 2 -> Visualiza el camino");
			System.out.println("- 3 -> Sal del laberinto");
			System.out.println("- 0 -> Salir");
			Scanner s = new Scanner(System.in);
			option = s.nextInt();
			try {

				switch (option) {
				case 1:
					System.out.println("------GENERADOR DE LABERINTOS------");
					System.out.println();
					System.out.println("https://www.dcode.fr/maze-generator");
					System.out.println();
					System.out.println("-----------------------------------");
					System.out.println("Lista de laberintos :");
					File f = new File("./src/orders/mazes/");
					String[] pathDir;
					pathDir = f.list();
					for (int i = 0; i < pathDir.length; i++) {
						System.out.println(pathDir[i]);
					}
					System.out.println("¿Qué laberinto quieres cargar?");
					// Doble carga por el carro de buffer?
					mazeChoice = s.nextLine();
					mazeChoice = s.nextLine();
					String fileText = ("./src/orders/mazes/" + mazeChoice);
					// Crea el maze y el dfs a partir de la eleccion (no funciona bien por el metodo maze)
					maze = new Maze(fileText, f1);
					dfs = new DFSMazeSolver(maze);

					System.out.println("Laberinto Cargado :\n");
					// Printa el laberinto
					System.out.println(maze.toString());		
					break;
				case 2:
					// Resuelve el laberinto, pasando el dfs
					maze.insertPath(dfs.solve());
					// Printa EL CAMINO RESUELTO
					System.out.println("Laberinto resuelto:");
					System.out.println();
					maze.toString2();
					break;
				case 3:
					maze.finchPath();
					break;
				}
			} catch (NullPointerException e) {
				System.out.println("Ya la estamos liando");
			}
		}
	}
}
