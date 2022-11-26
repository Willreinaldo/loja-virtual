package lojaVirtual;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		Statement stm = connection.createStatement();
		
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Fone de ouvido', 'Fone de ouvido Bluetooth da marca Apple')", Statement.RETURN_GENERATED_KEYS);
		ResultSet rst = stm.getGeneratedKeys();
		
		System.out.println("INSERÇÃO FEITA!");
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O ID criado foi : " + id);

		}
	}

}
