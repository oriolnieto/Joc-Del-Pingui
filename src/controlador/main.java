package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class main  {
	private static String linkBBDD = "jdbc:oracle:thin:@//192.168.3.26:1521/XEPDB2";
	private static String username = "DM2425_PIN_GRUP03";
	private static String password = "AAANT03";
//aa

	public static Connection conectarBD() {
		Connection con = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(linkBBDD, username, password);
		} catch (ClassNotFoundException e) {
			System.out.println("No s'ha trobat el driver " + e);
		} catch (SQLException e) {
			System.out.println("Error en las credencials o en la URL " + e);
		}

		System.out.println("Connexió efectuada a la base de dades.");

		return con;
	}

    public static void main(String[] args) {
    	conectarBD();
    }
}