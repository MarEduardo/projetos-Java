package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import conexaoDB.Conexao;

public class ProdutosDAO {
	public static boolean criarTabelaProdutos() {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			String sql = "CREATE TABLE produtos("
					+ "codProduto INT PRIMARY KEY AUTO_INCREMENT, "
					+ "nome VARCHAR(50) NOT NULL, "
					+ "precoCusto DOUBLE(15) NOT NULL, "
					+ "precoVenda DOUBLE(15), "
					+ "qtdeEstoque INT(10), "
					+ "unidade INT(10), "
					+ "estoqueMin INT(10));"
					+ "categoria VARCHAR(50), "
					+ "markup DOUBLE(10), "
					+ "ativo BOOLEAN NOT NULL)); ";
			conn = Conexao.criarConexao();
			stat = conn.prepareStatement(sql);
			stat.execute();
			return true;
		}
		catch(Exception e) {
			System.out.println("ERRO: A tabela produto não foi criada. - " + e.getMessage());
			return false;
		} finally {
			Conexao.fecharConexao(conn, stat);
		}
	}
	
	public static boolean excluirTabelaProdutos() {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			String sql = "DROP TABLE produtos";
			conn = Conexao.criarConexao();
			stat = conn.prepareStatement(sql);
			stat.execute();
			return true;
		} catch(Exception e) {
			System.out.println("ERRO: A tabela produto não foi excluida. -"+ e.getMessage());
			return false;
		} finally {
			Conexao.fecharConexao(conn, stat);
		}
	}
	
	public static boolean inserirProdutos(Produtos prod) {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			String sql = "INSERT INTO" + "Produtos( nome, precoCusto, precoVenda, qtdeEstoque, unidade, estoqueMin, categoria, markUp, ativo) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
			
			conn = Conexao.criarConexao();
			stat = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			stat.setString(1, prod.getNome());
			stat.setDouble(2, prod.getPrecoCusto());
			stat.setDouble(3, prod.getPrecoVenda());
			stat.setInt(4, prod.getQtdeEstoque());
			stat.setInt(5, prod.getUnidade());
			stat.setInt(6, prod.getEstoqueMin());
			stat.setString(7, prod.getCategoria());
			stat.setDouble(8, prod.getMarkUp());
			stat.setBoolean(9, prod.isAtivo());
			stat.execute();		
			ResultSet rs = stat.getGeneratedKeys();
			if (rs.next()) {
				prod.setCodProduto(rs.getInt(1));
			}
			
			return true;
			
		}
		
		catch (Exception e) {
			System.out.println("ERRO: Produto não inserido. " + e.getMessage());
			return false;
		}
		
		finally {
			Conexao.fecharConexao(conn, stat);
		}
	}
	
	public static boolean alterarProdutos(Produtos prod) {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			String sql = "UPDATE produtos SET "
					+ "nome=?, "
					+ "precoCusto=?, "
					+ "precoVenda=?, "
					+ "qtdeEstoque=?, "
					+ "unidade=?, "
					+ "estoqueMin=?, "
					+ "categoria=?, "
					+ "markUp=?, "
					+ "ativo=?, "
					+ "WHERE CodProduto=?";
			
			conn = Conexao.criarConexao();
			stat = conn.prepareStatement(sql);
			stat.setString(1, prod.getNome());
			stat.setDouble(2, prod.getPrecoCusto());
			stat.setDouble(3, prod.getPrecoVenda());
			stat.setInt(4, prod.getQtdeEstoque());
			stat.setInt(5, prod.getUnidade());
			stat.setInt(6, prod.getEstoqueMin());
			stat.setString(7, prod.getCategoria());
			stat.setDouble(8, prod.getMarkUp());
			stat.setBoolean(9, prod.isAtivo());
			stat.setInt(7, prod.getCodProduto());
			stat.execute();	
			return true;
		} catch (Exception e) {
			System.out.println("ERRO: produto não alterado. " + e.getMessage());
			return false;
		} finally {
			Conexao.fecharConexao(conn, stat);
		}
	}
	
	public static boolean excluirProdutos(int cod) {
		Connection conn = null;
		PreparedStatement stat = null;
		try {
			String sql = "DELETE FROM produtos "
					+ "WHERE codProduto=?";
			
			conn = Conexao.criarConexao();
			stat = conn.prepareStatement(sql);
			stat.setInt(1, cod);
			stat.execute();
			
			return true;
		} catch(Exception e) {
			System.out.println("ERRO: produtos não excluído. " + e.getMessage());
			return false;
			} finally {
				Conexao.fecharConexao(conn, stat);
			}
	}
	
	public static Produtos consultarProdutos(int cod) {
		Produtos prod = null;
		Connection conn = null;
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM produtos WHERE codProduto=?;";
			conn = Conexao.criarConexao();
			stat = conn.prepareStatement(sql);
			stat.setInt(1, cod);
			rs = stat.executeQuery();
			if (rs.next()) {
				prod = new Produtos();
				prod.setCodProduto(rs.getInt("codProduto"));
				prod.setNome(rs.getString("nome"));
				prod.setPrecoCusto(rs.getDouble("precoCusto"));
				prod.setPrecoVenda(rs.getDouble("precoVenda"));
				prod.setQtdeEstoque(rs.getInt("qtdeEstoque"));
				prod.setUnidade(rs.getInt("unidade"));
				prod.setCategoria(rs.getString("categoria"));
				prod.setMarkUp(rs.getDouble("markUp"));
				prod.isAtivo();
			}
		} catch (Exception e) {
				System.out.println("ERRO na consulta do produto. " + e.getMessage());
			} finally {
				Conexao.fecharConexao(conn, stat, rs);
			}
			return prod;
		
	}
	

}

