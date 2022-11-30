package lojaVirtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();
		PreparedStatement stm = connection.prepareStatement(
				"INSERT INTO PRODUTO (nome, descricao) VALUES ('Fone de ouvido', 'Fone de ouvido Bluetooth da marca Apple')",
				Statement.RETURN_GENERATED_KEYS);
		adicionarVariavel("Notebook", "Noteboook Lenovo", stm);
		adicionarVariavel("TV", "SmarTV 45 polegadas", stm);
		adicionarVariavel("Mouse", "Mouse sem fio", stm);

	}
	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm ) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);
	}

}
