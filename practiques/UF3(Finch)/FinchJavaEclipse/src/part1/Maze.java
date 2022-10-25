/*
 * Maze.java        1.0 Feb 1, 2022
 *
 * Models the program.
 *
 * Copyright 2022 Rafel Botey Agusti <rbotey@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package part1;

import java.util.Scanner;

import finchRobot.Finch;

public class Maze {

	public static void main(String[] args) {
		Finch f1 = new Finch();
		FinchActionList fa1 = new FinchActionList("./src/orders/orders.txt");
		boolean lock = false;
		int option = 0;
		int choice = 0;
		int addList = 0;
		int milisec = 0;
		int r = 0;
		int g = 0;
		int b = 0;
		int moveLoopChoice = 0;
		char movement;
		int movement2 = 0;

		System.out.println("----------------------------------");
		System.out.println("--Bienvenido a FINCH -UF3 2022----");
		while (!lock) {
			System.out.println("----------------------------------");
			System.out.println("--¿Qué acción quieres ejecutar?---");
			System.out.println("----------------------------------");
			System.out.println("- 1 -> Ejecutar una o varias òrdenes");
			System.out.println(
					"- 2 -> Ejecuta todas las órdenes almacenadas (Introduce la pausa entre cada una, en segundos)");
			System.out.println("- 3 -> Importar ordenes de un archivo");
			System.out.println("- 4 -> Exportar ordenes a un archivo");
			System.out.println("- 5 -> Listar las ordenes por pantalla");
			System.out.println("- 6 -> Borrar un archivo con la lista de ordenes");
			System.out.println("- 7 -> Borrar una orden de la lista");
			System.out.println("- 8 -> Borrar todas las órdenes ");
			System.out.println("- 9 -> Music Time!");
			System.out.println("- 0 -> Salir");
			Scanner s = new Scanner(System.in);
			option = s.nextInt();
			switch (option) {
			case 1:
				boolean moveLoop = false;
				System.out.println("¿Què tipo de acción? (M)ove / (N)ose)");
				movement = s.next().charAt(0);
				while (!moveLoop) {
					if (movement == 'M' || movement == 'm') {
						System.out.println("¿ Quieres avanzar (1), girar a la izquierda (2) o a la derecha (3) ? ");
						movement2 = s.nextInt();
						if (movement2 == 1) {
							FinchMove fm = new FinchMove("1000 150 150", f1);
							fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						} else if (movement2 == 2) {
							FinchMove fm = new FinchMove("1000 -90 90", f1);
							fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						} else if (movement2 == 3) {
							FinchMove fm = new FinchMove("1000 90 -90", f1);
							fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						}
					} else if (movement == 'N' || movement == 'n') {
						System.out.println("Introduce el valor R");
						r = s.nextInt();
						System.out.println("Introduce el valor G");
						g = s.nextInt();
						System.out.println("Introduce el valor B");
						b = s.nextInt();
						String nose = Integer.toString(r)+" "+Integer.toString(g)+" "+Integer.toString(b); 
						FinchNose fn = new FinchNose(nose, f1);
						fn.execute();
					} else {
						System.out.println("Por favor, introduce una orden válida!");
					}
					System.out.println("¿Quieres seguir ejecutando órdenes? (1 - Sí / 0 - No)");
					moveLoopChoice = s.nextInt();
					if (moveLoopChoice == 0) {
						moveLoop = true;
					}
				}
				break;
			case 2:
				System.out.println("¿Cuantos milisegundos de espacio entre cada órden?");
				milisec = s.nextInt();
				fa1.execute(milisec);
				break;
			case 3:
				fa1.importOrders();
				System.out.println("Órdenes importadas!");
				break;
			case 4:
				fa1.exportOrders();
				break;
			case 5:
				System.out.println("Listado de órdenes actuales: \n");
				fa1.displayOrders();
				break;
			case 6:
				System.out.println("¿Nombre del archivo que quieres eliminar? (Sin extension)?");
				String fileRemove = (s.nextLine()+".txt");
				break;
			case 7:
				fa1.displayOrders2();
				System.out.println("¿ Qué orden quieres borrar ? : \n");
				int remove = s.nextInt();
				fa1.getActions().remove(remove-1);
				System.out.println("Órden borrada!");
				break;
			case 8:
				fa1.removeOrders();
				System.out.println("Órdenes borradas!");
				break;
			case 9:
				f1.playTone(196, 100);
				f1.sleep(600);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(700);
				f1.playTone(196, 100);
				f1.sleep(600);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(300);
				f1.playTone(329, 300);
				f1.sleep(50);
				f1.playTone(349, 100);
				f1.playTone(392, 100);
				f1.sleep(50);
				f1.playTone(523, 600);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(50);
				f1.playTone(293, 300);
				f1.sleep(50);
				f1.playTone(329, 150);
				f1.playTone(343, 700);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(50);
				f1.playTone(392, 300);
				f1.sleep(50);
				f1.playTone(440, 100);
				f1.playTone(493, 100);
				f1.sleep(50);
				f1.playTone(698, 600);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(440, 300);
				f1.sleep(50);
				f1.playTone(493, 100);
				f1.playTone(523, 400);
				f1.sleep(50);
				f1.playTone(587, 400);
				f1.playTone(659, 400);
				f1.sleep(50);
				f1.playTone(329, 300);
				f1.playTone(349, 150);
				f1.playTone(392, 100);
				f1.sleep(50);
				f1.playTone(523, 600);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(50);
				f1.playTone(587, 300);
				f1.sleep(50);
				f1.playTone(659, 100);
				f1.playTone(698, 700);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(50);
				f1.playTone(392, 200);
				f1.sleep(50);
				f1.playTone(392, 150);
				f1.playTone(659, 400);
				f1.sleep(50);
				f1.playTone(587, 250);
				f1.sleep(50);
				f1.playTone(392, 150);
				f1.playTone(659, 400);
				f1.sleep(50);
				f1.playTone(587, 250);
				f1.sleep(50);
				f1.playTone(392, 150);
				f1.playTone(659, 400);
				f1.sleep(50);
				f1.playTone(587, 250);
				f1.sleep(50);
				f1.playTone(392, 150);
				f1.playTone(659, 200);
				f1.playTone(587, 150);
				f1.sleep(50); // BIS

				f1.playTone(329, 300);
				f1.sleep(50);
				f1.playTone(349, 100);
				f1.playTone(392, 100);
				f1.sleep(50);
				f1.playTone(523, 600);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(50);
				f1.playTone(293, 300);
				f1.sleep(50);
				f1.playTone(329, 150);
				f1.playTone(343, 700);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(50);
				f1.playTone(392, 300);
				f1.sleep(50);
				f1.playTone(440, 100);
				f1.playTone(493, 100);
				f1.sleep(50);
				f1.playTone(698, 600);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(440, 300);
				f1.sleep(50);
				f1.playTone(493, 100);
				f1.playTone(523, 400);
				f1.sleep(50);
				f1.playTone(587, 400);
				f1.playTone(659, 400);
				f1.sleep(50);
				f1.playTone(329, 300);
				f1.playTone(349, 150);
				f1.playTone(392, 100);
				f1.sleep(50);
				f1.playTone(523, 600);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(50);
				f1.playTone(587, 300);
				f1.sleep(50);
				f1.playTone(659, 100);
				f1.playTone(698, 700);
				f1.sleep(50);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.playTone(196, 100);
				f1.sleep(50);
				f1.playTone(392, 200);
				f1.sleep(50);
				f1.playTone(392, 150);
				f1.playTone(659, 400);
				f1.sleep(50);
				f1.playTone(587, 250);
				f1.sleep(50);
				f1.playTone(392, 150);
				f1.playTone(659, 400);
				f1.sleep(50);
				f1.playTone(587, 250);
				f1.sleep(50);
				f1.playTone(392, 150);
				f1.playTone(659, 400);
				f1.sleep(50);
				f1.playTone(587, 250);
				f1.sleep(50);
				f1.playTone(392, 150);
				f1.playTone(659, 200);
				f1.playTone(587, 150);

				break;
			case 0:
				lock = true;
				System.out.println("---CHAO!---");
				break;
			}
			if (!lock) {
				System.out.println("\n-----------------------------------------------");
				System.out.println("---¿Quieres hacer algo más?(1 - Sí / 0 - No)---");
				System.out.println("-----------------------------------------------");
				Scanner c = new Scanner(System.in);
				choice = c.nextInt();
				if (choice == 0) {
					lock = true;
					System.out.println("---CHAO!---");
				}
			}
		}
	}

}
