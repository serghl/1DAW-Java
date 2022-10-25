package BBDDMusica;

import java.sql.*;

public class BBDDConsulta {

	public static void main(String[] args) {
		System.out.println("Try to connect");		
		try {					
		String sentence;
		ResultSet myResultSet;
		Class.forName("org.postgresql.Driver");
		String urlDB = "jdbc:postgresql://localhost:5432/musica";
		String user = "javaproject";
		String password = "jupiter";
		Connection connection = DriverManager.getConnection(urlDB, user, password);
		connection.setAutoCommit(true);
		System.out.println("Create Statement");
		Statement myStatement = connection.createStatement();
		System.out.println("Create SQL");

		sentence = "SELECT * FROM songs";
		myResultSet = myStatement.executeQuery(sentence);
		System.out.println("myResultSet: " + myResultSet);
		// Leer el resultado
		while (myResultSet.next()) {
			if (!myResultSet.wasNull())
				System.out.println("id = "+myResultSet.getInt("id") + " " + "name = " + myResultSet.getString("name"));
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

