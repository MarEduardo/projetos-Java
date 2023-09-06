package dados;

public class Item {
	Produtos prod = new Produtos();
	public double getQtdeEstoque() {
		return prod.getQtdeEstoque();
	}
	public double getPrecoVenda() {
		return prod.getPrecoVenda();
	}
	double Desconto = prod.getPrecoVenda();
	boolean ativarDesc = true;
	private double ativarDesconto(double desc) {
		if (ativarDesc == false) {
			Desconto = 0;
		}
		else {
			Desconto = desc;
		}
	}
}
