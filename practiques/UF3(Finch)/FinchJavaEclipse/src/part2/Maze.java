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

package part2;

import finchRobot.Finch;
import part1.FinchAction;
import part1.FinchActionList;
import part1.FinchMove;

import java.sql.*;
import java.util.Scanner;

public class Maze {

	public static void main(String[] args) {
		Finch f1 = new Finch();
		FinchActionList fa1 = new FinchActionList("");
		boolean lock = false;
		int addList = 0;
		int moveLength = 0;
		int option = 0;
		int choice = 0;
		int addOrder2 = 0, addOrder3 = 0, addOrder4 = 0;
		char move;
		int añadirOrden1 = 0;
		int añadirOrden2 = 0;
		int añadirOrden3 = 0;
		String añadirOrden = "";
		String addOrder1 = "";
		String order = "";
		String addOrder = "";
		String sentence = "";
		String sentence2 = "";
		String insertSQL = "";
		String nombreTabla = "";
		String newTable = "";
		String execTabla = "";
		String noseChoice = "";
		String newBBDD = "";
		String[] ordersSQL;
		try {
			ResultSet myResultSet;
			Class.forName("org.postgresql.Driver");
			String urlDB = "jdbc:postgresql://localhost:5432/finch";
			String user = "finch";
			String password = "finch";
			Connection connection = DriverManager.getConnection(urlDB, user, password);
			connection.setAutoCommit(true);
			System.out.println("***Conectado a la BBDD(psql) Finch***");
			System.out.println("----------------------------------");
			System.out.println("--Bienvenido a FINCH -UF3 2022----");
			while (!lock) {
				System.out.println("----------------------------------");
				System.out.println("--¿Qué acción quieres ejecutar?---");
				System.out.println("----------------------------------");
				System.out.println("- 1 -> Mostrar tablas de la BBDD");
				System.out.println("- 2 -> Ejecutar una orden de la BBDD");
				System.out.println("- 3 -> Ejecutar una TABLA de órdenes de la BBDD");
				System.out.println("- 4 -> Añadir una orden a la BBDD");
				System.out.println("- 5 -> Guardar la lista de órdenes actuales en una nueva tabla de la BBDD");
				System.out.println("- 6 -> Eliminar una orden de de una tabla de la BBDD");
				System.out.println("- 7 -> Eliminar una tabla de la BBDD");
				System.out.println("- 8 -> Crear BBDD (REALIZAR ANTES DE NADA)");
				System.out.println("- 0 -> Salir");
				Scanner s = new Scanner(System.in);
				option = s.nextInt();
				Statement myStatement = connection.createStatement();
				switch (option) {
				case 1:
					sentence = "SELECT * FROM pg_catalog.pg_tables WHERE schemaname = 'public';";
					myResultSet = myStatement.executeQuery(sentence);
					System.out.println("TABLAS EXISTENTES EN LA BBDD:");
					System.out.println("----------------------------");
					while (myResultSet.next()) {
						String tablaTemp = myResultSet.getString("tablename");
						System.out.println(" TABLA --> " + tablaTemp);
					}
					break;
				case 2:
					System.out.println("¿Qué tipo de órden quieres ejecutar? (W-S-A-D)");
					move = s.next().charAt(0);
					if (move == 'w' || move == 'W') {
						System.out.println("Has elegido avanzar. ¿Simple (1) o doble (2)?");
						moveLength = s.nextInt();
						if (moveLength == 1) {
							sentence = "SELECT duration,left_wheel, right_wheel FROM moveforward WHERE lower(moveType) = 'normal';";
							myResultSet = myStatement.executeQuery(sentence);
							while (myResultSet.next()) {
								order += String.valueOf(myResultSet.getInt("duration")) + " ";
								order += String.valueOf(myResultSet.getInt("left_wheel")) + " ";
								order += String.valueOf(myResultSet.getInt("right_wheel"));
							}
							FinchMove fm = new FinchMove(order, f1);
							order = "";
							// fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						} else {
							sentence = "SELECT duration,left_wheel, right_wheel FROM moveforward WHERE lower(moveType) = 'doble';";
							myResultSet = myStatement.executeQuery(sentence);
							while (myResultSet.next()) {
								order += String.valueOf(myResultSet.getInt("duration")) + " ";
								order += String.valueOf(myResultSet.getInt("left_wheel")) + " ";
								order += String.valueOf(myResultSet.getInt("right_wheel"));
							}
							FinchMove fm = new FinchMove(order, f1);
							order = "";
							// fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						}
					} else if (move == 'a' || move == 'A') {
						System.out.println("Has elegido girar a la izquierda. ¿45º (1) o 90º (2)?");
						moveLength = s.nextInt();
						if (moveLength == 1) {
							sentence = "SELECT duration,left_wheel, right_wheel FROM moveLeft WHERE lower(moveType) = 'giro45';";
							myResultSet = myStatement.executeQuery(sentence);
							while (myResultSet.next()) {
								order += String.valueOf(myResultSet.getInt("duration")) + " ";
								order += String.valueOf(myResultSet.getInt("left_wheel")) + " ";
								order += String.valueOf(myResultSet.getInt("right_wheel"));
							}
							FinchMove fm = new FinchMove(order, f1);
							order = "";
							// fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						} else {
							sentence = "SELECT duration,left_wheel, right_wheel FROM moveLeft WHERE lower(moveType) = 'giro90';";
							myResultSet = myStatement.executeQuery(sentence);
							while (myResultSet.next()) {
								order += String.valueOf(myResultSet.getInt("duration")) + " ";
								order += String.valueOf(myResultSet.getInt("left_wheel")) + " ";
								order += String.valueOf(myResultSet.getInt("right_wheel"));
							}
							FinchMove fm = new FinchMove(order, f1);
							order = "";
							// fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						}
					} else if (move == 'd' || move == 'D') {
						System.out.println("Has elegido girar a la derecha. ¿45º (1) o 90º (2)?");
						moveLength = s.nextInt();
						if (moveLength == 1) {
							sentence = "SELECT duration,left_wheel, right_wheel FROM moveright WHERE lower(moveType) = 'giro45';";
							myResultSet = myStatement.executeQuery(sentence);
							while (myResultSet.next()) {
								order += String.valueOf(myResultSet.getInt("duration")) + " ";
								order += String.valueOf(myResultSet.getInt("left_wheel")) + " ";
								order += String.valueOf(myResultSet.getInt("right_wheel"));
							}
							FinchMove fm = new FinchMove(order, f1);
							order = "";
							fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						} else {
							sentence = "SELECT duration,left_wheel, right_wheel FROM moveright WHERE lower(moveType) = 'giro90';";
							myResultSet = myStatement.executeQuery(sentence);
							while (myResultSet.next()) {
								order += String.valueOf(myResultSet.getInt("duration")) + " ";
								order += String.valueOf(myResultSet.getInt("left_wheel")) + " ";
								order += String.valueOf(myResultSet.getInt("right_wheel"));
							}
							FinchMove fm = new FinchMove(order, f1);
							order = "";
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
					} else if (move == 's' || move == 'S') {
						System.out.println("Has elegido retroceder. ¿Simple (1) o doble (2)?");
						moveLength = s.nextInt();
						if (moveLength == 1) {
							sentence = "SELECT duration,left_wheel, right_wheel FROM movebackward WHERE lower(moveType) = 'normal';";
							myResultSet = myStatement.executeQuery(sentence);
							while (myResultSet.next()) {
								order += String.valueOf(myResultSet.getInt("duration")) + " ";
								order += String.valueOf(myResultSet.getInt("left_wheel")) + " ";
								order += String.valueOf(myResultSet.getInt("right_wheel"));
							}
							FinchMove fm = new FinchMove(order, f1);
							order = "";
							fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						} else {
							sentence = "SELECT duration,left_wheel, right_wheel FROM movebackward WHERE lower(moveType) = 'doble';";
							myResultSet = myStatement.executeQuery(sentence);
							while (myResultSet.next()) {
								order += String.valueOf(myResultSet.getInt("duration")) + " ";
								order += String.valueOf(myResultSet.getInt("left_wheel")) + " ";
								order += String.valueOf(myResultSet.getInt("right_wheel"));
							}
							FinchMove fm = new FinchMove(order, f1);
							order = "";
							// fm.execute();
							System.out.println("¿Quieres añadir esta orden a una lista? (1 - Sí / 0 - No)");
							addList = s.nextInt();
							if (addList == 1) {
								fa1.addAction(fm);
								System.out.println("Orden Añadida!");
								System.out.println("Listado de órdenes actuales: \n");
								fa1.displayOrders();
							}
						}
					}
					break;
				case 3:
					sentence = "SELECT * FROM pg_catalog.pg_tables WHERE schemaname = 'public';";
					myResultSet = myStatement.executeQuery(sentence);
					System.out.println("TABLAS EXISTENTES EN LA BBDD:");
					System.out.println("----------------------------");
					while (myResultSet.next()) {
						System.out.println(" --> " + myResultSet.getString("tablename"));
					}
					System.out.println("----------------------------");
					System.out.println("¿Qué tabla quieres ejecutar?");
					Scanner s5 = new Scanner(System.in);
					execTabla = s5.nextLine();
					sentence = "SELECT * FROM " + execTabla + ";";
					myResultSet = myStatement.executeQuery(sentence);
					while (myResultSet.next()) {
						order += String.valueOf(myResultSet.getInt("duration")) + " ";
						order += String.valueOf(myResultSet.getInt("left_wheel")) + " ";
						order += String.valueOf(myResultSet.getInt("right_wheel"));
						// Ejecutamos un color u otro dependiendo del movimiento
						// Si las velocidades de las dos ruedas difieren (giro-ROJO)
						if (!(myResultSet.getInt("left_wheel") != myResultSet.getInt("right_wheel"))) {
							FinchNose fn = new FinchNose("255 0 0", f1);
							fn.execute();
							System.out.println("Rojo");
							// RECTO - AZUL
						} else {
							FinchNose fn = new FinchNose("0 0 255", f1);
							fn.execute();
							System.out.println("Azul");
						}
						FinchMove fm = new FinchMove(order, f1);
						System.out.println("--orden--");
						fm.execute();
						order = "";
					}
					break;

				case 4:
					System.out.println("¿Qué tipo de órden quieres añadir?(forward,backward,left,right)");
					Scanner s2 = new Scanner(System.in);
					añadirOrden = s.nextLine();
					añadirOrden = s.nextLine();

					if (añadirOrden.equals("forward")) {
						System.out.println("¿Duración del movimiento (en milisegundos)?");
						añadirOrden1 = s2.nextInt();
						System.out.println("¿Velocidad de las ruedas (de 0 a 255)?");
						añadirOrden2 = s2.nextInt();
						añadirOrden3 = s2.nextInt();
						insertSQL = "INSERT INTO moveforward VALUES ('move','" + Integer.toString(añadirOrden1) + "','"
								+ Integer.toString(añadirOrden2) + "','" + Integer.toString(añadirOrden3) + "');";
						myStatement.executeUpdate(insertSQL);
						System.out.println("Añadido correctamente");
					} else if (añadirOrden.equals("backward")) {
						System.out.println("¿Duración del movimiento (en milisegundos)?");
						añadirOrden1 = s2.nextInt();
						System.out.println("¿Velocidad de las ruedas (de 0 a 255)?");
						añadirOrden2 = s2.nextInt();
						añadirOrden3 = s2.nextInt();
						insertSQL = "INSERT INTO movebackward VALUES ('move','" + Integer.toString(añadirOrden1) + "','"
								+ Integer.toString(añadirOrden2) + "','" + Integer.toString(añadirOrden3) + "');";
						myStatement.executeUpdate(insertSQL);
						System.out.println("Añadido correctamente");
					} else if (añadirOrden.equals("left")) {
						System.out.println("¿Duración del movimiento (en milisegundos)?");
						añadirOrden1 = s2.nextInt();
						System.out.println(
								"Para los giros puedes añadir una velocidad a una rueda y la misma pero en negatio en la otra");
						System.out.println("o bien en una 0 y en la otra alguna velocidad");
						System.out.println("¿Velocidad de la rueda izquierda?");
						añadirOrden1 = s2.nextInt();
						System.out.println("¿Velocidad de la rueda derecha?");
						añadirOrden2 = s2.nextInt();
						insertSQL = "INSERT INTO moveleft VALUES ('move','" + Integer.toString(añadirOrden1) + "','"
								+ Integer.toString(añadirOrden2) + "','" + Integer.toString(añadirOrden3) + "');";
						myStatement.executeUpdate(insertSQL);
						System.out.println("Añadido correctamente");
					} else if (añadirOrden.equals("right")) {
						System.out.println("¿Duración del movimiento (en milisegundos)?");
						añadirOrden1 = s2.nextInt();
						System.out.println(
								"Para los giros puedes añadir una velocidad a una rueda y la misma pero en negatio en la otra");
						System.out.println("o bien en una 0 y en la otra alguna velocidad");
						System.out.println("¿Velocidad de la rueda izquierda?");
						añadirOrden1 = s2.nextInt();
						System.out.println("¿Velocidad de la rueda derecha?");
						añadirOrden2 = s2.nextInt();
						insertSQL = "INSERT INTO moveright VALUES ('move','" + Integer.toString(añadirOrden1) + "','"
								+ Integer.toString(añadirOrden2) + "','" + Integer.toString(añadirOrden3) + "');";
						myStatement.executeUpdate(insertSQL);
						System.out.println("Añadido correctamente");
					}
					break;

				case 5:
					System.out.println("¿Qué nombre tendrá la nueva tabla de órdenes? \n");
					Scanner s3 = new Scanner(System.in);
					newTable = s3.nextLine();
					try {
						insertSQL = "CREATE TABLE " + newTable
								+ " ( moveType varchar(20), duration int, left_wheel int, right_wheel int);";
						myStatement.executeUpdate(insertSQL);
						for (FinchAction f : fa1.getActions()) {
							ordersSQL = f.toString().split(" ");
							insertSQL = "INSERT INTO " + newTable + " VALUES ('" + ordersSQL[0] + "',"
									+ Integer.parseInt(ordersSQL[1]) + "," + Integer.parseInt(ordersSQL[2]) + ","
									+ Integer.parseInt(ordersSQL[3]) + ");";
							myStatement.executeUpdate(insertSQL);
						}
					} catch (SQLException e) {
						System.out.println("Ha habido un error en la inserción");
						e.printStackTrace();
					} catch (Exception e) {
						System.out.println("ERROR : Ya existe una tabla con ese nombre");
						e.printStackTrace();
					}
					System.out.println("TABLA CREADA CORRECTAMENTE");
					break;
				case 6:
					fa1.displayOrders2();
					System.out.println("¿ Qué orden quieres borrar ? : \n");
					int remove = s.nextInt();
					fa1.getActions().remove(remove - 1);
					System.out.println("Órden borrada!");
					break;
				case 7:
					System.out.println("¿ Qué tabla quieres borrar ? : \n");
					Scanner s4 = new Scanner(System.in);
					newTable = s4.nextLine();
					insertSQL = "DROP TABLE " + newTable + ";";
					myStatement.executeUpdate(insertSQL);
					System.out.println("Tabla borrada!");
					break;
				case 8:
					Scanner s8 = new Scanner(System.in);
					System.out.println("¿ Como se llama la BBDD ? : \n");
					newBBDD = s8.nextLine();
					insertSQL = "DROP DATABASE IF EXISTS " + newBBDD + ";";
					myStatement.executeUpdate(insertSQL);
					insertSQL = "CREATE DATABASE " + newBBDD + ";";
					myStatement.executeUpdate(insertSQL);
					System.out.println("BBDD Creada");
					connection.close();
					urlDB = "jdbc:postgresql://localhost:5432/" + newBBDD;
					connection = DriverManager.getConnection(urlDB, user, password);
					connection.setAutoCommit(true);
					System.out.println("***Conectado a la BBDD(psql) " + newBBDD + "***");

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
			connection.close();
		} catch (SQLException e) {
			System.out.println("Error connection");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
