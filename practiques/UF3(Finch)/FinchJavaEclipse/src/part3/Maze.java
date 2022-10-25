package part3;

import finchRobot.Finch;
import part1.FinchMove;
import part1.FinchNose;
import part1.Reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Maze {
	private static final int ROAD = 0;
	private static final int WALL = 1;
	private static final int START = 2;
	private static final int EXIT = 3;
	private static final int PATH = 4;
	private Finch finch;
	private static int[][] maze;
	private static String text;
	private Coordinate start;
	private Coordinate end;
	private List<Coordinate> exitPathCoord;

	// TODO no entiendo esto, le paso un file llamado maze como argumento? no
	// suplanta a la matriz?
	// La unica manera que he encontrado de arreglarlo es cambiando el metodo
	// initializeMaze , int[][], en vez de void

	public Maze(String text, Finch finch) {
		this.finch = finch;
		this.text = text;
		this.maze = initializeMaze(text);
	}

	public int[][] initializeMaze(String text) {
		Reader r = new Reader(text);
		Boolean found = false;
		int j = 0;
		String orderLine = r.readLine();
		maze = new int[getStringRows()][orderLine.length()];
		while (orderLine != null) {
			for (int i = 0; i < orderLine.length(); i++) {
				// Aqui vamos leyendo el mapa
				if (orderLine.charAt(i) == '#') {
					maze[j][i] = WALL;
				} else if (orderLine.charAt(i) == 'S') {
					maze[j][i] = START;
				} else if (orderLine.charAt(i) == 'E') {
					maze[j][i] = EXIT;
				} else if (orderLine.charAt(i) == ' ') {
					maze[j][i] = ROAD;
				}
			}
			orderLine = r.readLine();
			j++;
		}
		r.close();
		return maze;
	}

	public int getHeight() {
		return this.maze.length;
	}

	public int getWidth() {
		return this.maze[0].length;
	}

	
	public int getStringRows() {
		Reader r = new Reader(this.text);
		String order = r.readLine();
		int contador = 0;
		while (order != null) {
			contador++;
			order = r.readLine();
		}
		return contador;
	}


	public Coordinate getEntry() {
		Coordinate entry = new Coordinate(0, 0);
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == START) {
					entry = new Coordinate(i, j);
				}
			}
		}
		return entry;
	}

	public Coordinate getExit() {
		Coordinate exit = new Coordinate(0, 0);
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (maze[i][j] == EXIT) {
					exit = new Coordinate(i, j);
				}
			}
		}
		return exit;
	}

	public boolean isExit(int x, int y) {
		boolean exit = false;
		if (this.maze[x][y] == EXIT) {
			exit = true;
		}
		return exit;
	}

	public boolean isStart(int x, int y) {
		boolean start = false;
		if (this.maze[x][y] == START) {
			start = true;
		}
		return start;
	}

	public boolean isWall(int row, int col) {
		boolean wall = false;
		if (this.maze[row][col] == WALL) {
			wall = true;
		}
		return wall;
	}

	public void insertPath(List<Coordinate> path) {
		exitPathCoord = new ArrayList<Coordinate>();
		int x = 0;
		int y = 0;
		for (Coordinate c : path) {
			x = c.getX();
			y = c.getY();
			if (this.maze[x][y] == START) {
				this.maze[x][y] = START;
			} else if (this.maze[x][y] == EXIT) {
				this.maze[x][y] = EXIT;
			} else {
				this.maze[x][y] = PATH;
			}
			exitPathCoord.add(new Coordinate(x, y));
		}
		// Imprimir las coordenadas del camino de salida
		System.out.println("Coordenadas del path de salida:");
		for (Coordinate c : exitPathCoord) {
			System.out.println("X = " + c.getX() + " Y = " + c.getY());
		}
	}

	// Printa el laberinto
	public String toString() {
		for (int[] fila : maze) {
			for (int i : fila) {
				if (i == WALL) {
					System.out.print('#');
				} else if (i == START) {
					System.out.print('S');
				} else if (i == EXIT) {
					System.out.print('E');
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		return "";
	}

	// Printa el laberinto con la salida resuelta
	public String toString2() {
		for (int i = 0; i < this.maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				if (maze[i][j] == WALL) {
					System.out.print("#");
				} else if (maze[i][j] == START) {
					System.out.print("S");
				} else if (maze[i][j] == PATH) {
					System.out.print(".");
				} else if (maze[i][j] == EXIT) {
					System.out.print("E");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		return "";

	}

	// Crea lista de ordenes de salida

	public List<FinchMove> finchPath() {

		List<FinchMove> moves = new ArrayList<FinchMove>();
		int tempX = 0;
		int tempY = 0;
		// Necesito saber la orientación del finch para calcular el siguiente movimiento
		char orientacion = 'S';
		// Marcamos como X e Y los puntos de la casilla de salida, la posicion actual
		int x = exitPathCoord.get(0).getX();
		int y = exitPathCoord.get(0).getY();
		for (int i = 1; i < exitPathCoord.size(); i++) {
			// Cogemos las coordenadas del siguiente punto del path de salida
			tempX = exitPathCoord.get(i).getX();
			tempY = exitPathCoord.get(i).getY();
			// Ahora definimos los movimientos
			// Si mira hacia el sur
			if (orientacion == 'S') {
				// Incrementa X, e Y igual sigue recto hacia abajo
				if (tempX > x && tempY == y) {
					System.out.println("Recto");		
					x = tempX;
					y = tempY;
					// Incrementa Y , gira a la izquierda y avanza (cambia orientacion a Este)
				} else if (tempX == x && tempY > y) {
					System.out.println("Gira izquierda");
					System.out.println("Recto");
					orientacion = 'E';
					x = tempX;
					y = tempY;
					// Disminuye Y , gira a la derecha y avanza (cambia orientacion a Oeste)
				} else if (tempX == x && tempY < y) {
					System.out.println("Gira derecha");
					System.out.println("Recto");
					orientacion = 'O';
					x = tempX;
					y = tempY;
				}
			} else if (orientacion == 'E') {
				// Incrementa Y, y X igual ,sigue recto hacia este
				if (tempX == x && tempY > y) {
					System.out.println("Recto");
					x = tempX;
					y = tempY;
					// Incrementa X e Y sigue igual, gira derecha y avanza (Cambia orientacion a
					// Sur)
				} else if (tempX > x && tempY == y) {
					System.out.println("Gira derecha");
					System.out.println("Recto");
					orientacion = 'S';
					x = tempX;
					y = tempY;
					// Disminuye X e Y sigue igual, gira izquierda y avanza (Cambia orientacion a
					// Norte)
				} else if (tempX < x && tempY == y) {
					System.out.println("Gira izquierda");
					System.out.println("Recto");
					orientacion = 'N';
					x = tempX;
					y = tempY;
				}
			} else if (orientacion == 'O') {
				// Disminuye Y, y X igual ,sigue recto hacia oeste
				if (tempX == x && tempY < y) {
					System.out.println("Recto");
					x = tempX;
					y = tempY;
					// Incrementa X e Y sigue igual, gira izquierda y avanza (Cambia orientacion a
					// Sur)
				} else if (tempX > x && tempY == y) {
					System.out.println("Gira izquierda");
					System.out.println("Recto");
					orientacion = 'S';
					x = tempX;
					y = tempY;
					// Disminuye X e Y sigue igual, gira derecha y avanza (Cambia orientacion a
					// Norte)
				} else if (tempX < x && tempY == y) {
					System.out.println("Gira derecha");
					System.out.println("Recto");
					orientacion = 'N';
					x = tempX;
					y = tempY;
				}
			} else if (orientacion == 'N') {
				// Disminuye x, sigue recto hacia el norte
				if (tempX < x && tempY == y) {
					System.out.println("Recto");
					x = tempX;
					y = tempY;
					// Mantiene X pero incrementa Y, gira derecha y cambia a Este
				} else if (tempX == x && tempY > y) {
					System.out.println("Gira Derecha");
					System.out.println("Recto");
					orientacion = 'E';
					x = tempX;
					y = tempY;
					// Mantiene X pero disminuye Y, gira izquierda y cambia a Oeste
				} else if (tempX == x && tempY < y) {
					System.out.println("Gira Izquierda");
					System.out.println("Recto");
					orientacion = 'O';
					x = tempX;
					y = tempY;
				}
			}
		}

		// PRINTAR LA MATRIZ DE SALIDA, el mapa entero con digitos
		/*
		 * for (
		 * 
		 * int i = 0; i < maze.length; i++) { for (int j = 0; j < maze[0].length; j++) {
		 * System.out.print(maze[i][j]); } System.out.println(); }
		 */

		return null;

	}

	public void executeFinchPath() {
		// TO DO
	}

}
