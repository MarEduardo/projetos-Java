package dados;

public class TestesClientes {

	public static void main(String[] args) {
		if(ClienteDAO.criarTabelaCliente()) {
			System.out.println("Tabela Cliente criada com sucesso!");
		}
		else { System.out.println("deu não chefe"); }

	}

}
