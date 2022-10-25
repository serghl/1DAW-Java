package BBDDMusica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class BBDDMain {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Try to connect");
		boolean found = false;
		try {
			String insertSQL;
			// String sentence
			// ResultSet myResultSet;
			Class.forName("org.postgresql.Driver");
			String urlDB = "jdbc:postgresql://localhost:5432/musica";
			String user = "javaproject";
			String password = "jupiter";
			Connection connection = DriverManager.getConnection(urlDB, user, password);
			connection.setAutoCommit(true);
			System.out.println("Create Statement");
			Statement myStatement = connection.createStatement();
			System.out.println("Create SQL");

			insertSQL = "INSERT INTO songs (id, name) VALUES(1, 'Janine')";
			myStatement.executeUpdate(insertSQL);
			insertSQL = "INSERT INTO songs (id, name) VALUES(2, 'Tonight, tonight')";
			myStatement.executeUpdate(insertSQL);
			insertSQL = "INSERT INTO songs (id, name) VALUES(3, 'Serenade')";
			myStatement.executeUpdate(insertSQL);
			insertSQL = "INSERT INTO songs (id, name) VALUES(4, 'Hungry Hearts')";
			myStatement.executeUpdate(insertSQL);
			System.out.println("Insert");

			while (!found) {
				Scanner sc = new Scanner(System.in);
				System.out.println("ID?");
				int id = sc.nextInt();
				System.out.println("CANCION?");
				String cancion = sc.nextLine();
				insertSQL = "INSERT INTO songs (id, name) VALUES(" + id + ",'" + cancion + "')";
				myStatement.executeUpdate(insertSQL);
				System.out.println("Insertar más filas? (1-si/0-no)");
				int choice = sc.nextInt();
				if (choice == 0) {
					found = true;
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
*/
}
