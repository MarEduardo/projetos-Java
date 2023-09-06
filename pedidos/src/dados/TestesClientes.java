package dados;

import java.util.ArrayList;

public class TestesClientes {

	public static void main(String[] args) {
		
		if(ClienteDAO.criarTabelaCliente()) {
			System.out.println("Tabela Cliente criada com sucesso!");
		}
		else { System.out.println("deu não chefe"); 
		}
		
		if(ClienteDAO.excluirTabelaCliente()) {
			System.out.println("Tabela Cliente criada com sucesso!");
		}
		else { System.out.println("deu não chefe"); 
		}
		
		Cliente cli01 = new Cliente();
		cli01.setNome("Marcelo");
		cli01.setEmail("marcelo@gmail.com");
		cli01.setEndereco("Rua sei la oque, 245");
		cli01.setCidade("Belo Horizonte");
		cli01.setEstado("MG");
		cli01.setFone("3191234567");
		ClienteDAO.inserirCliente(cli01);
		System.out.println(cli01);
		
		Cliente cli02 = new Cliente();
		cli02.setNome("Alex");
		cli02.setEmail("alex@gmail.com");
		cli02.setEndereco("Rua não sei aonde, 401");
		cli02.setCidade("Belo Horizonte");
		cli02.setEstado("MG");
		cli02.setFone("3198765432");
		ClienteDAO.inserirCliente(cli02);
		System.out.println(cli02);
		
		Cliente cli03 = new Cliente();
		cli01.setNome("Marcelo Eduardo");
		cli01.setEmail("marceloedu@gmail.com");
		cli01.setEndereco("Rua sei la oque, 298");
		cli01.setCidade("Belo Horizonte");
		cli01.setEstado("MG");
		cli01.setFone("3191234987");
		ClienteDAO.alterarcliente(cli01);
		System.out.println(cli01);
		
		ClienteDAO.excluirCliente(1);
		
		Cliente cli = ClienteDAO.consultarCliente(1);
		System.out.println(cli);
		
		ArrayList<Cliente> listaCli = ClienteDAO.consultarCliente();
		
		for(Cliente cli2 : listaCli) {
			System.out.println(cli2);
		
		}
	

	}
}

