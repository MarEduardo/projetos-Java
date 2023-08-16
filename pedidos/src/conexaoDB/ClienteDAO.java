package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;

import conexaoDB.Conexao;

public class ClienteDAO {
	public static boolean criarTabelaCliente() {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			String sql = "CREATE TABLE cliente("
					+ "codCliente INT PRIMARY KEY AUTO_INCREMENT, "
					+ "nome VARCHAR(50) NOT NULL, "
					+ "email VARCHAR(50) NOT NULL, "
					+ "endereco VARCHAR(100), "
					+ "cidade VARCHAR(30), "
					+ "estado CHAR(2), "
					+ "fone VARCHAR(15));";
			conn = Conexao.criarConexao();
			stat = conn.prepareStatement(sql);
			stat.execute();
			return true;
		}
		catch(Exception e) {
			System.out.println("ERRO: A tabela cliente não foi criada. - " + e.getMessage());
			return false;
		} finally {
			Conexao.fecharConexao(conn, stat);
		}
	}
	
	public static boolean excluirTabelaCliente() {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			String sql = "DROP TABLE cliente";
			conn = Conexao.criarConexao();
			stat = conn.prepareStatement(sql);
			stat.execute();
			return true;
		} catch(Exception e) {
			System.out.println("ERRO: A tabela cliente não foi excluida. -"+ e.getMessage());
			return false;
		} finally {
			Conexao.fecharConexao(conn, stat);
		}
	}
	

}
