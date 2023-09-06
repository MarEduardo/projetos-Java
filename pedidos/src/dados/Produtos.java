package dados;

public class Produtos {
	private int codProduto = 0;
	private String nome = "";
	private double precoCusto = 0;
	private double precoVenda = 0;
	private int qtdeEstoque = 0;
	private int unidade = 0;
	private int estoqueMin = 0;
	private String categoria = "";
	private double markUp = 0;
	private boolean ativo = true;
	
	public Produtos() {
		
	}
	public Produtos(int codProduto, String nome, String categoria) {
		this.codProduto = codProduto;
		this.nome = nome;
		this.categoria = categoria;
	}
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public int getQtdeEstoque() {
		return qtdeEstoque;
	}
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	public int getUnidade() {
		return unidade;
	}
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	public int getEstoqueMin() {
		return estoqueMin;
	}
	public void setEstoqueMin(int estoqueMin) {
		this.estoqueMin = estoqueMin;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getMarkUp() {
		return markUp;
	}
	public void setMarkUp(double markUp) {
		this.markUp = markUp;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	@Override
	public String toString() {
		return "Produtos [codProduto=" + codProduto + ", nome=" + nome + ", precoCusto=" + precoCusto + ", precoVenda="
				+ precoVenda + ", qtdeEstoque=" + qtdeEstoque + ", unidade=" + unidade + ", estoqueMin=" + estoqueMin
				+ ", categoria=" + categoria + ", markUp=" + markUp + ", ativo=" + ativo + "]";
	}
	
	public void incluirEstoq(int qte) {
		qte=1;
		this.qtdeEstoque+=qte;
		System.out.println("Quantidade adicionada de " + nome + "!");
		System.out.println("quantidade atual do produto " + nome + " é de: " + qtdeEstoque);
	}
	
	public void retirarEstoq(int qte) {
		qte = 1;
		this.qtdeEstoque -= qte;
		System.out.println("Quantidade removida de " + nome + "!");
		System.out.println("quantidade atual do produto " + nome + " é de: " + qtdeEstoque);
	}
	
	public void calcularNovoPrcVnd() {
		double margemCusto = 0;
		margemCusto = precoVenda + precoCusto;
	}
	
	public void calcularNovoPrcVnd (double perct) {
		double margemCusto =0;
		margemCusto = precoVenda + precoCusto;
		markUp = 100 / (margemCusto - (precoCusto + margemCusto));
		precoVenda = markUp * precoCusto;
		System.out.println("O preço de venda do produto " + nome + " é de: " + precoVenda + "reais.");
	}
}
