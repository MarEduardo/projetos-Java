package dados;

public class Item {
	String nomeProduto;
	int qtde;
	double valorUnitario;
	double desconto;
	boolean ativarDesc;
	public ativarDesconto(){
		ativarDesc = true;
	}
	public desativarDesconto(){
		ativarDesc = false;
	}
	public item(){}
	public item(String nomeProduto, int qtde, double valorUnitario, double desconto)
	{
		Produtos prod = new Produtos();
	public double getQtdeEstoque() {
		return prod.getQtdeEstoque();
	}
		public double getPrecoVenda() {
		return prod.getPrecoVenda();
	}
		
	}
	
	
}
