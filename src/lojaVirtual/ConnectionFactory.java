package lojaVirtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection recuperarConexao() throws SQLException {
		System.out.println("CRIANDO CONEXÃO");;
		return DriverManager.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "williammonteiro10");

	}
}
