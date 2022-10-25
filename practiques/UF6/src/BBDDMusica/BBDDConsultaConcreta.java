package BBDDMusica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BBDDConsultaConcreta {
	public static void main(String[] args) {
		System.out.println("Try to connect");		
		try {					
		String sentence;
		ResultSet myResultSet;
		PreparedStatement myStatement;
		Statement myStatement2;
		Class.forName("org.postgresql.Driver");
		String urlDB = "jdbc:postgresql://localhost:5432/musica";
		String user = "javaproject";
		String password = "jupiter";
		Connection connection = DriverManager.getConnection(urlDB, user, password);
		
		// Consulta con prepared statement		
		System.out.println("Create SQL");
		
		sentence = "SELECT id, name FROM songs WHERE id=? AND name=?";
		System.out.println("Prepared Statement");
		// CRear Statement
		myStatement = connection.prepareStatement(sentence);
		// Establir parametres
		System.out.println("Establir parametres");
		// Informa el 2 
		myStatement.setInt(1,2);
		// Informa
		myStatement.setString(2, "Tonight, tonight");
		myResultSet = myStatement.executeQuery();
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
