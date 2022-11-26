package lojaVirtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTOS WHERE ID = ?");

		stm.setString(1, "7");
		Integer linhasModificadas = stm.getUpdateCount();
		System.out.println("Quantidade de linhas que foram modificadas:" + linhasModificadas);
	}
}